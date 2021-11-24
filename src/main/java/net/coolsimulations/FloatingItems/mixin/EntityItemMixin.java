package net.coolsimulations.FloatingItems.mixin;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import net.coolsimulations.FloatingItems.FIConfig;
import net.coolsimulations.FloatingItems.FIConfig.FIConfigItem;
import net.minecraft.block.BlockLiquid;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialLiquid;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraftforge.oredict.OreDictionary;

@Mixin(EntityItem.class)
public abstract class EntityItemMixin extends Entity {

	public EntityItemMixin(World worldIn) {
		super(worldIn);
	}

	@Shadow
	public abstract ItemStack getEntityItem();

	@Inject(at = @At("HEAD"), method = "onUpdate", cancellable = true)
	public void onUpdate(CallbackInfo info) {

		boolean shouldFloat = false;

		if (!getEntityItem().getItem().onEntityItemUpdate(((EntityItem) (Object) this)) && this.getEntityItem() != null) {

			if(FIConfig.blacklistItems != null && FIConfig.blacklistItems.length >= 1) {
				for(FIConfigItem blacklistItem : FIConfig.blacklistItems) {
					if(blacklistItem.getItem().equals(this.getEntityItem().getItem())) {

						if(blacklistItem.getMeta() == this.getEntityItem().getMetadata()) {
							return;
						} else {
							shouldFloat = true;
						}
					}
				}
			}
			
			if(!shouldFloat && FIConfig.blacklistRegistryItems != null && FIConfig.blacklistRegistryItems.length >= 1) {
				for(String blacklistItem : FIConfig.blacklistRegistryItems) {
					if(blacklistItem.equals(this.getEntityItem().getItem().getRegistryName().toString())) {
						return;
					}
				}
			}
			
			if(!shouldFloat && FIConfig.blacklistOreDict != null && FIConfig.blacklistOreDict.length >= 1) {
					for(String oreDict : FIConfig.blacklistOreDict) {
						
						String oreDictEntry = oreDict.replaceAll("[^A-Za-z0-9 ]", "");
						
						if(OreDictionary.getOres(oreDictEntry).size() > 0) {

							for(ItemStack stack : OreDictionary.getOres(oreDictEntry)) {

								if(stack.getItem().equals(this.getEntityItem().getItem())) {

									if(stack.getMetadata() == this.getEntityItem().getMetadata()) {
										return;
									} else {
										shouldFloat = true;
									}
								} else {
									shouldFloat = true;
								}
							}
						} else {
							shouldFloat = true;
						}
					}
				} else {
					shouldFloat = true;
				}

			if(shouldFloat) {

				IBlockState state = this.worldObj.getBlockState(this.getPosition());
				float eye = this.getEyeHeight() - 0.11111111F;

				if ((state.getMaterial().isLiquid() && state.getMaterial() != Material.LAVA) && BlockLiquid.getLiquidHeightPercent(state.getValue(BlockLiquid.LEVEL).intValue()) > eye)
				{
					setUnderWaterMovement(this);
					if (!this.hasNoGravity()) {
						this.motionY += 0.03999999910593033D;
					}
				}
			}
		}
	}

	@Unique
	private static void setUnderWaterMovement(Entity entity) {

		entity.motionX *= 0.95D;
		entity.motionY += entity.motionY < 0.06D ? 5.0E-4D : 0.0D;
		entity.motionZ *= 0.95D;
	}
}

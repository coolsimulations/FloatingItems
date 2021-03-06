package net.coolsimulations.FloatingItems;

public class FILang {
	
	public static String getTranslations(String text) {

		String lang;

		if(FIConfig.serverLang != null)
			lang = FIConfig.serverLang.toLowerCase();
		else
			lang = "en_us";

		if(lang.equals("af_za")) {

			return afrikaansLang(text);
		}

		if(lang.equals("ar_sa")) {

			return arabicLang(text);
		}

		if(lang.equals("be_by")) {

			return belarusianLang(text);
		}

		if(lang.equals("bg_bg")) {

			return bulgarianLang(text);
		}

		if(lang.equals("bs_ba")) {

			return bosnianLang(text);
		}

		if(lang.equals("ca_es")) {

			return catalanLang(text);
		}

		if(lang.equals("cs_cz")) {

			return czechLang(text);
		}

		if(lang.equals("cy_gb")) {

			return welshLang(text);
		}

		if(lang.equals("da_dk")) {

			return danishLang(text);
		}

		if(lang.equals("de_at") || lang.equals("de_alg") || lang.equals("de_ch") || lang.equals("de_de")) {

			return germanLang(text);
		}

		if(lang.equals("el_gr")) {

			return greekLang(text);
		}

		if(lang.equals("en_us") || lang.equals("en_au") || lang.equals("en_ca") || lang.equals("en_gb") || lang.equals("en_nz")) {

			return englishUSLang(text);
		}

		if(lang.equals("en_7s") || lang.equals("en_pt")) {

			return englishPTLang(text);
		}

		if(lang.equals("en_ud")) {

			return englishUDLang(text);
		}

		if(lang.equals("en_ws")) {

			return englishWSLang(text);
		}

		if(lang.equals("eo") || lang.equals("eo_uy")) {

			return esperantoLang(text);
		}

		if(lang.equals("es_ar") || lang.equals("es_cl") || lang.equals("es_es") || lang.equals("es_mx") || lang.equals("es_uy") || lang.equals("es_ve")) {

			return spanishLang(text);
		}

		if(lang.equals("fi_fi")) {

			return finnishLang(text);
		}

		if(lang.equals("fr_fr")) {

			return frenchLang(text);
		}

		if(lang.equals("hr_hr")) {

			return croatianLang(text);
		}

		if(lang.equals("hu_hu")) {

			return hungarianLang(text);
		}

		if(lang.equals("it_it")) {

			return italianLang(text);
		}

		if(lang.equals("ja_jp")) {

			return japaneseLang(text);
		}

		if(lang.equals("ko_kr")) {

			return koreanLang(text);
		}

		if(lang.equals("nl_nl")) {

			return dutchLang(text);
		}

		if(lang.equals("pl_pl")) {

			return polishLang(text);
		}

		if(lang.equals("pt_br") || lang.equals("pt_pt")) {

			return portugueseLang(text);
		}

		if(lang.equals("ru_ru")) {

			return russianLang(text);
		}

		if(lang.equals("sv_se")) {

			return swedishLang(text);
		}

		if(lang.equals("th_th")) {

			return thaiLang(text);
		}

		if(lang.equals("tr_tr")) {

			return turkishLang(text);
		}

		if(lang.equals("zh_cn")) {

			return chineseSimpLang(text);
		}

		if(lang.equals("zh_tw")) {

			return chineseTradLang(text);
		}

		return englishUSLang(text);
	}
	
	public static String afrikaansLang(String text) {
		
		if(text == "floatingitems.update.display1") {
			
			return "Dit is 'n ou weergawe van %s! Weergawe %s is nou beskikbaar!";
		}
		
		if(text == "floatingitems.update.display2") {
			
			return "Klik asseblief om af te laai!";
		}
		
		if(text == "floatingitems.update.display3") {
			
			return "%s ondersteun nie meer Minecraft Weergawe %s nie! Werk asseblief op na 'n nuwer Minecraft-weergawe vir meer funksies!";
		}
		
		if(text == "fi.configgui.title") {
			
			return FIReference.MOD_NAME + " Konfig";
		}
		
		return text;
	}
	
	public static String arabicLang(String text) {
		
		if(text == "floatingitems.update.display1") {
			
			return "?????? ???????? ?????????? ???? %s! ?????????????? %s ???????? ????????!";
		}
		
		if(text == "floatingitems.update.display2") {
			
			return "???????? ?????????? ??????????????!";
		}
		
		if(text == "floatingitems.update.display3") {
			
			return "???? ?????? %s ???????? ?????????? Minecraft %s! ???????? ?????????????? ?????? ???????? ?????????? ???????? ?????????? ?????????? ???? ??????????????!";
		}
		
		if(text == "fi.configgui.title") {
			
			return FIReference.MOD_NAME + "?????????????? ";
		}
		
		return text;
	}
	
	public static String belarusianLang(String text) {
		
		if(text == "floatingitems.update.display1") {
			
			return "???????? ???????????? ???????????? %s! ???????????? %s ?????????? ????????????????!";
		}
		
		if(text == "floatingitems.update.display2") {
			
			return "???????? ??????????, ??????????????????, ?????? ??????????????????!";
		}
		
		if(text == "floatingitems.update.display3") {
			
			return "???? %s ?????????? ???? ???????????????????????? Minecraft ???????????? %s! ???????????????????? ???? ?????????? ?????????? ???????????? Minecraft ?????????? ??????????????????????!";
		}
		
		if(text == "fi.configgui.title") {
			
			return FIReference.MOD_NAME + " ????????????";
		}
		
		return text;
	}
	
	public static String bulgarianLang(String text) {
		
		if(text == "floatingitems.update.display1") {
			
			return "???????? ?? ?????????? ???????????? ???? %s! ???????? ?? ?????????????? ???????????? %s!";
		}
		
		if(text == "floatingitems.update.display2") {
			
			return "????????, ????????????????, ???? ???? ??????????????????!";
		}
		
		if(text == "floatingitems.update.display3") {
			
			return "%s ???????? ???? ???????????????? Minecraft ???????????? %s! ????????, ???????????????????????????? ???? ????-???????? ???????????? ???? Minecraft ???? ???????????? ??????????????!";
		}
		
		if(text == "fi.configgui.title") {
			
			return FIReference.MOD_NAME + " ??????????????????????????";
		}
		
		return text;
	}
	
	public static String bosnianLang(String text) {
		
		if(text == "floatingitems.update.display1") {
			
			return "Ovo je stara verzija %s! Verzija %s je sada dostupna!";
		}
		
		if(text == "floatingitems.update.display2") {
			
			return "Molimo kliknite za preuzmete!";
		}
		
		if(text == "floatingitems.update.display3") {
			
			return "%s vi??e ne podr??ava Minecraft Verziju %s! Molimo vas da a??urirate na noviju Verziju Minecraft za vi??e mogu??nosti!";
		}
		
		if(text == "fi.configgui.title") {
			
			return FIReference.MOD_NAME + " Config";
		}
		
		return text;
	}
	
	public static String catalanLang(String text) {
		
		if(text == "floatingitems.update.display1") {
			
			return "Aquesta ??s una versi?? antiga de %s! La Versi?? %s ja est?? disponible.";
		}
		
		if(text == "floatingitems.update.display2") {
			
			return "Feu clic per baixar!";
		}
		
		if(text == "floatingitems.update.display3") {
			
			return "%s ja no admet la Versi?? Minecraft %s! Actualitzeu-vos a una nova Versi?? de Minecraft per obtenir m??s funcions.";
		}
		
		if(text == "fi.configgui.title") {
			
			return FIReference.MOD_NAME + " Config";
		}
		
		return text;
	}
	
	public static String czechLang(String text) {
		
		if(text == "floatingitems.update.display1") {
			
			return "Toto je star?? verze %s! Verze %s je nyn?? k dispozici!";
		}
		
		if(text == "floatingitems.update.display2") {
			
			return "Pros??m klikn??te pro sta??en??!";
		}
		
		if(text == "floatingitems.update.display3") {
			
			return "%s ji?? nepodporuje Verzi Minecraft %s! Aktualizujte pros??m na nov??j???? Verzi Minecraft pro dal???? funkce!";
		}
		
		if(text == "fi.configgui.title") {
			
			return FIReference.MOD_NAME + " Konfigurace";
		}
		
		return text;
	}
	
	public static String welshLang(String text) {
		
		if(text == "floatingitems.update.display1") {
			
			return "Mae hon yn hen Fersiwn o %s! Mae Fersiwn %s nawr ar gael!";
		}
		
		if(text == "floatingitems.update.display2") {
			
			return "Cliciwch i lawrlwytho!";
		}
		
		if(text == "floatingitems.update.display3") {
			
			return "Dydy %s ddim yn cefnogi'r gwaith ar y Minecraft Fersiwn %s Diweddarwch at Fersiwn Minecraft mwy newydd ar gyfer mwy o nodweddion!";
		}
		
		if(text == "fi.configgui.title") {
			
			return FIReference.MOD_NAME + " Ffurfweddu";
		}
		
		return text;
	}
	
	public static String danishLang(String text) {
		
		if(text == "floatingitems.update.display1") {
			
			return "Dette er en gammel Version af %s! Version %s er nu tilg??ngelig!";
		}
		
		if(text == "floatingitems.update.display2") {
			
			return "Venligst klik for at downloade!";
		}
		
		if(text == "floatingitems.update.display3") {
			
			return "%s underst??tter ikke l??ngere Minecraft Version %s! Opdater venligst til en nyere Minecraft Version for flere funktioner!";
		}
		
		if(text == "fi.configgui.title") {
			
			return FIReference.MOD_NAME + " Konfig";
		}
		
		return text;
	}
	
	public static String germanLang(String text) {
		
		if(text == "floatingitems.update.display1") {
			
			return "Dies ist eine alte Version von %s! Version %s ist jetzt verf??gbar!";
		}
		
		if(text == "floatingitems.update.display2") {
			
			return "Zum Download bitte klicken!";
		}
		
		if(text == "floatingitems.update.display3") {
			
			return "%s unterst??tzt Minecraft Version %s nicht mehr! Bitte aktualisieren Sie auf eine neuere Minecraft Version, um weitere Funktionen zu erhalten!";
		}
		
		if(text == "fi.configgui.title") {
			
			return FIReference.MOD_NAME + " Konfig";
		}
		
		return text;
	}
	
	public static String greekLang(String text) {
		
		if(text == "floatingitems.one_second") {
			
			return FIReference.MOD_NAME + ": ?????? ???????????????????????? ?????? ?????????????????? ???????? ?????? ???????????????????? ?????? ????????????????????!";
		}
		
		if(text == "floatingitems.update.display1") {
			
			return "???????? ?????????? ?????? ?????????? ???????????? ?????? %s! ?? ???????????? %s ?????????? ???????? ??????????????????!";
		}
		
		if(text == "floatingitems.update.display2") {
			
			return "?????????? ???????? ?????? ????????!";
		}
		
		if(text == "floatingitems.update.display3") {
			
			return "???? %s ?????? ?????????????????????? ?????????? ?????? ???????????? Minecraft %s! ?????????????????????? ???? ?????? ?????????????? ???????????? Minecraft ?????? ???????????????????????? ??????????????????????!";
		}
		
		if(text == "fi.configgui.title") {
			
			return FIReference.MOD_NAME + " ????????????????????";
		}
		
		return text;
	}
	
	public static String englishUSLang(String text) {
		
		if(text == "floatingitems.update.display1") {
			
			return "This is an old version of %s! Version %s is now available!";
		}
		
		if(text == "floatingitems.update.display2") {
			
			return "Please click to download!";
		}
		
		if(text == "floatingitems.update.display3") {
			
			return "%s no longer supports Minecraft Version %s! Please update to a newer Minecraft Version for more features!";
		}
		
		if(text == "fi.configgui.title") {
			
			return FIReference.MOD_NAME + " Config";
		}
		
		return text;
	}
	
	public static String englishPTLang(String text) {
		
		if(text == "floatingitems.update.display1") {
			
			return "Avast Ye, This be an old version of %s! Version %s is now available, Me Hearty!";
		}
		
		if(text == "floatingitems.update.display2") {
			
			return "Arrr, Click to download!";
		}
		
		if(text == "floatingitems.update.display3") {
			
			return "%s no longer supports Minecraft Version %s! Update to a newer Minecraft Version for more features, Ya Scurvy Dog!";
		}
		
		if(text == "floatingitems.commands.cancel.usage") {
			
			return "/serverstop";
		}
		
		if(text == "floatingitems.commands.cancel.display1") {
			
			return FIReference.MOD_NAME + ": Aye! Server shutdown has been re-enabled!";
		}
		
		if(text == "fi.configgui.title") {
			
			return FIReference.MOD_NAME + " Config-Arrr";
		}
		
		return text;
	}
	
	public static String englishUDLang(String text) {
		
		if(text == "floatingitems.update.display1") {
			
			return "???????q?????????????? ??ou s??? uo???s?????? ????N ??do??S ??????????S ??o uo???s?????? p???o u?? s??? s????????";
		}
		
		if(text == "floatingitems.update.display2") {
			
			return "??p??o???u??op o?? ???????????? ??s?????????";
		}
		
		if(text == "floatingitems.update.display3") {
			
			return "??s????n???????? ????o?? ??o?? ??????pdn ??s????????? ?????????????????? uo???s?????? ????????????u???W s????oddns ???????uo??? ou do??S ??????????S";
		}
		
		if(text == "fi.configgui.title") {
			
			return "????????uo?? s??????I???u???????o??????";
		}
		
		return text;
	}
	
	public static String englishWSLang(String text) {
		
		if(text == "floatingitems.update.display1") {
			
			return "This is a fusty v'rsion of %s! V'rsion %s is available anon!";
		}
		
		if(text == "floatingitems.update.display2") {
			
			return "Prithee click to download!";
		}
		
		if(text == "floatingitems.update.display3") {
			
			return "%s nay longer supports Minecraft V'rsion %s! Prithee update to a newer Minecraft V'rsion f'r further features!";
		}
		
		if(text == "fi.configgui.title") {
			
			return FIReference.MOD_NAME + " Config-thy";
		}
		
		return text;
	}
	
	public static String esperantoLang(String text) {
		
		if(text == "floatingitems.update.display1") {
			
			return "??i tiu estas malnova versio de %s! Versio %s nun estas havebla!";
		}
		
		if(text == "floatingitems.update.display2") {
			
			return "Bonvolu klaki por el??uti!";
		}
		
		if(text == "floatingitems.update.display3") {
			
			return "%s ne plu subtenas Minecraft Version %s! Bonvolu ??isdatigi novan Minecraft Version por pli da trajtoj!";
		}
		
		if(text == "fi.configgui.title") {
			
			return FIReference.MOD_NAME + " Agordo";
		}
		
		return text;
	}
	
	public static String spanishLang(String text) {
		
		if(text == "floatingitems.update.display1") {
			
			return "??Esta es una versi??n antigua de %s! ??La Versi??n %s ya est?? disponible!";
		}
		
		if(text == "floatingitems.update.display2") {
			
			return "??Por favor, haga clic para descargar!";
		}
		
		if(text == "floatingitems.update.display3") {
			
			return "??%s ya no es compatible con la Versi??n de Minecraft %s! ??Por favor, actualice a una Versi??n m??s reciente de Minecraft para ver m??s caracter??sticas!";
		}
		
		if(text == "fi.configgui.title") {
			
			return FIReference.MOD_NAME + " Config";
		}
		
		return text;
	}
	
	public static String finnishLang(String text) {
		
		if(text == "floatingitems.update.display1") {
			
			return "T??m?? on vanha versio %s: sta! Versio %s on nyt saatavilla!";
		}
		
		if(text == "floatingitems.update.display2") {
			
			return "Klikkaa ladataksesi!";
		}
		
		if(text == "floatingitems.update.display3") {
			
			return "%s ei en???? tue Minecraft Versiota %s! P??ivit?? uudemmalle Minecraft Versiolle lis???? ominaisuuksia!";
		}
		
		if(text == "fi.configgui.title") {
			
			return FIReference.MOD_NAME + " Konfig";
		}
		
		return text;
	}
	
	public static String frenchLang(String text) {
		
		if(text == "floatingitems.update.display1") {
			
			return "Ceci est une ancienne version de %s! La Version %s est maintenant disponible!";
		}
		
		if(text == "floatingitems.update.display2") {
			
			return "S'il vous pla??t cliquer pour t??l??charger!";
		}
		
		if(text == "floatingitems.update.display3") {
			
			return "%s ne prend plus en charge la Version Minecraft %s! Veuillez mettre ?? jour votre Version de Minecraft pour obtenir plus de fonctionnalit??s!";
		}
		
		if(text == "fi.configgui.title") {
			
			return FIReference.MOD_NAME + " Config";
		}
		
		return text;
	}
	
	public static String croatianLang(String text) {
		
		if(text == "floatingitems.update.display1") {
			
			return "Ovo je stara verzija %s! Verzija %s sada je dostupna!";
		}
		
		if(text == "floatingitems.update.display2") {
			
			return "Molimo kliknite za preuzimanje!";
		}
		
		if(text == "floatingitems.update.display3") {
			
			return "%s vi??e ne podr??ava Minecraft Verziju %s! Molimo Vas da a??urirate na noviju Verziju Minecrafta za vi??e mogu??nosti!";
		}
		
		if(text == "fi.configgui.title") {
			
			return FIReference.MOD_NAME + " Konfig";
		}
		
		return text;
	}
	
	public static String hungarianLang(String text) {
		
		if(text == "floatingitems.update.display1") {
			
			return "Ez az %s r??gi verzi??ja! Az %s Verzi?? m??r el??rhet??!";
		}
		
		if(text == "floatingitems.update.display2") {
			
			return "Kattintson a let??lt??shez!";
		}
		
		if(text == "floatingitems.update.display3") {
			
			return "%s m??r nem t??mogatja a Minecraft %s Verzi??j??t! K??rj??k, friss??tsen egy ??jabb Minecraft Verzi??ra tov??bbi funkci??k??rt!";
		}
		
		if(text == "fi.configgui.title") {
			
			return FIReference.MOD_NAME + " Konfig";
		}
		
		return text;
	}
	
	public static String italianLang(String text) {
		
		if(text == "floatingitems.update.display1") {
			
			return "Questa ?? una vecchia versione di %s! La Versione %s ?? ora disponibile!";
		}
		
		if(text == "floatingitems.update.display2") {
			
			return "Clicca per scaricare!";
		}
		
		if(text == "floatingitems.update.display3") {
			
			return "%s non supporta pi?? la Versione di Minecraft %s! Si prega di aggiornare a una Versione pi?? recente di Minecraft per ulteriori funzionalit??!";
		}
		
		if(text == "fi.configgui.title") {
			
			return FIReference.MOD_NAME + " Config";
		}
		
		return text;
	}
	
	public static String japaneseLang(String text) {
		
		if(text == "floatingitems.update.display1") {
			
			return "?????????%s????????????????????????????????? ???????????????%s?????????????????????????????????";
		}
		
		if(text == "floatingitems.update.display2") {
			
			return "?????????????????????????????????????????????????????????";
		}
		
		if(text == "floatingitems.update.display3") {
			
			return "%s???Minecraft???????????????%s?????????????????????????????????????????? ??????????????????????????????????????????Minecraft????????????????????????????????????????????????????????????";
		}
		
		if(text == "fi.configgui.title") {
			
			return FIReference.MOD_NAME + " ??????";
		}
		
		return text;
	}
	
	public static String koreanLang(String text) {
		
		if(text == "floatingitems.update.display1") {
			
			return "????????? ?????? ????????? %s?????????! ?????? %s??? ????????? ??? ????????????!";
		}
		
		if(text == "floatingitems.update.display2") {
			
			return "???????????? ????????????????????????!";
		}
		
		if(text == "floatingitems.update.display3") {
			
			return "%s??? ??? ?????? Minecraft ?????? %s??? ???????????? ????????????! ??? ?????? ????????? ????????? ?????? Minecraft ???????????? ????????????????????????!";
		}
		
		if(text == "fi.configgui.title") {
			
			return FIReference.MOD_NAME + " ??????";
		}
		
		return text;
	}
	
	public static String dutchLang(String text) {
		
		if(text == "floatingitems.update.display1") {
			
			return "Dit is een oude Versie van %s! Versie %s is nu beschikbaar!";
		}
		
		if(text == "floatingitems.update.display2") {
			
			return "Klik om te downloaden!";
		}
		
		if(text == "floatingitems.update.display3") {
			
			return "%s ondersteunt niet langer Minecraft Versie %s! Werk bij naar een nieuwere Minecraft Versie voor meer functies!";
		}
		
		if(text == "fi.configgui.title") {
			
			return FIReference.MOD_NAME + " Config";
		}
		
		return text;
	}
	
	public static String polishLang(String text) {
		
		if(text == "floatingitems.update.display1") {
			
			return "To jest stara wersja %s! Wersja %s jest ju?? dost??pna!";
		}
		
		if(text == "floatingitems.update.display2") {
			
			return "Kliknij, aby pobra??!";
		}
		
		if(text == "floatingitems.update.display3") {
			
			return "%s nie obs??uguje ju?? wersji Minecraft %s! Zaktualizuj do nowszej wersji Minecrafta, by zobaczy?? wi??cej funkcji!";
		}
		
		if(text == "fi.configgui.title") {
			
			return FIReference.MOD_NAME + " Konfig";
		}
		
		return text;
	}
	
	public static String portugueseLang(String text) {
		
		if(text == "floatingitems.update.display1") {
			
			return "Esta ?? uma vers??o antiga do %s! A vers??o %s est?? agora dispon??vel!";
		}
		
		if(text == "floatingitems.update.display2") {
			
			return "Por favor, clique para baixar!";
		}
		
		if(text == "floatingitems.update.display3") {
			
			return "%s n??o suporta mais a Vers??o de Minecraft %s! Por favor, atualize para uma Vers??o mais recente do Minecraft para mais recursos!";
		}
		
		if(text == "fi.configgui.title") {
			
			return FIReference.MOD_NAME + " Config";
		}
		
		return text;
	}
	
	public static String russianLang(String text) {
		
		if(text == "floatingitems.update.display1") {
			
			return "?????? ???????????? ???????????? %s! ???????????? %s ???????????? ????????????????!";
		}
		
		if(text == "floatingitems.update.display2") {
			
			return "????????????????????, ??????????????, ?????????? ??????????????!";
		}
		
		if(text == "floatingitems.update.display3") {
			
			return "%s ???????????? ???? ???????????????????????? ???????????? Minecraft %s! ????????????????????, ???????????????? Minecraft ???? ?????????? ????????????, ?????????? ???????????????? ???????????? ????????????????????????!";
		}
		
		if(text == "fi.configgui.title") {
			
			return FIReference.MOD_NAME + " ????????????";
		}
		
		return text;
	}
	
	public static String swedishLang(String text) {
		
		if(text == "floatingitems.update.display1") {
			
			return "Detta ??r en gammal version av %s! Version %s ??r nu tillg??nglig!";
		}
		
		if(text == "floatingitems.update.display2") {
			
			return "V??nligen klicka f??r att ladda ner!";
		}
		
		if(text == "floatingitems.update.display3") {
			
			return "%s st??der inte l??ngre Minecraft Version %s! V??nligen uppdatera till en nyare Minecraft Version f??r fler funktioner!";
		}
		
		if(text == "fi.configgui.title") {
			
			return FIReference.MOD_NAME + " Konfig";
		}
		
		return text;
	}
	
	public static String thaiLang(String text) {
		
		if(text == "floatingitems.update.display1") {
			
			return "?????????????????????????????????????????????????????? %s! ??????????????????????????? %s ???????????????????????????!";
		}
		
		if(text == "floatingitems.update.display2") {
			
			return "?????????????????????????????????????????????????????????????????????!";
		}
		
		if(text == "floatingitems.update.display3") {
			
			return "%s ??????????????????????????? Minecraft ??????????????????????????? %s ????????????????????????! ????????????????????????????????????????????????????????????????????? Minecraft ?????????????????????????????????????????????????????????????????????????????????????????????????????????!";
		}
		
		if(text == "fi.configgui.title") {
			
			return FIReference.MOD_NAME + " ?????????????????????????????????";
		}
		
		return text;
	}
	
	public static String turkishLang(String text) {
		
		if(text == "floatingitems.update.display1") {
			
			return "Bu %s eski bir versiyonudur! %s s??r??m?? ??imdi kullan??ma haz??r!";
		}
		
		if(text == "floatingitems.update.display2") {
			
			return "??ndirmek i??in l??tfen t??klay??n??z!";
		}
		
		if(text == "floatingitems.update.display3") {
			
			return "%s art??k Minecraft S??r??m??n?? desteklemiyor %s! Daha fazla ??zellik i??in l??tfen daha yeni bir Minecraft S??r??m?? ile g??ncelleyin!";
		}
		
		if(text == "fi.configgui.title") {
			
			return FIReference.MOD_NAME + " yap??land??rma";
		}
		
		return text;
	}
	
	public static String chineseSimpLang(String text) {
		
		if(text == "floatingitems.update.display1") {
			
			return "?????????s??????????????? ?????????s???????????????";
		}
		
		if(text == "floatingitems.update.display2") {
			
			return "??????????????????";
		}
		
		if(text == "floatingitems.update.display3") {
			
			return "???s????????????Minecraft Version???s??? ?????????????????????Minecraft??????????????????????????????";
		}
		
		if(text == "fi.configgui.title") {
			
			return FIReference.MOD_NAME + " ??????";
		}
		
		return text;
	}
	
	public static String chineseTradLang(String text) {
		
		if(text == "floatingitems.update.display1") {
			
			return "?????????s??????????????? ?????????s???????????????";
		}
		
		if(text == "floatingitems.update.display2") {
			
			return "??????????????????";
		}
		
		if(text == "floatingitems.update.display3") {
			
			return "???s????????????Minecraft Version ???s??? ?????????????????????Minecraft??????????????????????????????";
		}
		
		if(text == "fi.configgui.title") {
			
			return FIReference.MOD_NAME + " ??????";
		}
		
		return text;
	}

}

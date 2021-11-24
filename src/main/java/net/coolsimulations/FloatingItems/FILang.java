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
			
			return "هذه نسخة قديمة من %s! الإصدار %s متاح الآن!";
		}
		
		if(text == "floatingitems.update.display2") {
			
			return "يرجى النقر للتنزيل!";
		}
		
		if(text == "floatingitems.update.display3") {
			
			return "لم يعد %s يدعم إصدار Minecraft %s! يرجى التحديث إلى أحدث إصدار ماين كرافت لمزيد من الميزات!";
		}
		
		if(text == "fi.configgui.title") {
			
			return FIReference.MOD_NAME + "التكوين ";
		}
		
		return text;
	}
	
	public static String belarusianLang(String text) {
		
		if(text == "floatingitems.update.display1") {
			
			return "Гэта старая версія %s! Версія %s цяпер даступны!";
		}
		
		if(text == "floatingitems.update.display2") {
			
			return "Калі ласка, націсніце, каб загрузіць!";
		}
		
		if(text == "floatingitems.update.display3") {
			
			return "ня %s больш не падтрымлівае Minecraft версіі %s! Абнаўленне да больш новай версіі Minecraft больш магчымасцяў!";
		}
		
		if(text == "fi.configgui.title") {
			
			return FIReference.MOD_NAME + " Канфіг";
		}
		
		return text;
	}
	
	public static String bulgarianLang(String text) {
		
		if(text == "floatingitems.update.display1") {
			
			return "Това е стара версия на %s! Вече е налична версия %s!";
		}
		
		if(text == "floatingitems.update.display2") {
			
			return "Моля, кликнете, за да изтеглите!";
		}
		
		if(text == "floatingitems.update.display3") {
			
			return "%s вече не поддържа Minecraft версия %s! Моля, актуализирайте до по-нова версия на Minecraft за повече функции!";
		}
		
		if(text == "fi.configgui.title") {
			
			return FIReference.MOD_NAME + " Конфигуриране";
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
			
			return "%s više ne podržava Minecraft Verziju %s! Molimo vas da ažurirate na noviju Verziju Minecraft za više mogućnosti!";
		}
		
		if(text == "fi.configgui.title") {
			
			return FIReference.MOD_NAME + " Config";
		}
		
		return text;
	}
	
	public static String catalanLang(String text) {
		
		if(text == "floatingitems.update.display1") {
			
			return "Aquesta és una versió antiga de %s! La Versió %s ja està disponible.";
		}
		
		if(text == "floatingitems.update.display2") {
			
			return "Feu clic per baixar!";
		}
		
		if(text == "floatingitems.update.display3") {
			
			return "%s ja no admet la Versió Minecraft %s! Actualitzeu-vos a una nova Versió de Minecraft per obtenir més funcions.";
		}
		
		if(text == "fi.configgui.title") {
			
			return FIReference.MOD_NAME + " Config";
		}
		
		return text;
	}
	
	public static String czechLang(String text) {
		
		if(text == "floatingitems.update.display1") {
			
			return "Toto je stará verze %s! Verze %s je nyní k dispozici!";
		}
		
		if(text == "floatingitems.update.display2") {
			
			return "Prosím klikněte pro stažení!";
		}
		
		if(text == "floatingitems.update.display3") {
			
			return "%s již nepodporuje Verzi Minecraft %s! Aktualizujte prosím na novější Verzi Minecraft pro další funkce!";
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
			
			return "Dette er en gammel Version af %s! Version %s er nu tilgængelig!";
		}
		
		if(text == "floatingitems.update.display2") {
			
			return "Venligst klik for at downloade!";
		}
		
		if(text == "floatingitems.update.display3") {
			
			return "%s understøtter ikke længere Minecraft Version %s! Opdater venligst til en nyere Minecraft Version for flere funktioner!";
		}
		
		if(text == "fi.configgui.title") {
			
			return FIReference.MOD_NAME + " Konfig";
		}
		
		return text;
	}
	
	public static String germanLang(String text) {
		
		if(text == "floatingitems.update.display1") {
			
			return "Dies ist eine alte Version von %s! Version %s ist jetzt verfügbar!";
		}
		
		if(text == "floatingitems.update.display2") {
			
			return "Zum Download bitte klicken!";
		}
		
		if(text == "floatingitems.update.display3") {
			
			return "%s unterstützt Minecraft Version %s nicht mehr! Bitte aktualisieren Sie auf eine neuere Minecraft Version, um weitere Funktionen zu erhalten!";
		}
		
		if(text == "fi.configgui.title") {
			
			return FIReference.MOD_NAME + " Konfig";
		}
		
		return text;
	}
	
	public static String greekLang(String text) {
		
		if(text == "floatingitems.one_second") {
			
			return FIReference.MOD_NAME + ": Ένα δευτερόλεπτο που παραμένει πριν τον τερματισμό του διακομιστή!";
		}
		
		if(text == "floatingitems.update.display1") {
			
			return "Αυτή είναι μια παλιά έκδοση του %s! Η έκδοση %s είναι τώρα διαθέσιμη!";
		}
		
		if(text == "floatingitems.update.display2") {
			
			return "Κάντε κλικ για λήψη!";
		}
		
		if(text == "floatingitems.update.display3") {
			
			return "Το %s δεν υποστηρίζει πλέον την έκδοση Minecraft %s! Αναβαθμίστε σε μια νεότερη έκδοση Minecraft για περισσότερες δυνατότητες!";
		}
		
		if(text == "fi.configgui.title") {
			
			return FIReference.MOD_NAME + " Διαμόρφωση";
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
			
			return "¡ǝꞁqɐꞁᴉɐʌɐ ʍou sᴉ uoᴉsɹǝʌ ʍǝN ¡doʇS ɹǝʌɹǝS ɟo uoᴉsɹǝʌ pꞁo uɐ sᴉ sᴉɥ⟘";
		}
		
		if(text == "floatingitems.update.display2") {
			
			return "¡pɐoꞁuʍop oʇ ʞɔᴉꞁɔ ǝsɐǝꞁԀ";
		}
		
		if(text == "floatingitems.update.display3") {
			
			return "¡sǝɹnʇɐǝɟ ǝɹoɯ ɹoɟ ǝʇɐpdn ǝsɐǝꞁԀ ¡6˙8˙⥝ uoᴉsɹǝΛ ʇɟɐɹɔǝuᴉW sʇɹoddns ɹǝᵷuoꞁ ou doʇS ɹǝʌɹǝS";
		}
		
		if(text == "fi.configgui.title") {
			
			return "ᵷᴉɟuoƆ sɯǝʇIᵷuᴉʇɐoꞁℲ";
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
			
			return "Ĉi tiu estas malnova versio de %s! Versio %s nun estas havebla!";
		}
		
		if(text == "floatingitems.update.display2") {
			
			return "Bonvolu klaki por elŝuti!";
		}
		
		if(text == "floatingitems.update.display3") {
			
			return "%s ne plu subtenas Minecraft Version %s! Bonvolu ĝisdatigi novan Minecraft Version por pli da trajtoj!";
		}
		
		if(text == "fi.configgui.title") {
			
			return FIReference.MOD_NAME + " Agordo";
		}
		
		return text;
	}
	
	public static String spanishLang(String text) {
		
		if(text == "floatingitems.update.display1") {
			
			return "¡Esta es una versión antigua de %s! ¡La Versión %s ya está disponible!";
		}
		
		if(text == "floatingitems.update.display2") {
			
			return "¡Por favor, haga clic para descargar!";
		}
		
		if(text == "floatingitems.update.display3") {
			
			return "¡%s ya no es compatible con la Versión de Minecraft %s! ¡Por favor, actualice a una Versión más reciente de Minecraft para ver más características!";
		}
		
		if(text == "fi.configgui.title") {
			
			return FIReference.MOD_NAME + " Config";
		}
		
		return text;
	}
	
	public static String finnishLang(String text) {
		
		if(text == "floatingitems.update.display1") {
			
			return "Tämä on vanha versio %s: sta! Versio %s on nyt saatavilla!";
		}
		
		if(text == "floatingitems.update.display2") {
			
			return "Klikkaa ladataksesi!";
		}
		
		if(text == "floatingitems.update.display3") {
			
			return "%s ei enää tue Minecraft Versiota %s! Päivitä uudemmalle Minecraft Versiolle lisää ominaisuuksia!";
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
			
			return "S'il vous plaît cliquer pour télécharger!";
		}
		
		if(text == "floatingitems.update.display3") {
			
			return "%s ne prend plus en charge la Version Minecraft %s! Veuillez mettre à jour votre Version de Minecraft pour obtenir plus de fonctionnalités!";
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
			
			return "%s više ne podržava Minecraft Verziju %s! Molimo Vas da ažurirate na noviju Verziju Minecrafta za više mogućnosti!";
		}
		
		if(text == "fi.configgui.title") {
			
			return FIReference.MOD_NAME + " Konfig";
		}
		
		return text;
	}
	
	public static String hungarianLang(String text) {
		
		if(text == "floatingitems.update.display1") {
			
			return "Ez az %s régi verziója! Az %s Verzió már elérhető!";
		}
		
		if(text == "floatingitems.update.display2") {
			
			return "Kattintson a letöltéshez!";
		}
		
		if(text == "floatingitems.update.display3") {
			
			return "%s már nem támogatja a Minecraft %s Verzióját! Kérjük, frissítsen egy újabb Minecraft Verzióra további funkciókért!";
		}
		
		if(text == "fi.configgui.title") {
			
			return FIReference.MOD_NAME + " Konfig";
		}
		
		return text;
	}
	
	public static String italianLang(String text) {
		
		if(text == "floatingitems.update.display1") {
			
			return "Questa è una vecchia versione di %s! La Versione %s è ora disponibile!";
		}
		
		if(text == "floatingitems.update.display2") {
			
			return "Clicca per scaricare!";
		}
		
		if(text == "floatingitems.update.display3") {
			
			return "%s non supporta più la Versione di Minecraft %s! Si prega di aggiornare a una Versione più recente di Minecraft per ulteriori funzionalità!";
		}
		
		if(text == "fi.configgui.title") {
			
			return FIReference.MOD_NAME + " Config";
		}
		
		return text;
	}
	
	public static String japaneseLang(String text) {
		
		if(text == "floatingitems.update.display1") {
			
			return "これは%sの古いバージョンです。 バージョン%sがリリースされました。";
		}
		
		if(text == "floatingitems.update.display2") {
			
			return "クリックしてダウンロードしてください。";
		}
		
		if(text == "floatingitems.update.display3") {
			
			return "%sはMinecraftバージョン%sをサポートしなくなりました。 より多くの機能のために新しいMinecraftのバージョンにアップデートしてください！";
		}
		
		if(text == "fi.configgui.title") {
			
			return FIReference.MOD_NAME + " 構成";
		}
		
		return text;
	}
	
	public static String koreanLang(String text) {
		
		if(text == "floatingitems.update.display1") {
			
			return "이것은 이전 버전의 %s입니다! 버전 %s를 사용할 수 있습니다!";
		}
		
		if(text == "floatingitems.update.display2") {
			
			return "클릭하여 다운로드하십시오!";
		}
		
		if(text == "floatingitems.update.display3") {
			
			return "%s은 더 이상 Minecraft 버전 %s를 지원하지 않습니다! 더 많은 기능을 보려면 최신 Minecraft 버전으로 업데이트하십시오!";
		}
		
		if(text == "fi.configgui.title") {
			
			return FIReference.MOD_NAME + " 구성";
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
			
			return "To jest stara wersja %s! Wersja %s jest już dostępna!";
		}
		
		if(text == "floatingitems.update.display2") {
			
			return "Kliknij, aby pobrać!";
		}
		
		if(text == "floatingitems.update.display3") {
			
			return "%s nie obsługuje już wersji Minecraft %s! Zaktualizuj do nowszej wersji Minecrafta, by zobaczyć więcej funkcji!";
		}
		
		if(text == "fi.configgui.title") {
			
			return FIReference.MOD_NAME + " Konfig";
		}
		
		return text;
	}
	
	public static String portugueseLang(String text) {
		
		if(text == "floatingitems.update.display1") {
			
			return "Esta é uma versão antiga do %s! A versão %s está agora disponível!";
		}
		
		if(text == "floatingitems.update.display2") {
			
			return "Por favor, clique para baixar!";
		}
		
		if(text == "floatingitems.update.display3") {
			
			return "%s não suporta mais a Versão de Minecraft %s! Por favor, atualize para uma Versão mais recente do Minecraft para mais recursos!";
		}
		
		if(text == "fi.configgui.title") {
			
			return FIReference.MOD_NAME + " Config";
		}
		
		return text;
	}
	
	public static String russianLang(String text) {
		
		if(text == "floatingitems.update.display1") {
			
			return "Это старая версия %s! Версия %s теперь доступна!";
		}
		
		if(text == "floatingitems.update.display2") {
			
			return "Пожалуйста, нажмите, чтобы скачать!";
		}
		
		if(text == "floatingitems.update.display3") {
			
			return "%s больше не поддерживает версию Minecraft %s! Пожалуйста, обновите Minecraft до новой версии, чтобы получить больше возможностей!";
		}
		
		if(text == "fi.configgui.title") {
			
			return FIReference.MOD_NAME + " Конфиг";
		}
		
		return text;
	}
	
	public static String swedishLang(String text) {
		
		if(text == "floatingitems.update.display1") {
			
			return "Detta är en gammal version av %s! Version %s är nu tillgänglig!";
		}
		
		if(text == "floatingitems.update.display2") {
			
			return "Vänligen klicka för att ladda ner!";
		}
		
		if(text == "floatingitems.update.display3") {
			
			return "%s stöder inte längre Minecraft Version %s! Vänligen uppdatera till en nyare Minecraft Version för fler funktioner!";
		}
		
		if(text == "fi.configgui.title") {
			
			return FIReference.MOD_NAME + " Konfig";
		}
		
		return text;
	}
	
	public static String thaiLang(String text) {
		
		if(text == "floatingitems.update.display1") {
			
			return "นี่เป็นรุ่นเก่าของ %s! เวอร์ชั่น %s พร้อมแล้ว!";
		}
		
		if(text == "floatingitems.update.display2") {
			
			return "กรุณาคลิกเพื่อดาวน์โหลด!";
		}
		
		if(text == "floatingitems.update.display3") {
			
			return "%s ไม่รองรับ Minecraft เวอร์ชั่น %s อีกต่อไป! โปรดอัปเดตเป็นเวอร์ชั่น Minecraft ที่ใหม่กว่าสำหรับคุณสมบัติเพิ่มเติม!";
		}
		
		if(text == "fi.configgui.title") {
			
			return FIReference.MOD_NAME + " การกำหนดค่า";
		}
		
		return text;
	}
	
	public static String turkishLang(String text) {
		
		if(text == "floatingitems.update.display1") {
			
			return "Bu %s eski bir versiyonudur! %s sürümü şimdi kullanıma hazır!";
		}
		
		if(text == "floatingitems.update.display2") {
			
			return "İndirmek için lütfen tıklayınız!";
		}
		
		if(text == "floatingitems.update.display3") {
			
			return "%s artık Minecraft Sürümünü desteklemiyor %s! Daha fazla özellik için lütfen daha yeni bir Minecraft Sürümü ile güncelleyin!";
		}
		
		if(text == "fi.configgui.title") {
			
			return FIReference.MOD_NAME + " yapılandırma";
		}
		
		return text;
	}
	
	public static String chineseSimpLang(String text) {
		
		if(text == "floatingitems.update.display1") {
			
			return "这是％s的旧版本！ 版本％s现已推出！";
		}
		
		if(text == "floatingitems.update.display2") {
			
			return "请点击下载！";
		}
		
		if(text == "floatingitems.update.display3") {
			
			return "％s不再支持Minecraft Version％s！ 请更新到更新的Minecraft版本以获取更多功能！";
		}
		
		if(text == "fi.configgui.title") {
			
			return FIReference.MOD_NAME + " 配置";
		}
		
		return text;
	}
	
	public static String chineseTradLang(String text) {
		
		if(text == "floatingitems.update.display1") {
			
			return "這是％s的舊版本！ 版本％s現已推出！";
		}
		
		if(text == "floatingitems.update.display2") {
			
			return "請點擊下載！";
		}
		
		if(text == "floatingitems.update.display3") {
			
			return "％s不再支持Minecraft Version ％s！ 請更新到更新的Minecraft版本以獲取更多功能！";
		}
		
		if(text == "fi.configgui.title") {
			
			return FIReference.MOD_NAME + " 配置";
		}
		
		return text;
	}

}

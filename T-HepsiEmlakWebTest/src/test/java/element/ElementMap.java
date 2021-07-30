package element;


import org.openqa.selenium.By;

import java.util.HashMap;

import static element.DesktopPageElement.*;
import static element.DesktopTagControl.*;
import static element.MobilePageElement.*;
import static element.MobileTagControl.*;

public class ElementMap {

    public static HashMap<String, By> elementsMap() {
        HashMap<String, By> elementsMap = new HashMap<String, By>();
        elementsMap.put("SatilikkButtonBy", SatilikkButtonBy);
        elementsMap.put("ilSecinizButtonBy", ilSecinizButtonBy);
        elementsMap.put("izmirSecBy", izmirSecBy);
        elementsMap.put("ilceSecinizButtonBy", ilceSecinizButtonBy);
        elementsMap.put("BornovaSecBy", BornovaSecBy);
        elementsMap.put("isyeriButtonBy", isyeriButtonBy);
        elementsMap.put("FiyatBy", FiyatBy);
        elementsMap.put("minFiyatBy", minFiyatBy);
        elementsMap.put("maxFiyatBy", maxFiyatBy);
        elementsMap.put("cookieBy", cookieBy);
        elementsMap.put("binaYasıButtonBy", binaYasıButtonBy);
        elementsMap.put("sıfırbinaBy", sıfırbinaBy);
        elementsMap.put("birbesbinaBy", birbesbinaBy);
        elementsMap.put("altıonbinaBy", altıonbinaBy);
        elementsMap.put("searchButtonBy", searchButtonBy);
        elementsMap.put("ilceBy", ilceBy);
        elementsMap.put("isyeriBy", isyeriBy);
        elementsMap.put("fiyatBy", fiyatBy);
        elementsMap.put("ilBy", ilBy);
        elementsMap.put("sifirbinaCBy", sifirbinaCBy);
        elementsMap.put("birbesbinaCBy", birbesbinaCBy);
        elementsMap.put("altionbibaCBy", altionbibaCBy);
        elementsMap.put("KiralikButtonBy", KiralikButtonBy);
        elementsMap.put("AnkaraSecBy", AnkaraSecBy);
        elementsMap.put("CankayaSecBy", CankayaSecBy);
        elementsMap.put("OdaSayisiBy", OdaSayisiBy);
        elementsMap.put("ikiartibiriSecBy", ikiartibiriSecBy);
        elementsMap.put("siteicindeyiSecBy", siteicindeyiSecBy);
        elementsMap.put("ucuncuilanBy", ucuncuilanBy);
        elementsMap.put("telefonNumarasınıGosterBy", telefonNumarasınıGosterBy);
        elementsMap.put("telBy", telBy);

        //------------

        elementsMap.put("cookieByM", cookieByM);
        elementsMap.put("SatilikkButtonByM", SatilikkButtonByM);
        elementsMap.put("ilSecinizButtonByM", ilSecinizButtonByM);
        elementsMap.put("izmirSecByM", izmirSecByM);
        elementsMap.put("ilceSecinizButtonByM", ilceSecinizButtonByM);
        elementsMap.put("BornovaSecByM", BornovaSecByM);
        elementsMap.put("UygulaByM", UygulaByM);
        elementsMap.put("filtreleButtonByM", filtreleButtonByM);
        elementsMap.put("isyerisecByM", isyerisecByM);
        elementsMap.put("minfiyatByM", minfiyatByM);
        elementsMap.put("maxfiyatByM", maxfiyatByM);
        elementsMap.put("binayasisecByM", binayasisecByM);
        elementsMap.put("sifirbinaByM", sifirbinaByM);
        elementsMap.put("birbesbinaByM", birbesbinaByM);
        elementsMap.put("altionByM", altionByM);
        elementsMap.put("uygulabinaButtonByM", uygulabinaButtonByM);
        elementsMap.put("sonuclarigosterByM", sonuclarigosterByM);
        elementsMap.put("filtreleByM", filtreleByM);
        elementsMap.put("isyeriByM", isyeriByM);
        elementsMap.put("maxfiyatKontrolByM", maxfiyatKontrolByM);
        elementsMap.put("minfiyatKontrolByM", minfiyatKontrolByM);
        elementsMap.put("isyeridurumByM", isyeridurumByM);
        elementsMap.put("sifirbinaCByM", sifirbinaCByM);
        elementsMap.put("birbesbinaCByM", birbesbinaCByM);
        elementsMap.put("altionbibaCByM", altionbibaCByM);
        elementsMap.put("ilKontrolByM", ilKontrolByM);
        elementsMap.put("ilceKontrolByM", ilceKontrolByM);
        elementsMap.put("KiralikButtonByM", KiralikButtonByM);
        elementsMap.put("ankarasecByM", ankarasecByM);
        elementsMap.put("cankayasecByM", cankayasecByM);
        elementsMap.put("odasecbuttonByM", odasecbuttonByM);
        elementsMap.put("ikiartibirsecByM", ikiartibirsecByM);
        elementsMap.put("siteicindeByM", siteicindeByM);
        elementsMap.put("ucuncuilanByM", ucuncuilanByM);
        elementsMap.put("telefongosterByM", telefongosterByM);
        elementsMap.put("telByM", telByM);

        return elementsMap;
    }


}

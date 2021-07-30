package element;

import org.openqa.selenium.By;

public class DesktopPageElement {

    public static By cookieBy = By.xpath("//span[@class='he-icon cookie-policy__close he-icon--close']");
    public static By SatilikkButtonBy = By.xpath("//a/span[text()='Satılık']");
    public static By ilSecinizButtonBy = By.xpath("//span[contains(text(),'İl Seçiniz')]");
    public static By izmirSecBy = By.xpath("//span[text()='İzmir']");
    public static By ilceSecinizButtonBy = By.xpath("//span[contains(text(),'İlçe Seçiniz')]");
    public static By BornovaSecBy = By.xpath("//span[text()='Bornova']");
    public static By isyeriButtonBy = By.xpath("//label[@for='category1']");
    public static By FiyatBy = By.xpath("//span[contains(text(),'Fiyat')]");
    public static By minFiyatBy = By.xpath("//input[@class='floating-input priceMin']");
    public static By maxFiyatBy = By.xpath("//input[@class='floating-input priceMax']");
    public static By binaYasıButtonBy = By.xpath("//div[contains(text(),'Bina Yaşı Seçiniz')]");
    public static By sıfırbinaBy = By.xpath("//label//span[contains(text(),'Sıfır Bina')]");
    public static By birbesbinaBy = By.xpath("//label//span[contains(text(),'1-5')]");
    public static By altıonbinaBy = By.xpath("//label//span[contains(text(),'6-10')]");
    public static By searchButtonBy = By.xpath("//a[@class='btn btn-red btn-large']");

    //-----------------

    public static By KiralikButtonBy = By.xpath("//a/span[text()='Kiralık']");
    public static By AnkaraSecBy = By.xpath("//span[contains(text(),'Ankara')]");
    public static By CankayaSecBy = By.xpath("//span[text()='Çankaya']");
    public static By OdaSayisiBy = By.xpath("//div[contains(text(),'Oda Seçiniz')]");
    public static By ikiartibiriSecBy = By.xpath("//label[@class='md-checkbox']//span[contains(text(),'2+1')]");
    public static By siteicindeyiSecBy = By.cssSelector("section[class='filter-switch withinSiteSec'] input");
    public static By ucuncuilanBy = By.cssSelector("div[class='listView']>div:nth-child(4)>div>div>div");
    public static By telefonNumarasınıGosterBy = By.xpath("//span[contains(text(),'Telefon Numarasını Göster')]");
    public static By telBy = By.cssSelector("[class='owner-phone-numbers-list']>li>a");

}
package element;

import org.openqa.selenium.By;

public class MobilePageElement {

    public static By cookieByM = By.cssSelector("div[class='cookie-policy'] button");
    public static By SatilikkButtonByM = By.xpath("//div[@class='link-sliding']/a[@href='/satilik']");
    public static By ilSecinizButtonByM = By.xpath("//div[@class='city']");
    public static By izmirSecByM = By.xpath("//option[@value='izmir']");
    public static By ilceSecinizButtonByM = By.xpath("//section[@class='location']/section[@class='select-content']");
    public static By BornovaSecByM = By.xpath("//span[text()='Bornova']");
    public static By UygulaByM = By.xpath("//button[contains(text(),'Uygula')]");
    public static By filtreleButtonByM = By.xpath("//span[@class='val']");
    public static By isyerisecByM = By.xpath("//label[@for='category1']");
    public static By minfiyatByM = By.xpath("//*[@id=\"app\"]/div[2]/div[1]/div[2]/div/div[1]/section[2]/div/div[1]/input");
    public static By maxfiyatByM = By.xpath("//*[@id=\"app\"]/div[2]/div[1]/div[2]/div/div[1]/section[2]/div/div[2]/input");
    public static By binayasisecByM = By.xpath("//section[@class='building-age']");
    public static By sifirbinaByM = By.xpath("//span[text()='Sıfır Bina']");
    public static By birbesbinaByM = By.xpath("//span[text()='1-5']");
    public static By altionByM = By.xpath("//span[text()='6-10']");
    public static By uygulabinaButtonByM = By.xpath("//*[@id=\"dropdown-lightbox-filter\"]/button");
    public static By sonuclarigosterByM = By.xpath("//button[@class='btn btn-red cardShadow3 get-result']");
    public static By filtreleByM = By.xpath("//span[@class='he-svg he-svg--funnel']");
    public static By KiralikButtonByM = By.xpath("//span[@class='he-svg left-icon he-svg--kiralik']");
    public static By ankarasecByM = By.xpath("//option[@value='ankara']");
    public static By cankayasecByM = By.xpath("//span[text()='Çankaya']");
    public static By odasecbuttonByM = By.xpath("//span[contains(text(),'Oda Seçiniz')]");
    public static By ikiartibirsecByM = By.xpath("//span[text()='2+1']");
    public static By siteicindeByM = By.xpath("//span[contains(text(),'Site İçinde')]");
    public static By ucuncuilanByM = By.cssSelector("div[class='reality-list']>div:nth-child(3)>div>div>div[class='img-inner']");
    public static By telefongosterByM = By.xpath("//button/span[text()='Telefonu Göster']");
    public static By telByM = By.cssSelector("[class='contact']>div>div>[class='phone-number']>a");

}
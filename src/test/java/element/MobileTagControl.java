package element;

import org.openqa.selenium.By;

public class MobileTagControl {
    public static By isyeridurumByM = By.xpath("//p[text()='Satılık']");
    public static By isyeriByM = By.xpath("//p[text()='İşyeri']");
    public static By maxfiyatKontrolByM = By.xpath("//p[text()='2.000.000 TL']");
    public static By minfiyatKontrolByM = By.xpath("//p[text()='100.000 TL']");
    public static By sifirbinaCByM = By.xpath("//div[@class='swiper-slide']//div[@class='val']//p[text()='Sıfır Bina']");
    public static By birbesbinaCByM = By.xpath("//p[text()='1-5']");
    public static By altionbibaCByM = By.xpath("//p[text()='6-10']");
    public static By ilKontrolByM = By.cssSelector("div[class='breadcrumb list-breadcrumb listing-breadcrumb']>div:nth-child(2)>a");
    public static By ilceKontrolByM = By.cssSelector("div[class='breadcrumb list-breadcrumb listing-breadcrumb']>div:nth-child(3)>a");


}

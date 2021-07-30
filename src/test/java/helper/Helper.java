package helper;

import org.example.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Helper {
    public static WebDriver driver;

    public void click(By byElement) {

        driver.findElement(byElement).click();
    }

    public void scrollDownToElementAndClick(By by) {

        WebElement element = driver.findElement(by);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
        element.click();
    }

    public void sendKeys(By byElement, String text) {

        driver.findElement(byElement).sendKeys(text);
    }

    public String getText(By byElement) {

        return driver.findElement(byElement).getText().toString();
    }
    public String getHref(By byElement) {

        return driver.findElement(byElement).getAttribute("href").toString();
    }
    public String getFlagText(By byElement) {
        JavascriptExecutor js = (JavascriptExecutor)driver;
        WebElement flag = driver.findElement(byElement);
        js.executeScript("arguments[0].scrollIntoView();", new Object[]{flag});
        return flag.getText();
    }
}

package org.example;

import com.thoughtworks.gauge.Logger;
import com.thoughtworks.gauge.Step;
import com.thoughtworks.gauge.Table;
import com.thoughtworks.gauge.TableRow;
import org.junit.Assert;

import java.util.HashSet;
import java.util.concurrent.TimeUnit;
import static element.ElementMap.*;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertEquals;
public class StepImplementation extends BaseTest {

    @Step({"HepsiEmlak Ana Sayfasına Gidilir."})
    public void navigateToHepsiEmlak() {
        driver.navigate().to("https://www.hepsiemlak.com/");
        assertEquals("https://www.hepsiemlak.com/", driver.getCurrentUrl());
        Logger.info(driver.getCurrentUrl() + " sayfasındasınız. ");

    }

    @Step({"<seconds> saniye bekle"})
    public void waitBySecond(int seconds) throws InterruptedException {
        TimeUnit.SECONDS.sleep(seconds);
        Logger.info(seconds + " saniye beklendi. ");

    }

    @Step("<element> elementine tıkla")
    public void clickElement(String element) {

        click(elementsMap().get(element));
        Logger.info(element + " elementine tıklandı.");

    }

    @Step("<element> elementine scroll ile tıkla")
    public void scrollClickElement(String element) {

        scrollDownToElementAndClick(elementsMap().get(element));
        Logger.info(element + " elementine tıklandı.");

    }

    @Step("<element> elementine scrolla")
    public void scrollElement(String element) {

        scrollDownToElementAndClick(elementsMap().get(element));
        Logger.info(element + " elementine tıklandı. ");

    }

    @Step("<element> 'ine <key> degerini yolla")
    public void sendKeyElement(String element, String key) {
        sendKeys(elementsMap().get(element), key);
        Logger.info(element + " elementine tıklandı. " + key + " yazılıdı.");

    }

    @Step({"<element> elementi <key> mi?"})
    public void isTheElementEqual(String element, String key) {
        String ActualText = getText(elementsMap().get(element));
        String ExpectedText = key;
        // Assert.assertNotNull(ActualText);
        Assert.assertEquals(ActualText, ExpectedText);
        Logger.info(ActualText + " ile  " + ExpectedText + "birbirine eşit.");

    }

    @Step({"<element> telefon <key> mi?"})
    public void isTheTextEqual(String element, String key) {
        String ActualText = getHref(elementsMap().get(element));
        String ExpectedText= key;
        // Assert.assertNotNull(ActualText);
        Assert.assertEquals(ActualText, ExpectedText);
        Logger.info(ActualText + " ile " + ExpectedText + "birbirine eşit.");

    }

    @Step({"<element> elementi <key> mi??"})
    public void isTheElementEqualM(String element, String key) {
        String ActualText = getFlagText(elementsMap().get(element));
        String ExpectedText = key;
        // Assert.assertNotNull(ActualText);
        Assert.assertEquals(ActualText, ExpectedText);
        Logger.info(ActualText + " ile " + ExpectedText + "birbirine eşit.");

    }
}
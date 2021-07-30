package org.example;

import com.thoughtworks.gauge.AfterScenario;
import com.thoughtworks.gauge.BeforeScenario;
import helper.Helper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class BaseTest extends Helper {

    protected static String device;

    @BeforeScenario
    public void setUp()  {

        device = "web";

        if (device.equals("mobile")) {
            Map<String, String> mobileEmulation = new HashMap();
            mobileEmulation.put("deviceName", "iPhone 8");
            ChromeOptions options = new ChromeOptions();
            options.setExperimentalOption("mobileEmulation", mobileEmulation);
            options.addArguments(new String[]{"start-maximized"});
            options.addArguments(new String[]{"--disable-notifications"});
            System.setProperty("webdriver.chrome.driver","src/test/resources/chromedriver.exe");
            driver = new ChromeDriver(options);
            driver.manage().timeouts().pageLoadTimeout(60L, TimeUnit.SECONDS);
        }
        else if(device.equals("web"))
        {

            System.setProperty("webdriver.chrome.driver","src/test/resources/chromedriver.exe");
            ChromeOptions options = new ChromeOptions();
            options.addArguments("start-maximized");
            driver = new ChromeDriver(options);
            // driver.get("https://www.hepsiemlak.com/");

        }
    }




    @AfterScenario
    public static void tearDown(){
        driver.quit();
    }




}

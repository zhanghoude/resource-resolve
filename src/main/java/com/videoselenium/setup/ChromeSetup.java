package com.videoselenium.setup;

import com.google.common.collect.Lists;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

/**
 * 调用ChromeDriver
 *
 * @author kirito
 * @version 1.0
 * @date 2024/5/14
 * @since 1.0
 */
public class ChromeSetup {

    public static WebDriver setup(String url) {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless");
        options.addArguments("--disable-gpu");
        options.addArguments("--no-sandbox");
        options.addArguments("--remote-allow-origins=*");
        options.addArguments("--disable-blink-features=AutomationControlled");
        options.addArguments("--disable-infobars");
        options.setExperimentalOption("useAutomationExtension", false);
        options.setExperimentalOption("excludeSwitches", Lists.newArrayList("enable-automation"));

        ChromeDriver driver = new ChromeDriver(options);
        driver.executeScript("Object.defineProperty(navigator, 'webdriver', {get: () => false})");
        driver.get(url);

        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        return driver;
    }

}

package com.videoselenium.setup;

import com.videoselenium.enums.DriverEnum;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChromeSetup {

    public static WebDriver setup(DriverEnum driverEnum, String url) {
        WebDriver driver = null;
        switch (driverEnum) {
            case CHROME -> {
                ChromeOptions options = new ChromeOptions();
                options.addArguments("--headless");
                options.addArguments("--disable-gpu");
                options.addArguments("--no-sandbox");
                options.addArguments("--remote-allow-origins=*");

                driver = new ChromeDriver(options);
                driver.get(url);
            }
        }

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        return driver;
    }

}

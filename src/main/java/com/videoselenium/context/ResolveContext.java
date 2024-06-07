package com.videoselenium.context;

import com.videoselenium.domain.response.ResolveResult;
import com.videoselenium.enums.DriverEnum;
import com.videoselenium.setup.ChromeSetup;
import com.videoselenium.strategy.ResolveStrategy;
import lombok.Setter;
import org.openqa.selenium.WebDriver;

@Setter
public class ResolveContext {

    private ResolveStrategy resolveStrategy;

    public ResolveResult resolve(String url) {
        WebDriver driver = ChromeSetup.setup(url);

        // 获取处理策略
        this.setResolveStrategy(LinkHandlerScannerContext.handle(driver.getCurrentUrl()));

        // 调用策略
        ResolveResult resolve = resolveStrategy.resolve(driver);
        driver.quit();

        return resolve;
    }

}

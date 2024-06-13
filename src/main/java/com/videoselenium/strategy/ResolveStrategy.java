package com.videoselenium.strategy;

import com.videoselenium.domain.response.ResolveResult;
import org.openqa.selenium.WebDriver;

import java.util.List;

/**
 * 解析策略接口
 * @author kirito
 * @date 2024/5/14
 * @version 1.0
 * @since 1.0
 */
public interface ResolveStrategy {
    default ResolveResult resolve(WebDriver driver) {

        return new ResolveResult(resolveImg(driver), resolveVideo(driver));
    }

    List<String> resolveImg(WebDriver driver);

    List<String> resolveVideo(WebDriver driver);

}

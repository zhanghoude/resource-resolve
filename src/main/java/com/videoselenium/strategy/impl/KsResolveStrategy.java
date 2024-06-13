package com.videoselenium.strategy.impl;

import com.google.common.collect.Lists;
import com.videoselenium.domain.response.ResolveResult;
import com.videoselenium.strategy.ResolveStrategy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;
import java.util.Objects;

/**
 * 快手解析策略
 *
 * @author kirito
 * @version 1.0
 * @date 2024/5/14
 * @since 1.0
 */
public class KsResolveStrategy implements ResolveStrategy {

    @Override
    public List<String> resolveImg(WebDriver driver) {

        return Lists.newArrayList();
    }

    @Override
    public List<String> resolveVideo(WebDriver driver) {
        List<String> videoLinks = Lists.newArrayList();
        List<WebElement> videoTags = driver.findElements(By.tagName("video"));
        videoTags.forEach(x -> {
            if (Objects.nonNull(x.getAttribute("src"))) {
                String src = x.getAttribute("src");
                if (src.contains("kwaicdn.com")) {
                    videoLinks.add(src);
                }
            }
        });

        return videoLinks;
    }

}

package com.videoselenium.strategy.impl;

import com.google.common.collect.Lists;
import org.openqa.selenium.By;
import com.videoselenium.domain.response.ResolveResult;
import com.videoselenium.strategy.ResolveStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Objects;

/**
 * Ins解析策略
 *
 * @author kirito
 * @version 1.0
 * @date 2024/5/14
 * @since 1.0
 */
public class InsResolveStrategy implements ResolveStrategy {

    @Override
    public List<String> resolveImg(WebDriver driver) {
        List<String> imgLinks = Lists.newArrayList();
        List<WebElement> imgTags = driver.findElements(By.tagName("img"));
        imgTags.forEach(x -> {
            String alt = x.getAttribute("alt");
            if (alt != null && !alt.contains("picture") && x.getAttribute("src").contains("https")) {
                imgLinks.add(x.getAttribute("src"));
            }
        });

        return imgLinks;
    }

    @Override
    public List<String> resolveVideo(WebDriver driver) {
        List<String> videoLinks = Lists.newArrayList();
        List<WebElement> videoTags = driver.findElements(By.tagName("video"));
        videoTags.forEach(x -> {
            if (Objects.nonNull(x.getAttribute("src"))) {
                videoLinks.add(x.getAttribute("src"));
            }
        });

        return videoLinks;
    }

}

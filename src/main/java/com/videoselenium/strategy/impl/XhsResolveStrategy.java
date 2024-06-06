package com.videoselenium.strategy.impl;

import com.google.common.collect.Lists;
import com.videoselenium.domain.response.ResolveResult;
import com.videoselenium.strategy.ResolveStrategy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Objects;

public class XhsResolveStrategy implements ResolveStrategy {
    @Override
    public ResolveResult resolve(WebDriver driver) {

        List<String> imgLinks = Lists.newArrayList();
        List<WebElement> imgTags = driver.findElements(By.tagName("meta"));
        imgTags.forEach(x -> {
            if ("og:image".equals(x.getAttribute("name"))) {
                imgLinks.add(x.getAttribute("content"));
            }
        });

        List<String> videoLinks = Lists.newArrayList();
        List<WebElement> videoTags = driver.findElements(By.tagName("meta"));
        videoTags.forEach(x -> {
            if ("og:video".equals(x.getAttribute("name"))) {
                videoLinks.add(x.getAttribute("content"));
            }
        });

        return new ResolveResult(imgLinks, videoLinks);
    }

}

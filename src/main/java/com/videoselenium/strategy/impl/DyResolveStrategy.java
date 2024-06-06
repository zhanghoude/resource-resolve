package com.videoselenium.strategy.impl;

import com.google.common.collect.Lists;
import com.videoselenium.domain.response.ResolveResult;
import com.videoselenium.strategy.ResolveStrategy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Objects;

public class DyResolveStrategy implements ResolveStrategy {
    @Override
    public ResolveResult resolve(WebDriver driver) {

        List<String> imgLinks = Lists.newArrayList();
        List<WebElement> imgTags = driver.findElements(By.tagName("img"));
        imgTags.forEach(x -> {
            String alt = x.getAttribute("alt");
            if (alt != null && x.getAttribute("src").contains("douyinpic.com")) {
                imgLinks.add(x.getAttribute("src"));
            }
        });

        List<String> videoLinks = Lists.newArrayList();
        List<WebElement> videoTags = driver.findElements(By.tagName("video"));
        videoTags.forEach(x -> {
            if (Objects.nonNull(x.findElements(By.tagName("source")))) {
                List<WebElement> source = x.findElements(By.tagName("source"));
                source.forEach(y -> {
                    if (Objects.nonNull(y.getAttribute("src")) && y.getAttribute("src").contains("www.douyin.com")) {
                        videoLinks.add(y.getAttribute("src"));
                    }
                });
            }
        });

        return new ResolveResult(imgLinks, videoLinks);
    }

}

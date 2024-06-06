package com.videoselenium.strategy;

import com.videoselenium.domain.response.ResolveResult;
import org.openqa.selenium.WebDriver;

public interface ResolveStrategy {

    ResolveResult resolve(WebDriver driver);

}

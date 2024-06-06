package com.videoselenium.controller;

import com.alibaba.fastjson.JSON;
import com.videoselenium.context.ResolveContext;
import com.videoselenium.domain.response.ResolveResult;

public class VideoController {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Google\\Chrome\\Application\\chromedriver.exe");
        ResolveContext context = new ResolveContext();
        ResolveResult resolve = context.resolve("https://twitter.com/ChampionsLeague/status/1695075341646155881");

        String jsonString = JSON.toJSONString(resolve);
        System.out.println(jsonString);
    }

}

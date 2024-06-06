package com.videoselenium;

import com.alibaba.fastjson.JSON;
import com.videoselenium.context.ResolveContext;
import com.videoselenium.domain.response.ResolveResult;

public class ITest {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Google\\Chrome\\Application\\chromedriver.exe");
        ResolveContext context = new ResolveContext();
        ResolveResult resolve = context.resolve("https://www.kuaishou.com/short-video/3xtnqai9ygggc5y");

        String jsonString = JSON.toJSONString(resolve);
        System.out.println(jsonString);
    }

}

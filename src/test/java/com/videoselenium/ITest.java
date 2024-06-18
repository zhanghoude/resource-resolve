package com.videoselenium;

import com.alibaba.fastjson.JSON;
import com.videoselenium.constant.Constants;
import com.videoselenium.context.ResolveContext;
import com.videoselenium.domain.response.ResolveResult;

public class ITest {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", Constants.CHROMEDRIVER_PATH);
        ResolveContext context = new ResolveContext();
        ResolveResult resolve = context.resolve("https://www.kuaishou.com/short-video/3xtnqai9ygggc5y");

        String jsonString = JSON.toJSONString(resolve);
        System.out.println(jsonString);
    }

}

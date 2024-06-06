package com.videoselenium.handler;

import com.videoselenium.strategy.ResolveStrategy;
import com.videoselenium.strategy.impl.DefaultResolveStrategy;
import com.videoselenium.strategy.impl.DyResolveStrategy;

/**
 * 抖音
 */
public class DyLinkHandler extends LinkHandler {

    @Override
    public ResolveStrategy handleRequest(String url) {
        if (url.contains("douyin.com")) {
            if (url.contains("/user")) {
                return new DefaultResolveStrategy();
            }

            return new DyResolveStrategy();
        }

        return null;
    }

}

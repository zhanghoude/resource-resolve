package com.videoselenium.handler;

import com.videoselenium.strategy.ResolveStrategy;
import com.videoselenium.strategy.impl.DefaultResolveStrategy;
import com.videoselenium.strategy.impl.DyResolveStrategy;

/**
 * 抖音链接处理器
 *
 * @author kirito
 * @version 1.0
 * @date 2024/5/14
 * @since 1.0
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

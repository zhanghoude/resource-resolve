package com.videoselenium.handler;

import com.videoselenium.strategy.ResolveStrategy;
import com.videoselenium.strategy.impl.DefaultResolveStrategy;
import com.videoselenium.strategy.impl.DyResolveStrategy;
import com.videoselenium.strategy.impl.TiktokResolveStrategy;

/**
 * 抖音链接处理器
 *
 * @author kirito
 * @version 1.0
 * @date 2024/5/14
 * @since 1.0
 */
public class TiktokLinkHandler extends LinkHandler {

    @Override
    public ResolveStrategy handleRequest(String url) {
        if (url.contains("tiktok.com")) {
            if (url.contains("/video")) {
                return new TiktokResolveStrategy();
            }
            return new DefaultResolveStrategy();
        }
        return null;
    }

}

package com.videoselenium.handler;

import com.videoselenium.strategy.ResolveStrategy;
import com.videoselenium.strategy.impl.InsResolveStrategy;

/**
 * Ins链接处理器
 *
 * @author kirito
 * @version 1.0
 * @date 2024/5/14
 * @since 1.0
 */
public class InsLinkHandler extends LinkHandler {

    @Override
    public ResolveStrategy handleRequest(String url) {
        return url.contains("instagram.com") ? new InsResolveStrategy() : null;
    }

}

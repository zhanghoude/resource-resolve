package com.videoselenium.handler;

import com.videoselenium.strategy.ResolveStrategy;
import com.videoselenium.strategy.impl.DefaultResolveStrategy;
import com.videoselenium.strategy.impl.KsResolveStrategy;
import com.videoselenium.strategy.impl.XhsResolveStrategy;

/**
 * 快手链接处理器
 *
 * @author kirito
 * @version 1.0
 * @date 2024/5/14
 * @since 1.0
 */
public class KsHandler extends LinkHandler {

    @Override
    public ResolveStrategy handleRequest(String url) {
        return url.contains("kuaishou.com/short-video") ? new KsResolveStrategy() : new DefaultResolveStrategy();
    }

}
package com.videoselenium.handler;

import com.videoselenium.strategy.ResolveStrategy;
import com.videoselenium.strategy.impl.DefaultResolveStrategy;
import com.videoselenium.strategy.impl.KsResolveStrategy;
import com.videoselenium.strategy.impl.XhsResolveStrategy;

/**
 * 快手
 */
public class KsHandler extends LinkHandler {

    @Override
    public ResolveStrategy handleRequest(String url) {
        return url.contains("kuaishou.com/short-video") ? new KsResolveStrategy() : new DefaultResolveStrategy();
    }

}
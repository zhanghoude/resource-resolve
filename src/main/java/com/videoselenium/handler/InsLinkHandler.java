package com.videoselenium.handler;

import com.videoselenium.strategy.ResolveStrategy;
import com.videoselenium.strategy.impl.InsResolveStrategy;

/**
 * ins
 */
public class InsLinkHandler extends LinkHandler {

    @Override
    public ResolveStrategy handleRequest(String url) {
        return url.contains("instagram.com") ? new InsResolveStrategy() : null;
    }

}

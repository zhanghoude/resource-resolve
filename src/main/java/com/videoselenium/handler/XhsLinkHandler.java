package com.videoselenium.handler;

import com.videoselenium.strategy.ResolveStrategy;
import com.videoselenium.strategy.impl.DefaultResolveStrategy;
import com.videoselenium.strategy.impl.XhsResolveStrategy;

/**
 * 小红书链接处理器
 *
 * @author kirito
 * @version 1.0
 * @date 2024/5/14
 * @since 1.0
 */
public class XhsLinkHandler extends LinkHandler {

    @Override
    public ResolveStrategy handleRequest(String url) {
        if (url.contains("xiaohongshu.com")) {
            if (url.contains("/user/profile")) {
                return new DefaultResolveStrategy();
            }

            return new XhsResolveStrategy();
        }

        return null;
    }

}

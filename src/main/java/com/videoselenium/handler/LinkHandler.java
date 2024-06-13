package com.videoselenium.handler;

import com.videoselenium.strategy.ResolveStrategy;

/**
 * 抽象链接处理器
 *
 * @author kirito
 * @version 1.0
 * @date 2024/5/14
 * @since 1.0
 */
public abstract class LinkHandler {
    public abstract ResolveStrategy handleRequest(String url);

}

package com.videoselenium.handler;

import com.videoselenium.strategy.ResolveStrategy;

public abstract class LinkHandler {
    public abstract ResolveStrategy handleRequest(String url);

}

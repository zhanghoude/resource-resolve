package com.videoselenium.context;

import com.videoselenium.handler.LinkHandler;
import com.videoselenium.strategy.ResolveStrategy;
import com.videoselenium.strategy.impl.DefaultResolveStrategy;
import org.reflections.Reflections;

import java.util.Set;

/**
 * 责任链模式上下文处理类
 *
 * @author kirito
 * @version 1.0
 * @date 2024/5/14
 * @since 1.0
 */
public class LinkHandlerScannerContext {

    public static ResolveStrategy handle(String url) {
        ResolveStrategy strategy = null;
        // 创建Reflections对象，指定要扫描的包名
        Reflections reflections = new Reflections("com.videoselenium.handler");

        // 获取所有继承了Handler的子类
        Set<Class<? extends LinkHandler>> handlerClasses = reflections.getSubTypesOf(LinkHandler.class);

        // 实例化所有Handler子类
        for (Class<? extends LinkHandler> handlerClass : handlerClasses) {
            try {
                LinkHandler handler = handlerClass.getDeclaredConstructor().newInstance();
                ResolveStrategy handled = handler.handleRequest(url);
                if (handled != null) {
                    strategy = handled;
                    break;
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        return null == strategy ? new DefaultResolveStrategy() : strategy;
    }

}

package com.videoselenium.domain.request;

import lombok.Data;

/**
 * 请求包装
 *
 * @author kirito
 * @version 1.0
 * @date 2024/5/14
 * @since 1.0
 */
@Data
public class ResolveRequest {

    /**
     * 需要解析的url
     */
    private String url;

    private String sign;

}

package com.videoselenium.controller;

import com.videoselenium.api.R;
import com.videoselenium.context.ResolveContext;
import com.videoselenium.domain.request.ResolveRequest;
import com.videoselenium.domain.response.ResolveResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 解析控制器
 *
 * @author kirito
 * @version 1.0
 * @date 2024/5/14
 * @since 1.0
 */
@RestController
public class ResolveController {

    /**
     * 解析url入口
     * @param request
     * @return
     */
    @PostMapping("/resolve")
    public R<ResolveResult> resolve(@RequestBody ResolveRequest request) {
        ResolveContext context = new ResolveContext();

        return R.data(context.resolve(request.getUrl()));
    }

}

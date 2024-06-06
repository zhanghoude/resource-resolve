package com.videoselenium.domain.response;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class ResolveResult implements Serializable {

    /**
     * 图片链接
     */
    private List<String> imgLinks;

    /**
     * 视频链接
     */
    private List<String> videoLinks;

    public ResolveResult(List<String> imgLinks, List<String> videoLinks) {
        this.imgLinks = imgLinks;
        this.videoLinks = videoLinks;
    }
}

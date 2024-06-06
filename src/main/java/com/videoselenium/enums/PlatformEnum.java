package com.videoselenium.enums;

import lombok.Getter;
@Getter
public enum PlatformEnum {

    INS("INS", "instagram"),
    DY("DY", "dy");

    private final String code;
    private final String desc;

    PlatformEnum(String code, String desc) {
        this.code = code;
        this.desc = desc;
    }

}

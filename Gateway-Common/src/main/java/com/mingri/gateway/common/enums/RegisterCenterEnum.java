package com.mingri.gateway.common.enums;

import lombok.Getter;


/**
 * 注册中心
 */
@Getter
public enum RegisterCenterEnum {

    NACOS("nacos"),
    ZOOKEEPER("zookeeper");

    private final String des;

    RegisterCenterEnum(String des) {
        this.des = des;
    }

}

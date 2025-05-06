package com.mingri.gateway.common.enums;

import lombok.Getter;


/**
 * 配置中心
 */
@Getter
public enum ConfigCenterEnum {

    NACOS("nacos"),
    ZOOKEEPER("zookeeper");

    private final String des;

    ConfigCenterEnum(String des) {
        this.des = des;
    }

}

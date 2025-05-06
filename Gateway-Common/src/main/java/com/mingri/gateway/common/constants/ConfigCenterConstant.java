package com.mingri.gateway.common.constants;


import com.mingri.gateway.common.enums.ConfigCenterEnum;


/**
 * 配置中心
 */
public final class ConfigCenterConstant {

    public static final boolean CONFIG_CENTER_DEFAULT_ENABLED = false; // 是否开启配置中心，为了方便起项目，默认关闭

    public static final ConfigCenterEnum CONFIG_CENTER_DEFAULT_IMPL = ConfigCenterEnum.NACOS; // 配置中心默认实现

    public static final String CONFIG_CENTER_DEFAULT_ADDRESS = "127.0.0.1:8848"; // 配置中心默认地址


}


package com.mingri.gateway.common.constants;

import com.mingri.gateway.common.enums.RegisterCenterEnum;


/**
 * 注册中心
 */
public class RegisterCenterConstant {

    public static final RegisterCenterEnum REGISTER_CENTER_DEFAULT_IMPL = RegisterCenterEnum.NACOS; // 注册中心默认实现

    public static final String REGISTER_CENTER_DEFAULT_ADDRESS = "127.0.0.1:8848"; // 默认注册中心地址

}

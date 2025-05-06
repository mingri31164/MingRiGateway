package com.mingri.gateway.config.pojo;

import lombok.Data;

import java.util.*;


@Data
public class RouteDefinition {

    // 路由id
    private String id = UUID.randomUUID().toString();

    // 服务名
    private String serviceName;

    // 路由的URI，/xxx/yyy/** 的格式
    private String uri;

    // 路由顺序，当请求匹配到多个路由时，选择顺序小的
    private int order = 0;


}























package com.mingri.gateway.config.loader;


import com.mingri.gateway.config.config.Config;
import com.mingri.gateway.config.util.ConfigUtil;

import static com.mingri.gateway.common.constants.ConfigConstant.CONFIG_PATH;
import static com.mingri.gateway.common.constants.ConfigConstant.CONFIG_PREFIX;

/**
 * 配置加载
 */
public class ConfigLoader {

    public static Config load(String[] args) {
        return ConfigUtil.loadConfigFromYaml(CONFIG_PATH, Config.class, CONFIG_PREFIX);
    }

}

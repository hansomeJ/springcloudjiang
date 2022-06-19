package com.jiang.springcloud.order.config;

import feign.Logger;
import feign.Request;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * feign配置类
 * 加上@Configuration表示全局配置类，如果只想针对某个服务进行配置，就不要加入该注解
 */
//@Configuration
public class FeignConfig {

    @Bean
    public Logger.Level feignLoggerLevel() {
        return Logger.Level.FULL;
    }

    @Bean
    public Request.Options requestOptions() {
        return new  Request.Options(5000, 10000);
    }
}

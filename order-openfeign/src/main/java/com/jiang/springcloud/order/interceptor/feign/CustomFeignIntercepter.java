package com.jiang.springcloud.order.interceptor.feign;

import org.slf4j.Logger;
import feign.RequestInterceptor;
import feign.RequestTemplate;
import org.slf4j.LoggerFactory;

public class CustomFeignIntercepter implements RequestInterceptor {
    Logger logger = LoggerFactory.getLogger(this.getClass());
    // TODO 加个商品微服务
    @Override
    public void apply(RequestTemplate requestTemplate) {
//        requestTemplate.header("xxx", "xxx");
//        requestTemplate.query("id", "111");
//        requestTemplate.uri("");
        logger.info("feign拦截器！");
    }
}

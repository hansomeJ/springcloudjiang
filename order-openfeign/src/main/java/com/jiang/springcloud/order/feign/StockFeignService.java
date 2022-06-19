package com.jiang.springcloud.order.feign;

import com.jiang.springcloud.order.config.FeignConfig;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

// 指定要调用的rest接口对应的服务名，path为对应服务的requestmapping中的值
// 实现对应服务的接口和方法
// configuration = FeignConfig.class 指定配置类
//@FeignClient(name = "stock-service", path = "/stock",configuration = FeignConfig.class)
@FeignClient(name = "stock-service", path = "/stock")
public interface StockFeignService {
    @RequestMapping("/reduct")
    String reduct();
}

/* @RestController
@RequestMapping("/stock")
public class StockController {
    @Value("${server.port}")
    String port;

    @RequestMapping("/reduct")
    public String reduct() {
        System.out.println("扣减库存");
        return "扣减库存" + port;
    }
}
* */
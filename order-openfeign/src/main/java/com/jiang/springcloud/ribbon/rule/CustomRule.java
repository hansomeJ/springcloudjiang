package com.jiang.springcloud.ribbon.rule;

import com.netflix.client.config.IClientConfig;
import com.netflix.loadbalancer.AbstractLoadBalancerRule;
import com.netflix.loadbalancer.ILoadBalancer;
import com.netflix.loadbalancer.Server;
import jdk.internal.dynalink.linker.LinkerServices;

import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

// 自定义负载均衡策略
public class CustomRule extends AbstractLoadBalancerRule {

    @Override
    public void initWithNiwsConfig(IClientConfig iClientConfig) {
    }

    @Override
    public Server choose(Object o) {
        ILoadBalancer loadBalancer = this.getLoadBalancer();
        // 获得当前请求的服务实例列表
        List<Server> reachableServers = loadBalancer.getReachableServers();
        int ramdom = ThreadLocalRandom.current().nextInt(reachableServers.size());
        return reachableServers.get(ramdom);
    }
}

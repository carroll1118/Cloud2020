package com.atguigu.springcloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @Auther Carroll
 * @Date 2020/3/26
 * @e-mail ggq_carroll@163.com
 */
@Configuration
public class ApplicationContextConfig {
    @Bean
    @LoadBalanced //RestTemplate结合Ribbon做负载均衡一定要加@LoadBalanced
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
}

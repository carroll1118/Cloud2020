package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @Auther Carroll
 * @Date 2020/3/24
 * @e-mail ggq_carroll@163.com
 */
/*  Eureka有两个组件，一定要标清楚哪个是Server，哪个是Client。
    @EnableEurekaServer代表服务注册中心
*/
@SpringBootApplication
@EnableEurekaServer
public class EurekaMain7001 {
    public static void main(String[] args) {
        SpringApplication.run(EurekaMain7001.class,args);
    }
}

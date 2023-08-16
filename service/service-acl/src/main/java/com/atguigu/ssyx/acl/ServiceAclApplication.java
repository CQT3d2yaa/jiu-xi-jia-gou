package com.atguigu.ssyx.acl;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;

/**
 * @designer ks&taotao
 * @create 2023-06-27 21:47
 */
//权限管理模块启动类
@SpringBootApplication
@ComponentScan("com.atguigu.ssyx")
@MapperScan("com.atguigu.ssyx.*.mapper")
@EnableDiscoveryClient
public class ServiceAclApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceAclApplication.class, args);
    }

}

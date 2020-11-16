package com.uaena.gulimall.product;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * 整合Mybatis-Plus
 * 配置:
 * 1.配置数据源
 *   a 导入数据库驱动
 *   b 配置yml
 * 2.配置Mybatis-Plus
 *   a 使用MapperScan
 *   b 设置映射位置 yml
 */
@EnableDiscoveryClient
@MapperScan("com.uaena.gulimall.product.dao")
@SpringBootApplication
public class GulimallProductApplication {

    public static void main(String[] args) {
        SpringApplication.run(GulimallProductApplication.class, args);
    }

}

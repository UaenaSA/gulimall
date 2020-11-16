package com.uaena.gulimall.coupon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * 配置中心
 * 1 引入因爱
 * 2 创建bootstrap。properties
 * 3 配置中心默认添加 Data ID gulimall-coupon。properties （应用名。properties）
 * 4 添加配置
 * 5 在controller加上@RefreshScope 动态刷新
 * 6 @Value($属性名) 获取配置
 * 细节
 * 1 命名空间：配置隔离（基于环境 基于服务）
 *      默认：public 开发测试生产 利用命名空间做环境隔离
 *      在bootstrap配置namespace的id
 *      每一个微服务之间相互隔离，每一个微服务都创建一个命名空间，只加载自己命名空间的配置
 *
 * 2 配置集
 * 3 配置集id
 * 4 配置分组
 *
 * 每个微服务创建自己的命名空间 使用配置分组进行环境隔离 dev prod test
 *
 * 加载多个配置集
 * 1 微服务任何配置信息都可以放在配置中心
 * 2 在bootstrap配置
 * 3 优先使用配置中心
 */
@EnableDiscoveryClient
@SpringBootApplication
public class GulimallCouponApplication {

    public static void main(String[] args) {
        SpringApplication.run(GulimallCouponApplication.class, args);
    }

}

package com.wcmei.demo.service.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * @author wcmei
 * @date 2019-12-16
 * @description
 */
@SpringBootApplication
@EnableDiscoveryClient
@EntityScan(value = {"com.wcmei.demo.service.user.domain", "com.wcmei.demo.commons.domain"})
@MapperScan(value = {"com.wcmei.demo.service.user.mapper", "com.wcmei.demo.commons.mybatis.mapper"})
@EnableJpaRepositories(value = {"com.wcmei.demo.service.user.repository", "com.wcmei.demo.commons.jpa.repository"})
public class DemoUserServiceProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoUserServiceProviderApplication.class, args);
    }
    //指定启动配置文件
//    public static void main(String[] args) {
//        new SpringApplicationBuilder(RedisApplication.class)
//                .properties(DevConstants.SPRING_PROFILE)
//                .run(args);
//        Main.main(args);
//    }
//
//    public class DevConstants {
    //对应：bootstrap-dev.properties配置文件
//        public static final String SPRING_PROFILE = "spring.profiles.active=dev";
//    }
}

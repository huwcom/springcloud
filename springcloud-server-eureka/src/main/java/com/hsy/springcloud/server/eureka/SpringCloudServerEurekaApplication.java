package com.hsy.springcloud.server.eureka;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @description <p></p>
 * @author heshiyuan
 * @date 2017/12/11 10:16
 */
@EnableEurekaServer // 注解启动一个服务注册中心提供给其他应用进行会话
@SpringBootApplication
public class SpringCloudServerEurekaApplication {
    public static void main(String[] args) {
        new SpringApplicationBuilder(SpringCloudServerEurekaApplication.class).web(true).run(args);
    }
}

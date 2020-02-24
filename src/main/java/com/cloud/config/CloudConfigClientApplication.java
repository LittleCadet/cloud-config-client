package com.cloud.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Author LittleCadet
 * @Date 2020/2/23
 */
@EnableEurekaClient
@SpringBootApplication
public class CloudConfigClientApplication
{
    public static void main(String[] args)
    {
        SpringApplication.run(CloudConfigClientApplication.class,args);
    }
}

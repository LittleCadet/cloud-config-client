package com.cloud.config.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author LittleCadet
 * @Date 2020/2/23
 */
@RestController
@RequestMapping("/config")
public class ConfigController
{
    @Value("${profile}")
    private String profile;

    @GetMapping("/client")
    public String showInfo(){
        return this.profile;
    }
}

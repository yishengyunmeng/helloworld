package com.atguig.springboot.helloworld.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.xml.ws.Service;

@RestController
public class helloControer {
    @Value("${server.port}")
    private Integer port;

    @Value("${user.username}")
    private String username;

    @RequestMapping("/hello")
    public String hello(){
        System.out.println(username);
        return "springboot 访问成功!";
    }
}

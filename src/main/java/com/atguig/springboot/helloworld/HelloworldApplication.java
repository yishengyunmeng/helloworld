package com.atguig.springboot.helloworld;

import com.atguig.springboot.helloworld.bean.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class HelloworldApplication {

    public static void main(String[] args) {
        ApplicationContext ioc = SpringApplication.run(HelloworldApplication.class, args);
        User user = (User)ioc.getBean("user");
        System.out.println(user);
    }

}

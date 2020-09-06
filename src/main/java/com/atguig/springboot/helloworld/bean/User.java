package com.atguig.springboot.helloworld.bean;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.io.Serializable;
@Component  //将javabean实例化到spring ioc容器中
//@ConfigurationProperties(value="user")
//2.通过注解 @ConfigurationProperties (prefix="配置文件中的key的前缀")可以将配置文件中的配置自动与实体进行映射
public class User implements Serializable {
    private String username;
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}

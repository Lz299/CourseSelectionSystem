package com.xxxy.no1.courseselectionsystem.config;

import com.xxxy.no1.courseselectionsystem.interceptors.LoginInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Autowired
    private LoginInterceptor loginInterceptor;


    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        //放行登录注册接口
       //registry.addInterceptor(loginInterceptor).excludePathPatterns("/user/login","/user/register");
    }
}

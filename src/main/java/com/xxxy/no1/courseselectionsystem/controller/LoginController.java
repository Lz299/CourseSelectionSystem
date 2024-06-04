package com.xxxy.no1.courseselectionsystem.controller;

import com.xxxy.no1.courseselectionsystem.domain.Students;
import com.xxxy.no1.courseselectionsystem.service.LoginService;
import com.xxxy.no1.courseselectionsystem.utils.JwtUtil;
import com.xxxy.no1.courseselectionsystem.utils.Md5Util;
import com.xxxy.no1.courseselectionsystem.utils.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

@RestController
@RequestMapping("/login")
public class LoginController {
    @Autowired
    private LoginService loginService;

    @RequestMapping("/student")
    public Result<String> studentLogin(String username,String password,String captcha) {

        //验证captcha验证码

            String str=loginService.studentLogin(username,password);
            if (str!="err"){
                return Result.success(str);
            }else {
                return Result.error("密码错误");
            }
        }


    @PostMapping("/teacher")
    public Result<String> teacherLogin(String username,String password,String captcha){
        //验证captcha验证码
        String str=loginService.teacherLogin(username,password);

        if (str!="err"){
            return Result.success(str);
        }else {
            return Result.error("密码错误");
        }
    }

    @PostMapping("/admin")
    public Result<String> adminLogin(String username,String password,String captcha){
        //验证captcha验证码
        String str=loginService.adminLogin(username,password);
        if (str!="err"){
            return Result.success(str);
        }else {
            return Result.error("密码错误");
        }
    }

}

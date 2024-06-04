package com.xxxy.no1.courseselectionsystem.service.impl;

import com.xxxy.no1.courseselectionsystem.domain.Admin;
import com.xxxy.no1.courseselectionsystem.domain.Students;
import com.xxxy.no1.courseselectionsystem.domain.Teachers;
import com.xxxy.no1.courseselectionsystem.mapper.AdminMapper;
import com.xxxy.no1.courseselectionsystem.mapper.StudentsMapper;
import com.xxxy.no1.courseselectionsystem.mapper.TeachersMapper;
import com.xxxy.no1.courseselectionsystem.service.LoginService;
import com.xxxy.no1.courseselectionsystem.utils.JwtUtil;
import com.xxxy.no1.courseselectionsystem.utils.Md5Util;
import com.xxxy.no1.courseselectionsystem.utils.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

@Service
public class LoginServiceImpl implements LoginService {
    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @Autowired
    private StudentsMapper studentsMapper;

    @Autowired
    private TeachersMapper teachersMapper;

    @Autowired
    private AdminMapper adminMapper;

    @Override
    public String studentLogin(String username,String password) {
        Students loginUser = studentsMapper.selectStudentsByStudentNumber(username);
        if (loginUser == null) {
            return "学号错误";
        }
        if (Md5Util.getMD5String(password).equals(loginUser.getStudentPassword())) {

            Map<String, Object> map = new HashMap<>();
            map.put("id", loginUser.getStudentId());
            map.put("username", loginUser.getStudentName());
            String token = JwtUtil.genToken(map);

            //tokrn -> redis
            ValueOperations<String, String> vo = stringRedisTemplate.opsForValue();
            vo.set("token", token, 1, TimeUnit.HOURS);

            return token;
        }
        return "err";
    }

    @Override
    public String teacherLogin(String username,String password) {
        Teachers loginUser = teachersMapper.selectTeachersByTeacherNumber(username);
        if (loginUser == null) {
            return "工号错误";
        }
        if (Md5Util.getMD5String(password).equals(loginUser.getTeacherPassword())) {

            Map<String, Object> map = new HashMap<>();
            map.put("id", loginUser.getTeacherId());
            map.put("username", loginUser.getTeacherName());
            String token = JwtUtil.genToken(map);

            //tokrn -> redis
            ValueOperations<String, String> vo = stringRedisTemplate.opsForValue();
            vo.set("token", token, 1, TimeUnit.HOURS);

            return token;
        }
        return "err";
    }

    @Override
    public String adminLogin(String username,String password) {
        Admin loginUser = adminMapper.selectAdminByAdminNumber(username);
        if (loginUser == null) {
            return "用户名错误";
        }
        if (Md5Util.getMD5String(password).equals(loginUser.getAdminPassword())) {

            Map<String, Object> map = new HashMap<>();
            map.put("id", loginUser.getAdminId());
            map.put("username", loginUser.getAdminName());
            String token = JwtUtil.genToken(map);

            //tokrn -> redis
            ValueOperations<String, String> vo = stringRedisTemplate.opsForValue();
            vo.set("token", token, 1, TimeUnit.HOURS);

            return token;
        }
        return "err";
    }
}

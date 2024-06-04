package com.xxxy.no1.courseselectionsystem.service;

import com.xxxy.no1.courseselectionsystem.domain.Admin;
import com.xxxy.no1.courseselectionsystem.domain.Students;
import com.xxxy.no1.courseselectionsystem.domain.Teachers;

public interface LoginService {

    String studentLogin(String username,String password);

    String teacherLogin(String username,String password);

    String adminLogin(String username,String password);
}

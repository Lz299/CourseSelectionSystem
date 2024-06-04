package com.xxxy.no1.courseselectionsystem.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.xxxy.no1.courseselectionsystem.utils.ExcelUtils;
import lombok.Data;

/**
 * 学生对象 students
 * 
 * @author ruoyi
 * @date 2024-05-20
 */
@Data
public class Students
{

    /** 学生id */
    private Integer studentId;

    /** 学号 */
    @ExcelUtils.ExcelImport("number")
    private String studentNumber;

    /** 学生姓名 */
    @ExcelUtils.ExcelImport("name")
    private String studentName;

    /** 学生年龄 */
    @ExcelUtils.ExcelImport("age")
    private Integer studentAge;

    /** 学生性别 */
    @ExcelUtils.ExcelImport("sex")
    private String studentSex;

    /** 学生邮箱 */
    private String studentEmail;

    /** 学生手机号 */
    @ExcelUtils.ExcelImport("phone")
    private String studentPhone;

    /** 学生密码 */
    @ExcelUtils.ExcelImport("password")
    private String studentPassword;

    /** 学生班级 */
    @ExcelUtils.ExcelImport("student_class")
    private String studentClass;

    /** 学生头像 */
    private String studentImg;

    /** 学生学院id */
    @ExcelUtils.ExcelImport("collegeId")
    private Integer collegeId;

    /** 注册时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date registrationDate;


}

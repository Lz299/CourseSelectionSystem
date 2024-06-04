package com.xxxy.no1.courseselectionsystem.domain;

import lombok.Data;
/**
 * 教师对象 teachers
 * 
 * @author ruoyi
 * @date 2024-05-20
 */
@Data
public class Teachers
{
    private static final long serialVersionUID = 1L;

    /** 教师id */
    private Integer teacherId;

    /** 教师工号 */
    private String teacherNumber;

    /** 教师姓名 */
    private String teacherName;

    /** 教师性别 */
    private String teacherSex;

    /** 教师邮箱 */
    private String teacherEmail;

    /** 教师手机号 */
    private String teacherPhone;

    /** 教师职称 */
    private String teacherTitle;

    /** 教师头像 */
    private String teacherImg;

    /** 教师信息 */
    private String info;

    /** 教师密码 */
    private String teacherPassword;


}

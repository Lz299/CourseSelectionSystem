package com.xxxy.no1.courseselectionsystem.domain;


import lombok.Data;

/**
 * 课程类型对象 coursetypes
 * 
 * @author ruoyi
 * @date 2024-05-20
 */
@Data
public class Coursetypes
{

    /** 课程类型id */
    private Integer coursetypesId;

    /** 课程类型名称 */
    private String coursetypesName;

    /** 学院id */
    private Integer collegeId;


}

package com.xxxy.no1.courseselectionsystem.domain;


import lombok.Data;

/**
 * 学分要求对象 creditrequirements
 * 
 * @author ruoyi
 * @date 2024-05-20
 */
@Data
public class Creditrequirements
{

    /** 学分要求id */
    private Integer creditrequirementId;

    /** 学院id */
    private Integer collegeId;

    /** 课程类型id */
    private Integer coursetypesId;

    /** 所需学分 */
    private Double creditrequirementCredits;


}

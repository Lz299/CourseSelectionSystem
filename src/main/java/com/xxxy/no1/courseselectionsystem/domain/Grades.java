package com.xxxy.no1.courseselectionsystem.domain;


import lombok.Data;

/**
 * 成绩对象 grades
 * 
 * @author ruoyi
 * @date 2024-05-20
 */
@Data
public class Grades
{


    /** 成绩记录ID */

    private String gradeId;

    /** 学生ID */

    private Integer studentId;

    /** 课程ID */
    private Integer courseId;

    /** 学期ID */

    private Integer semesterId;

    /** 最终成绩（百分制） */
    private Double finalGrade;


}

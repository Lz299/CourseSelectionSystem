package com.xxxy.no1.courseselectionsystem.domain;


import lombok.Data;

/**
 * 考试成绩对象 examgrades
 * 
 * @author ruoyi
 * @date 2024-05-20
 */
@Data
public class Examgrades {

    /** 考试成绩记录ID */
    private Integer examGradeId;

    /** 学生ID */
    private Integer studentId;

    /** 考试ID */

    private Integer examId;

    /** 考试成绩（百分制） */
    private Double score;


}

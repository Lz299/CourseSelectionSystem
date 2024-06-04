package com.xxxy.no1.courseselectionsystem.domain;

import lombok.Data;

/**
 * 课程对象 courses
 * 
 * @author ruoyi
 * @date 2024-05-20
 */
@Data
public class Courses
{

    /** 课程id */
    private Long courseId;

    /** 课程名称 */

    private String courseName;

    /** 课程代码 */

    private String courseCode;

    /** 课程类型 */

    private String courseType;

    /** 课程描述 */

    private String courseDescription;

    /** 学时 */

    private Double time;

    /** 学分 */

    private Double credits;

    /** 教师id */

    private Long teacherId;


}

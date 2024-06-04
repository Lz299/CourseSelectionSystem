package com.xxxy.no1.courseselectionsystem.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;


/**
 * 选课记录对象 enrollments
 * 
 * @author ruoyi
 * @date 2024-05-20
 */
@Data
public class Enrollments
{


    /** 选课记录id */
    private Integer enrollmentId;

    /** 学生id */
    private Integer studentId;

    /** 课程id */

    private Integer courseId;

    /** 学期id */

    private Integer semesterId;

    /** 选课状态 */

    private String enrollmentStatus;

    /** 选课日期 */
    @JsonFormat(pattern = "yyyy-MM-dd")

    private Date enrollmentDate;


}

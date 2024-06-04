package com.xxxy.no1.courseselectionsystem.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;


/**
 * 考试对象 exams
 * 
 * @author ruoyi
 * @date 2024-05-20
 */
@Data
public class Exams
{


    /** 考试ID */
    private Integer examId;

    /** 课程ID */
    private Integer courseId;

    /** 考试名称 */
    private String examName;

    /** 考试日期 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date examDate;

    /** 考试开始时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date examStartTime;

    /** 考试结束时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date examEndTime;


}

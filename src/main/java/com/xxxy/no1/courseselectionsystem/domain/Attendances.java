package com.xxxy.no1.courseselectionsystem.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;


/**
 * 考勤记录对象 attendances
 * 
 * @author ruoyi
 * @date 2024-05-20
 */

@Data
public class Attendances
{

    /** 考勤记录ID */
    private Integer attendanceId;

    /** 学生id */

    private Integer studentId;

    /** 课程ID */

    private Integer courseId;

    /** 考勤日期 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date attendanceDate;

    /** 考勤状态（出勤、缺勤、迟到、请假） */
    private String attendanceStatus;




}

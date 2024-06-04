package com.xxxy.no1.courseselectionsystem.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;


/**
 * 请假记录对象 absences
 * 
 * @author ruoyi
 * @date 2024-05-20
 */
@Data
public class Absences
{


    /** 请假记录ID */
    private Integer absenceId;

    /** 学生ID */
    private Integer studentId;

    /** 课程ID（如果请假是针对特定课程的） */

    private Integer courseId;

    /** 请假日期 */
    @JsonFormat(pattern = "yyyy-MM-dd")

    private Date absenceDate;

    /** 请假原因 */

    private String absenceReason;

    /** 审批状态（待审批、已批准、已拒绝） */
    private String approvalStatus;

    /** 审批人ID */
    private Integer teacherId;


}

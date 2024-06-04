package com.xxxy.no1.courseselectionsystem.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

/**
 * 课程时间对象 courseschedules
 * 
 * @author ruoyi
 * @date 2024-05-20
 */
@Data
public class Courseschedules
{


    /** 课程时间表ID */
    private Integer scheduleId;

    /** 课程ID */

    private Integer courseId;

    /** 星期几 */

    private String dayOfWeek;

    /** 上课开始时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")

    private Date startTime;

    /** 上课结束时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date endTime;

    /** 教室号 */

    private String classroom;


}

package com.xxxy.no1.courseselectionsystem.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;


/**
 * 学期对象 semesters
 * 
 * @author ruoyi
 * @date 2024-05-20
 */
@Data
public class Semesters
{


    /** 学期id */
    private Integer semesterId;

    /** 学期名称（如"2023秋季"） */

    private String semesterName;

    /** 开启时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")

    private Date startDate;

    /** 结束时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")

    private Date endDate;


}

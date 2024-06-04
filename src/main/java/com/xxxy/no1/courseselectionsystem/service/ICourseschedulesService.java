package com.xxxy.no1.courseselectionsystem.service;

import java.util.List;
import com.xxxy.no1.courseselectionsystem.domain.Courseschedules;

/**
 * 课程时间Service接口
 * 
 * @author ruoyi
 * @date 2024-05-20
 */
public interface ICourseschedulesService 
{
    /**
     * 查询课程时间
     * 
     * @param scheduleId 课程时间主键
     * @return 课程时间
     */
    public Courseschedules selectCourseschedulesByScheduleId(Integer scheduleId);

    /**
     * 查询课程时间列表
     * 
     * @param courseschedules 课程时间
     * @return 课程时间集合
     */
    public List<Courseschedules> selectCourseschedulesList(Courseschedules courseschedules);

    /**
     * 新增课程时间
     * 
     * @param courseschedules 课程时间
     * @return 结果
     */
    public int insertCourseschedules(Courseschedules courseschedules);

    /**
     * 修改课程时间
     * 
     * @param courseschedules 课程时间
     * @return 结果
     */
    public int updateCourseschedules(Courseschedules courseschedules);

    /**
     * 批量删除课程时间
     * 
     * @param scheduleIds 需要删除的课程时间主键集合
     * @return 结果
     */
    public int deleteCourseschedulesByScheduleIds(Integer[] scheduleIds);

    /**
     * 删除课程时间信息
     * 
     * @param scheduleId 课程时间主键
     * @return 结果
     */
    public int deleteCourseschedulesByScheduleId(Integer scheduleId);
}

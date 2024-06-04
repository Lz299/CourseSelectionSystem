package com.xxxy.no1.courseselectionsystem.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.xxxy.no1.courseselectionsystem.mapper.CourseschedulesMapper;
import com.xxxy.no1.courseselectionsystem.domain.Courseschedules;
import com.xxxy.no1.courseselectionsystem.service.ICourseschedulesService;

/**
 * 课程时间Service业务层处理
 * 
 * @author ruoyi
 * @date 2024-05-20
 */
@Service
public class CourseschedulesServiceImpl implements ICourseschedulesService 
{
    @Autowired
    private CourseschedulesMapper courseschedulesMapper;

    /**
     * 查询课程时间
     * 
     * @param scheduleId 课程时间主键
     * @return 课程时间
     */
    @Override
    public Courseschedules selectCourseschedulesByScheduleId(Integer scheduleId)
    {
        return courseschedulesMapper.selectCourseschedulesByScheduleId(scheduleId);
    }

    /**
     * 查询课程时间列表
     * 
     * @param courseschedules 课程时间
     * @return 课程时间
     */
    @Override
    public List<Courseschedules> selectCourseschedulesList(Courseschedules courseschedules)
    {
        return courseschedulesMapper.selectCourseschedulesList(courseschedules);
    }

    /**
     * 新增课程时间
     * 
     * @param courseschedules 课程时间
     * @return 结果
     */
    @Override
    public int insertCourseschedules(Courseschedules courseschedules)
    {
        return courseschedulesMapper.insertCourseschedules(courseschedules);
    }

    /**
     * 修改课程时间
     * 
     * @param courseschedules 课程时间
     * @return 结果
     */
    @Override
    public int updateCourseschedules(Courseschedules courseschedules)
    {
        return courseschedulesMapper.updateCourseschedules(courseschedules);
    }

    /**
     * 批量删除课程时间
     * 
     * @param scheduleIds 需要删除的课程时间主键
     * @return 结果
     */
    @Override
    public int deleteCourseschedulesByScheduleIds(Integer[] scheduleIds)
    {
        return courseschedulesMapper.deleteCourseschedulesByScheduleIds(scheduleIds);
    }

    /**
     * 删除课程时间信息
     * 
     * @param scheduleId 课程时间主键
     * @return 结果
     */
    @Override
    public int deleteCourseschedulesByScheduleId(Integer scheduleId)
    {
        return courseschedulesMapper.deleteCourseschedulesByScheduleId(scheduleId);
    }
}

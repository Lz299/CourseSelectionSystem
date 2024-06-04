package com.xxxy.no1.courseselectionsystem.mapper;

import java.util.List;
import com.xxxy.no1.courseselectionsystem.domain.Courseschedules;
import org.apache.ibatis.annotations.Mapper;

/**
 * 课程时间Mapper接口
 * 
 * @author ruoyi
 * @date 2024-05-20
 */
@Mapper
public interface CourseschedulesMapper 
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
     * 删除课程时间
     * 
     * @param scheduleId 课程时间主键
     * @return 结果
     */
    public int deleteCourseschedulesByScheduleId(Integer scheduleId);

    /**
     * 批量删除课程时间
     * 
     * @param scheduleIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteCourseschedulesByScheduleIds(Integer[] scheduleIds);
}

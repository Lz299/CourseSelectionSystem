package com.xxxy.no1.courseselectionsystem.mapper;

import java.util.List;
import com.xxxy.no1.courseselectionsystem.domain.Courses;
import org.apache.ibatis.annotations.Mapper;

/**
 * 课程Mapper接口
 * 
 * @author ruoyi
 * @date 2024-05-20
 */
@Mapper
public interface CoursesMapper 
{
    /**
     * 查询课程
     * 
     * @param courseId 课程主键
     * @return 课程
     */
    public Courses selectCoursesByCourseId(Long courseId);

    /**
     * 查询课程列表
     * 
     * @param courses 课程
     * @return 课程集合
     */
    public List<Courses> selectCoursesList(Courses courses);

    /**
     * 新增课程
     * 
     * @param courses 课程
     * @return 结果
     */
    public int insertCourses(Courses courses);

    /**
     * 修改课程
     * 
     * @param courses 课程
     * @return 结果
     */
    public int updateCourses(Courses courses);

    /**
     * 删除课程
     * 
     * @param courseId 课程主键
     * @return 结果
     */
    public int deleteCoursesByCourseId(Long courseId);

    /**
     * 批量删除课程
     * 
     * @param courseIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteCoursesByCourseIds(Long[] courseIds);
}

package com.xxxy.no1.courseselectionsystem.service;

import java.util.List;
import com.xxxy.no1.courseselectionsystem.domain.Courses;

/**
 * 课程Service接口
 * 
 * @author ruoyi
 * @date 2024-05-20
 */
public interface ICoursesService 
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
     * 批量删除课程
     * 
     * @param courseIds 需要删除的课程主键集合
     * @return 结果
     */
    public int deleteCoursesByCourseIds(Long[] courseIds);

    /**
     * 删除课程信息
     * 
     * @param courseId 课程主键
     * @return 结果
     */
    public int deleteCoursesByCourseId(Long courseId);
}

package com.xxxy.no1.courseselectionsystem.service;

import java.util.List;
import com.xxxy.no1.courseselectionsystem.domain.Students;

/**
 * 学生Service接口
 * 
 * @author ruoyi
 * @date 2024-05-20
 */
public interface IStudentsService 
{
    /**
     * 查询学生
     * 
     * @param studentId 学生主键
     * @return 学生
     */
    public Students selectStudentsByStudentId(Integer studentId);

    /**
     * 查询学生列表
     * 
     * @param students 学生
     * @return 学生集合
     */
    public List<Students> selectStudentsList(Students students);

    /**
     * 新增学生
     * 
     * @param students 学生
     * @return 结果
     */
    public String insertStudents(Students students);

    /**
     * 修改学生
     * 
     * @param students 学生
     * @return 结果
     */
    public int updateStudents(Students students);

    /**
     * 批量删除学生
     * 
     * @param studentIds 需要删除的学生主键集合
     * @return 结果
     */
    public int deleteStudentsByStudentIds(Integer[] studentIds);

    /**
     * 删除学生信息
     * 
     * @param studentId 学生主键
     * @return 结果
     */
    public int deleteStudentsByStudentId(Integer studentId);
}

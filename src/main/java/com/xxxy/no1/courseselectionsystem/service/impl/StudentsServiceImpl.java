package com.xxxy.no1.courseselectionsystem.service.impl;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

import com.xxxy.no1.courseselectionsystem.utils.Md5Util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.xxxy.no1.courseselectionsystem.mapper.StudentsMapper;
import com.xxxy.no1.courseselectionsystem.domain.Students;
import com.xxxy.no1.courseselectionsystem.service.IStudentsService;

/**
 * 学生Service业务层处理
 * 
 * @author ruoyi
 * @date 2024-05-20
 */
@Service
public class StudentsServiceImpl implements IStudentsService 
{
    @Autowired
    private StudentsMapper studentsMapper;



    /**
     * 查询学生
     * 
     * @param studentId 学生主键
     * @return 学生
     */
    @Override
    public Students selectStudentsByStudentId(Integer studentId)
    {
        return studentsMapper.selectStudentsByStudentId(studentId);
    }

    /**
     * 查询学生列表
     * 
     * @param students 学生
     * @return 学生
     */
    @Override
    public List<Students> selectStudentsList(Students students)
    {
        return studentsMapper.selectStudentsList(students);
    }

    /**
     * 新增学生
     * 
     * @param students 学生
     * @return 结果
     */
    @Override
    public String insertStudents(Students students)
    {
      Students user=studentsMapper.selectStudentsByStudentNumber(students.getStudentNumber());
      //查询数据库中有没有重名没有注册
     if (user==null){
         String md5String = Md5Util.getMD5String(students.getStudentPassword());
         students.setStudentPassword(md5String);
         students.setRegistrationDate(new Date());
            studentsMapper.insertStudents(students);
           return "200";
      }else {
          return "用户名已被注册";
     }
    }

    /**
     * 修改学生
     * 
     * @param students 学生
     * @return 结果
     */
    @Override
    public int updateStudents(Students students)
    {
        return studentsMapper.updateStudents(students);
    }

    /**
     * 批量删除学生
     * 
     * @param studentIds 需要删除的学生主键
     * @return 结果
     */
    @Override
    public int deleteStudentsByStudentIds(Integer[] studentIds)
    {
        return studentsMapper.deleteStudentsByStudentIds(studentIds);
    }

    /**
     * 删除学生信息
     * 
     * @param studentId 学生主键
     * @return 结果
     */
    @Override
    public int deleteStudentsByStudentId(Integer studentId)
    {
        return studentsMapper.deleteStudentsByStudentId(studentId);
    }
}

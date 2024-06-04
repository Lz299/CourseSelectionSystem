package com.xxxy.no1.courseselectionsystem.service.impl;

import java.util.Date;
import java.util.List;

import com.xxxy.no1.courseselectionsystem.utils.Md5Util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.xxxy.no1.courseselectionsystem.mapper.TeachersMapper;
import com.xxxy.no1.courseselectionsystem.domain.Teachers;
import com.xxxy.no1.courseselectionsystem.service.ITeachersService;

/**
 * 教师Service业务层处理
 * 
 * @author ruoyi
 * @date 2024-05-20
 */
@Service
public class TeachersServiceImpl implements ITeachersService 
{
    @Autowired
    private TeachersMapper teachersMapper;

    /**
     * 查询教师
     * 
     * @param teacherId 教师主键
     * @return 教师
     */
    @Override
    public Teachers selectTeachersByTeacherId(Integer teacherId)
    {
        return teachersMapper.selectTeachersByTeacherId(teacherId);
    }

    /**
     * 查询教师列表
     * 
     * @param teachers 教师
     * @return 教师
     */
    @Override
    public List<Teachers> selectTeachersList(Teachers teachers)
    {
        return teachersMapper.selectTeachersList(teachers);
    }

    /**
     * 新增教师
     * 
     * @param teachers 教师
     * @return 结果
     */
    @Override
    public String insertTeachers(Teachers teachers)
    {
     Teachers user =teachersMapper.selectTeachersByTeacherNumber(teachers.getTeacherNumber());


        if (user==null){
            String md5String = Md5Util.getMD5String(teachers.getTeacherPassword());
            teachers.setTeacherPassword(md5String);
            teachersMapper.insertTeachers(teachers);
            return "200";
        }else {
            return "用户名已被注册";
        }
    }

    /**
     * 修改教师
     * 
     * @param teachers 教师
     * @return 结果
     */
    @Override
    public int updateTeachers(Teachers teachers)
    {
        return teachersMapper.updateTeachers(teachers);
    }

    /**
     * 批量删除教师
     * 
     * @param teacherIds 需要删除的教师主键
     * @return 结果
     */
    @Override
    public int deleteTeachersByTeacherIds(Integer[] teacherIds)
    {
        return teachersMapper.deleteTeachersByTeacherIds(teacherIds);
    }

    /**
     * 删除教师信息
     * 
     * @param teacherId 教师主键
     * @return 结果
     */
    @Override
    public int deleteTeachersByTeacherId(Integer teacherId)
    {
        return teachersMapper.deleteTeachersByTeacherId(teacherId);
    }
}

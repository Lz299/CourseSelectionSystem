package com.xxxy.no1.courseselectionsystem.mapper;

import java.util.List;
import com.xxxy.no1.courseselectionsystem.domain.Teachers;
import org.apache.ibatis.annotations.Mapper;

/**
 * 教师Mapper接口
 * 
 * @author ruoyi
 * @date 2024-05-20
 */
@Mapper
public interface TeachersMapper 
{
    /**
     * 查询教师
     * 
     * @param teacherId 教师主键
     * @return 教师
     */
    public Teachers selectTeachersByTeacherId(Integer teacherId);

    public Teachers selectTeachersByTeacherNumber(String teacherNumber);
    /**
     * 查询教师列表
     * 
     * @param teachers 教师
     * @return 教师集合
     */
    public List<Teachers> selectTeachersList(Teachers teachers);

    /**
     * 新增教师
     * 
     * @param teachers 教师
     * @return 结果
     */
    public int insertTeachers(Teachers teachers);

    /**
     * 修改教师
     * 
     * @param teachers 教师
     * @return 结果
     */
    public int updateTeachers(Teachers teachers);

    /**
     * 删除教师
     * 
     * @param teacherId 教师主键
     * @return 结果
     */
    public int deleteTeachersByTeacherId(Integer teacherId);

    /**
     * 批量删除教师
     * 
     * @param teacherIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteTeachersByTeacherIds(Integer[] teacherIds);
}

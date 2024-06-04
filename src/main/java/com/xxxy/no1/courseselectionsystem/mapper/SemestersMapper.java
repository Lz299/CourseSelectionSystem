package com.xxxy.no1.courseselectionsystem.mapper;

import java.util.List;
import com.xxxy.no1.courseselectionsystem.domain.Semesters;
import org.apache.ibatis.annotations.Mapper;

/**
 * 学期Mapper接口
 * 
 * @author ruoyi
 * @date 2024-05-20
 */
@Mapper
public interface SemestersMapper 
{
    /**
     * 查询学期
     * 
     * @param semesterId 学期主键
     * @return 学期
     */
    public Semesters selectSemestersBySemesterId(Integer semesterId);

    /**
     * 查询学期列表
     * 
     * @param semesters 学期
     * @return 学期集合
     */
    public List<Semesters> selectSemestersList(Semesters semesters);

    /**
     * 新增学期
     * 
     * @param semesters 学期
     * @return 结果
     */
    public int insertSemesters(Semesters semesters);

    /**
     * 修改学期
     * 
     * @param semesters 学期
     * @return 结果
     */
    public int updateSemesters(Semesters semesters);

    /**
     * 删除学期
     * 
     * @param semesterId 学期主键
     * @return 结果
     */
    public int deleteSemestersBySemesterId(Integer semesterId);

    /**
     * 批量删除学期
     * 
     * @param semesterIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteSemestersBySemesterIds(Integer[] semesterIds);
}

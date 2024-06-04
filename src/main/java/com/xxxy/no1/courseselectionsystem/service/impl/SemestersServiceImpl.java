package com.xxxy.no1.courseselectionsystem.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.xxxy.no1.courseselectionsystem.mapper.SemestersMapper;
import com.xxxy.no1.courseselectionsystem.domain.Semesters;
import com.xxxy.no1.courseselectionsystem.service.ISemestersService;

/**
 * 学期Service业务层处理
 * 
 * @author ruoyi
 * @date 2024-05-20
 */
@Service
public class SemestersServiceImpl implements ISemestersService 
{
    @Autowired
    private SemestersMapper semestersMapper;

    /**
     * 查询学期
     * 
     * @param semesterId 学期主键
     * @return 学期
     */
    @Override
    public Semesters selectSemestersBySemesterId(Integer semesterId)
    {
        return semestersMapper.selectSemestersBySemesterId(semesterId);
    }

    /**
     * 查询学期列表
     * 
     * @param semesters 学期
     * @return 学期
     */
    @Override
    public List<Semesters> selectSemestersList(Semesters semesters)
    {
        return semestersMapper.selectSemestersList(semesters);
    }

    /**
     * 新增学期
     * 
     * @param semesters 学期
     * @return 结果
     */
    @Override
    public int insertSemesters(Semesters semesters)
    {
        return semestersMapper.insertSemesters(semesters);
    }

    /**
     * 修改学期
     * 
     * @param semesters 学期
     * @return 结果
     */
    @Override
    public int updateSemesters(Semesters semesters)
    {
        return semestersMapper.updateSemesters(semesters);
    }

    /**
     * 批量删除学期
     * 
     * @param semesterIds 需要删除的学期主键
     * @return 结果
     */
    @Override
    public int deleteSemestersBySemesterIds(Integer[] semesterIds)
    {
        return semestersMapper.deleteSemestersBySemesterIds(semesterIds);
    }

    /**
     * 删除学期信息
     * 
     * @param semesterId 学期主键
     * @return 结果
     */
    @Override
    public int deleteSemestersBySemesterId(Integer semesterId)
    {
        return semestersMapper.deleteSemestersBySemesterId(semesterId);
    }
}

package com.xxxy.no1.courseselectionsystem.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.xxxy.no1.courseselectionsystem.mapper.ExamgradesMapper;
import com.xxxy.no1.courseselectionsystem.domain.Examgrades;
import com.xxxy.no1.courseselectionsystem.service.IExamgradesService;

/**
 * 考试成绩Service业务层处理
 * 
 * @author ruoyi
 * @date 2024-05-20
 */
@Service
public class ExamgradesServiceImpl implements IExamgradesService 
{
    @Autowired
    private ExamgradesMapper examgradesMapper;

    /**
     * 查询考试成绩
     * 
     * @param examGradeId 考试成绩主键
     * @return 考试成绩
     */
    @Override
    public Examgrades selectExamgradesByExamGradeId(Integer examGradeId)
    {
        return examgradesMapper.selectExamgradesByExamGradeId(examGradeId);
    }

    /**
     * 查询考试成绩列表
     * 
     * @param examgrades 考试成绩
     * @return 考试成绩
     */
    @Override
    public List<Examgrades> selectExamgradesList(Examgrades examgrades)
    {
        return examgradesMapper.selectExamgradesList(examgrades);
    }

    /**
     * 新增考试成绩
     * 
     * @param examgrades 考试成绩
     * @return 结果
     */
    @Override
    public int insertExamgrades(Examgrades examgrades)
    {
        return examgradesMapper.insertExamgrades(examgrades);
    }

    /**
     * 修改考试成绩
     * 
     * @param examgrades 考试成绩
     * @return 结果
     */
    @Override
    public int updateExamgrades(Examgrades examgrades)
    {
        return examgradesMapper.updateExamgrades(examgrades);
    }

    /**
     * 批量删除考试成绩
     * 
     * @param examGradeIds 需要删除的考试成绩主键
     * @return 结果
     */
    @Override
    public int deleteExamgradesByExamGradeIds(Integer[] examGradeIds)
    {
        return examgradesMapper.deleteExamgradesByExamGradeIds(examGradeIds);
    }

    /**
     * 删除考试成绩信息
     * 
     * @param examGradeId 考试成绩主键
     * @return 结果
     */
    @Override
    public int deleteExamgradesByExamGradeId(Integer examGradeId)
    {
        return examgradesMapper.deleteExamgradesByExamGradeId(examGradeId);
    }
}

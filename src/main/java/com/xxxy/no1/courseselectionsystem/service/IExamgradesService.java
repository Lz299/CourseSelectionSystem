package com.xxxy.no1.courseselectionsystem.service;

import java.util.List;
import com.xxxy.no1.courseselectionsystem.domain.Examgrades;

/**
 * 考试成绩Service接口
 * 
 * @author ruoyi
 * @date 2024-05-20
 */
public interface IExamgradesService 
{
    /**
     * 查询考试成绩
     * 
     * @param examGradeId 考试成绩主键
     * @return 考试成绩
     */
    public Examgrades selectExamgradesByExamGradeId(Integer examGradeId);

    /**
     * 查询考试成绩列表
     * 
     * @param examgrades 考试成绩
     * @return 考试成绩集合
     */
    public List<Examgrades> selectExamgradesList(Examgrades examgrades);

    /**
     * 新增考试成绩
     * 
     * @param examgrades 考试成绩
     * @return 结果
     */
    public int insertExamgrades(Examgrades examgrades);

    /**
     * 修改考试成绩
     * 
     * @param examgrades 考试成绩
     * @return 结果
     */
    public int updateExamgrades(Examgrades examgrades);

    /**
     * 批量删除考试成绩
     * 
     * @param examGradeIds 需要删除的考试成绩主键集合
     * @return 结果
     */
    public int deleteExamgradesByExamGradeIds(Integer[] examGradeIds);

    /**
     * 删除考试成绩信息
     * 
     * @param examGradeId 考试成绩主键
     * @return 结果
     */
    public int deleteExamgradesByExamGradeId(Integer examGradeId);
}

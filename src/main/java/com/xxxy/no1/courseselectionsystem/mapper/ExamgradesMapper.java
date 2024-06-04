package com.xxxy.no1.courseselectionsystem.mapper;

import java.util.List;
import com.xxxy.no1.courseselectionsystem.domain.Examgrades;
import org.apache.ibatis.annotations.Mapper;

/**
 * 考试成绩Mapper接口
 * 
 * @author ruoyi
 * @date 2024-05-20
 */
@Mapper
public interface ExamgradesMapper 
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
     * 删除考试成绩
     * 
     * @param examGradeId 考试成绩主键
     * @return 结果
     */
    public int deleteExamgradesByExamGradeId(Integer examGradeId);

    /**
     * 批量删除考试成绩
     * 
     * @param examGradeIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteExamgradesByExamGradeIds(Integer[] examGradeIds);
}

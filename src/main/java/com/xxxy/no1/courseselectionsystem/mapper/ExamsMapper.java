package com.xxxy.no1.courseselectionsystem.mapper;

import java.util.List;
import com.xxxy.no1.courseselectionsystem.domain.Exams;
import org.apache.ibatis.annotations.Mapper;

/**
 * 考试Mapper接口
 * 
 * @author ruoyi
 * @date 2024-05-20
 */
@Mapper
public interface ExamsMapper 
{
    /**
     * 查询考试
     * 
     * @param examId 考试主键
     * @return 考试
     */
    public Exams selectExamsByExamId(Integer examId);

    /**
     * 查询考试列表
     * 
     * @param exams 考试
     * @return 考试集合
     */
    public List<Exams> selectExamsList(Exams exams);

    /**
     * 新增考试
     * 
     * @param exams 考试
     * @return 结果
     */
    public int insertExams(Exams exams);

    /**
     * 修改考试
     * 
     * @param exams 考试
     * @return 结果
     */
    public int updateExams(Exams exams);

    /**
     * 删除考试
     * 
     * @param examId 考试主键
     * @return 结果
     */
    public int deleteExamsByExamId(Integer examId);

    /**
     * 批量删除考试
     * 
     * @param examIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteExamsByExamIds(Integer[] examIds);
}

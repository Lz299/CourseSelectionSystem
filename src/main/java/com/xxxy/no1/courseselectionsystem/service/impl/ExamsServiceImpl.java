package com.xxxy.no1.courseselectionsystem.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.xxxy.no1.courseselectionsystem.mapper.ExamsMapper;
import com.xxxy.no1.courseselectionsystem.domain.Exams;
import com.xxxy.no1.courseselectionsystem.service.IExamsService;

/**
 * 考试Service业务层处理
 * 
 * @author ruoyi
 * @date 2024-05-20
 */
@Service
public class ExamsServiceImpl implements IExamsService 
{
    @Autowired
    private ExamsMapper examsMapper;

    /**
     * 查询考试
     * 
     * @param examId 考试主键
     * @return 考试
     */
    @Override
    public Exams selectExamsByExamId(Integer examId)
    {
        return examsMapper.selectExamsByExamId(examId);
    }

    /**
     * 查询考试列表
     * 
     * @param exams 考试
     * @return 考试
     */
    @Override
    public List<Exams> selectExamsList(Exams exams)
    {
        return examsMapper.selectExamsList(exams);
    }

    /**
     * 新增考试
     * 
     * @param exams 考试
     * @return 结果
     */
    @Override
    public int insertExams(Exams exams)
    {
        return examsMapper.insertExams(exams);
    }

    /**
     * 修改考试
     * 
     * @param exams 考试
     * @return 结果
     */
    @Override
    public int updateExams(Exams exams)
    {
        return examsMapper.updateExams(exams);
    }

    /**
     * 批量删除考试
     * 
     * @param examIds 需要删除的考试主键
     * @return 结果
     */
    @Override
    public int deleteExamsByExamIds(Integer[] examIds)
    {
        return examsMapper.deleteExamsByExamIds(examIds);
    }

    /**
     * 删除考试信息
     * 
     * @param examId 考试主键
     * @return 结果
     */
    @Override
    public int deleteExamsByExamId(Integer examId)
    {
        return examsMapper.deleteExamsByExamId(examId);
    }
}

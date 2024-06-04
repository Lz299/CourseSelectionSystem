package com.xxxy.no1.courseselectionsystem.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.xxxy.no1.courseselectionsystem.mapper.GradesMapper;
import com.xxxy.no1.courseselectionsystem.domain.Grades;
import com.xxxy.no1.courseselectionsystem.service.IGradesService;

/**
 * 成绩Service业务层处理
 * 
 * @author ruoyi
 * @date 2024-05-20
 */
@Service
public class GradesServiceImpl implements IGradesService 
{
    @Autowired
    private GradesMapper gradesMapper;

    /**
     * 查询成绩
     * 
     * @param gradeId 成绩主键
     * @return 成绩
     */
    @Override
    public Grades selectGradesByGradeId(String gradeId)
    {
        return gradesMapper.selectGradesByGradeId(gradeId);
    }

    /**
     * 查询成绩列表
     * 
     * @param grades 成绩
     * @return 成绩
     */
    @Override
    public List<Grades> selectGradesList(Grades grades)
    {
        return gradesMapper.selectGradesList(grades);
    }

    /**
     * 新增成绩
     * 
     * @param grades 成绩
     * @return 结果
     */
    @Override
    public int insertGrades(Grades grades)
    {
        return gradesMapper.insertGrades(grades);
    }

    /**
     * 修改成绩
     * 
     * @param grades 成绩
     * @return 结果
     */
    @Override
    public int updateGrades(Grades grades)
    {
        return gradesMapper.updateGrades(grades);
    }

    /**
     * 批量删除成绩
     * 
     * @param gradeIds 需要删除的成绩主键
     * @return 结果
     */
    @Override
    public int deleteGradesByGradeIds(String[] gradeIds)
    {
        return gradesMapper.deleteGradesByGradeIds(gradeIds);
    }

    /**
     * 删除成绩信息
     * 
     * @param gradeId 成绩主键
     * @return 结果
     */
    @Override
    public int deleteGradesByGradeId(String gradeId)
    {
        return gradesMapper.deleteGradesByGradeId(gradeId);
    }
}

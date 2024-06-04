package com.xxxy.no1.courseselectionsystem.service;

import java.util.List;
import com.xxxy.no1.courseselectionsystem.domain.Grades;

/**
 * 成绩Service接口
 * 
 * @author ruoyi
 * @date 2024-05-20
 */
public interface IGradesService 
{
    /**
     * 查询成绩
     * 
     * @param gradeId 成绩主键
     * @return 成绩
     */
    public Grades selectGradesByGradeId(String gradeId);

    /**
     * 查询成绩列表
     * 
     * @param grades 成绩
     * @return 成绩集合
     */
    public List<Grades> selectGradesList(Grades grades);

    /**
     * 新增成绩
     * 
     * @param grades 成绩
     * @return 结果
     */
    public int insertGrades(Grades grades);

    /**
     * 修改成绩
     * 
     * @param grades 成绩
     * @return 结果
     */
    public int updateGrades(Grades grades);

    /**
     * 批量删除成绩
     * 
     * @param gradeIds 需要删除的成绩主键集合
     * @return 结果
     */
    public int deleteGradesByGradeIds(String[] gradeIds);

    /**
     * 删除成绩信息
     * 
     * @param gradeId 成绩主键
     * @return 结果
     */
    public int deleteGradesByGradeId(String gradeId);
}

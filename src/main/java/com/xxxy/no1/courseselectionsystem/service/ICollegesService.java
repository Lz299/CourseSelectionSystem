package com.xxxy.no1.courseselectionsystem.service;

import java.util.List;
import com.xxxy.no1.courseselectionsystem.domain.Colleges;

/**
 * 学院Service接口
 * 
 * @author lz
 * @date 2024-05-20
 */
public interface ICollegesService 
{
    /**
     * 查询学院
     * 
     * @param collegeId 学院主键
     * @return 学院
     */
    public Colleges selectCollegesByCollegeId(Long collegeId);

    /**
     * 查询学院列表
     * 
     * @param colleges 学院
     * @return 学院集合
     */
    public List<Colleges> selectCollegesList(Colleges colleges);

    /**
     * 新增学院
     * 
     * @param colleges 学院
     * @return 结果
     */
    public int insertColleges(Colleges colleges);

    /**
     * 修改学院
     * 
     * @param colleges 学院
     * @return 结果
     */
    public int updateColleges(Colleges colleges);

    /**
     * 批量删除学院
     * 
     * @param collegeIds 需要删除的学院主键集合
     * @return 结果
     */
    public int deleteCollegesByCollegeIds(Long[] collegeIds);

    /**
     * 删除学院信息
     * 
     * @param collegeId 学院主键
     * @return 结果
     */
    public int deleteCollegesByCollegeId(Long collegeId);
}

package com.xxxy.no1.courseselectionsystem.mapper;

import java.util.List;
import com.xxxy.no1.courseselectionsystem.domain.Colleges;
import org.apache.ibatis.annotations.Mapper;

/**
 * 学院Mapper接口
 * 
 * @author lz
 * @date 2024-05-20
 */
@Mapper
public interface CollegesMapper 
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
     * 删除学院
     * 
     * @param collegeId 学院主键
     * @return 结果
     */
    public int deleteCollegesByCollegeId(Long collegeId);

    /**
     * 批量删除学院
     * 
     * @param collegeIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteCollegesByCollegeIds(Long[] collegeIds);
}

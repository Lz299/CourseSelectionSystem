package com.xxxy.no1.courseselectionsystem.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.xxxy.no1.courseselectionsystem.mapper.CollegesMapper;
import com.xxxy.no1.courseselectionsystem.domain.Colleges;
import com.xxxy.no1.courseselectionsystem.service.ICollegesService;

/**
 * 学院Service业务层处理
 * 
 * @author lz
 * @date 2024-05-20
 */
@Service("collegesService")
public class CollegesServiceImpl implements ICollegesService 
{
    @Autowired
    private CollegesMapper collegesMapper;

    /**
     * 查询学院
     * 
     * @param collegeId 学院主键
     * @return 学院
     */
    @Override
    public Colleges selectCollegesByCollegeId(Long collegeId)
    {
        return collegesMapper.selectCollegesByCollegeId(collegeId);
    }

    /**
     * 查询学院列表
     * 
     * @param colleges 学院
     * @return 学院
     */
    @Override
    public List<Colleges> selectCollegesList(Colleges colleges)
    {
        return collegesMapper.selectCollegesList(colleges);
    }

    /**
     * 新增学院
     * 
     * @param colleges 学院
     * @return 结果
     */
    @Override
    public int insertColleges(Colleges colleges)
    {
        return collegesMapper.insertColleges(colleges);
    }

    /**
     * 修改学院
     * 
     * @param colleges 学院
     * @return 结果
     */
    @Override
    public int updateColleges(Colleges colleges)
    {
        return collegesMapper.updateColleges(colleges);
    }

    /**
     * 批量删除学院
     * 
     * @param collegeIds 需要删除的学院主键
     * @return 结果
     */
    @Override
    public int deleteCollegesByCollegeIds(Long[] collegeIds)
    {
        return collegesMapper.deleteCollegesByCollegeIds(collegeIds);
    }

    /**
     * 删除学院信息
     * 
     * @param collegeId 学院主键
     * @return 结果
     */
    @Override
    public int deleteCollegesByCollegeId(Long collegeId)
    {
        return collegesMapper.deleteCollegesByCollegeId(collegeId);
    }
}

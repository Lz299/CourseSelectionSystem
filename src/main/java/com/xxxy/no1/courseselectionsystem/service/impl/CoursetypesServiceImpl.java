package com.xxxy.no1.courseselectionsystem.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.xxxy.no1.courseselectionsystem.mapper.CoursetypesMapper;
import com.xxxy.no1.courseselectionsystem.domain.Coursetypes;
import com.xxxy.no1.courseselectionsystem.service.ICoursetypesService;

/**
 * 课程类型Service业务层处理
 * 
 * @author ruoyi
 * @date 2024-05-20
 */
@Service
public class CoursetypesServiceImpl implements ICoursetypesService 
{
    @Autowired
    private CoursetypesMapper coursetypesMapper;

    /**
     * 查询课程类型
     * 
     * @param coursetypesId 课程类型主键
     * @return 课程类型
     */
    @Override
    public Coursetypes selectCoursetypesByCoursetypesId(Integer coursetypesId)
    {
        return coursetypesMapper.selectCoursetypesByCoursetypesId(coursetypesId);
    }

    /**
     * 查询课程类型列表
     * 
     * @param coursetypes 课程类型
     * @return 课程类型
     */
    @Override
    public List<Coursetypes> selectCoursetypesList(Coursetypes coursetypes)
    {
        return coursetypesMapper.selectCoursetypesList(coursetypes);
    }

    /**
     * 新增课程类型
     * 
     * @param coursetypes 课程类型
     * @return 结果
     */
    @Override
    public int insertCoursetypes(Coursetypes coursetypes)
    {
        return coursetypesMapper.insertCoursetypes(coursetypes);
    }

    /**
     * 修改课程类型
     * 
     * @param coursetypes 课程类型
     * @return 结果
     */
    @Override
    public int updateCoursetypes(Coursetypes coursetypes)
    {
        return coursetypesMapper.updateCoursetypes(coursetypes);
    }

    /**
     * 批量删除课程类型
     * 
     * @param coursetypesIds 需要删除的课程类型主键
     * @return 结果
     */
    @Override
    public int deleteCoursetypesByCoursetypesIds(Integer[] coursetypesIds)
    {
        return coursetypesMapper.deleteCoursetypesByCoursetypesIds(coursetypesIds);
    }

    /**
     * 删除课程类型信息
     * 
     * @param coursetypesId 课程类型主键
     * @return 结果
     */
    @Override
    public int deleteCoursetypesByCoursetypesId(Integer coursetypesId)
    {
        return coursetypesMapper.deleteCoursetypesByCoursetypesId(coursetypesId);
    }
}

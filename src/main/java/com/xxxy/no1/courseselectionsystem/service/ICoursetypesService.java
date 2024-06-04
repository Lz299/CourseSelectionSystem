package com.xxxy.no1.courseselectionsystem.service;

import java.util.List;
import com.xxxy.no1.courseselectionsystem.domain.Coursetypes;

/**
 * 课程类型Service接口
 * 
 * @author ruoyi
 * @date 2024-05-20
 */
public interface ICoursetypesService 
{
    /**
     * 查询课程类型
     * 
     * @param coursetypesId 课程类型主键
     * @return 课程类型
     */
    public Coursetypes selectCoursetypesByCoursetypesId(Integer coursetypesId);

    /**
     * 查询课程类型列表
     * 
     * @param coursetypes 课程类型
     * @return 课程类型集合
     */
    public List<Coursetypes> selectCoursetypesList(Coursetypes coursetypes);

    /**
     * 新增课程类型
     * 
     * @param coursetypes 课程类型
     * @return 结果
     */
    public int insertCoursetypes(Coursetypes coursetypes);

    /**
     * 修改课程类型
     * 
     * @param coursetypes 课程类型
     * @return 结果
     */
    public int updateCoursetypes(Coursetypes coursetypes);

    /**
     * 批量删除课程类型
     * 
     * @param coursetypesIds 需要删除的课程类型主键集合
     * @return 结果
     */
    public int deleteCoursetypesByCoursetypesIds(Integer[] coursetypesIds);

    /**
     * 删除课程类型信息
     * 
     * @param coursetypesId 课程类型主键
     * @return 结果
     */
    public int deleteCoursetypesByCoursetypesId(Integer coursetypesId);
}

package com.xxxy.no1.courseselectionsystem.service;

import java.util.List;
import com.xxxy.no1.courseselectionsystem.domain.Creditrequirements;

/**
 * 学分要求Service接口
 * 
 * @author ruoyi
 * @date 2024-05-20
 */
public interface ICreditrequirementsService 
{
    /**
     * 查询学分要求
     * 
     * @param creditrequirementId 学分要求主键
     * @return 学分要求
     */
    public Creditrequirements selectCreditrequirementsByCreditrequirementId(Integer creditrequirementId);

    /**
     * 查询学分要求列表
     * 
     * @param creditrequirements 学分要求
     * @return 学分要求集合
     */
    public List<Creditrequirements> selectCreditrequirementsList(Creditrequirements creditrequirements);

    /**
     * 新增学分要求
     * 
     * @param creditrequirements 学分要求
     * @return 结果
     */
    public int insertCreditrequirements(Creditrequirements creditrequirements);

    /**
     * 修改学分要求
     * 
     * @param creditrequirements 学分要求
     * @return 结果
     */
    public int updateCreditrequirements(Creditrequirements creditrequirements);

    /**
     * 批量删除学分要求
     * 
     * @param creditrequirementIds 需要删除的学分要求主键集合
     * @return 结果
     */
    public int deleteCreditrequirementsByCreditrequirementIds(Integer[] creditrequirementIds);

    /**
     * 删除学分要求信息
     * 
     * @param creditrequirementId 学分要求主键
     * @return 结果
     */
    public int deleteCreditrequirementsByCreditrequirementId(Integer creditrequirementId);
}

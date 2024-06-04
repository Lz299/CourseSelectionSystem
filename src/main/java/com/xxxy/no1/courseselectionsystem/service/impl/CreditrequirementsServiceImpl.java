package com.xxxy.no1.courseselectionsystem.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.xxxy.no1.courseselectionsystem.mapper.CreditrequirementsMapper;
import com.xxxy.no1.courseselectionsystem.domain.Creditrequirements;
import com.xxxy.no1.courseselectionsystem.service.ICreditrequirementsService;

/**
 * 学分要求Service业务层处理
 * 
 * @author ruoyi
 * @date 2024-05-20
 */
@Service
public class CreditrequirementsServiceImpl implements ICreditrequirementsService 
{
    @Autowired
    private CreditrequirementsMapper creditrequirementsMapper;

    /**
     * 查询学分要求
     * 
     * @param creditrequirementId 学分要求主键
     * @return 学分要求
     */
    @Override
    public Creditrequirements selectCreditrequirementsByCreditrequirementId(Integer creditrequirementId)
    {
        return creditrequirementsMapper.selectCreditrequirementsByCreditrequirementId(creditrequirementId);
    }

    /**
     * 查询学分要求列表
     * 
     * @param creditrequirements 学分要求
     * @return 学分要求
     */
    @Override
    public List<Creditrequirements> selectCreditrequirementsList(Creditrequirements creditrequirements)
    {
        return creditrequirementsMapper.selectCreditrequirementsList(creditrequirements);
    }

    /**
     * 新增学分要求
     * 
     * @param creditrequirements 学分要求
     * @return 结果
     */
    @Override
    public int insertCreditrequirements(Creditrequirements creditrequirements)
    {
        return creditrequirementsMapper.insertCreditrequirements(creditrequirements);
    }

    /**
     * 修改学分要求
     * 
     * @param creditrequirements 学分要求
     * @return 结果
     */
    @Override
    public int updateCreditrequirements(Creditrequirements creditrequirements)
    {
        return creditrequirementsMapper.updateCreditrequirements(creditrequirements);
    }

    /**
     * 批量删除学分要求
     * 
     * @param creditrequirementIds 需要删除的学分要求主键
     * @return 结果
     */
    @Override
    public int deleteCreditrequirementsByCreditrequirementIds(Integer[] creditrequirementIds)
    {
        return creditrequirementsMapper.deleteCreditrequirementsByCreditrequirementIds(creditrequirementIds);
    }

    /**
     * 删除学分要求信息
     * 
     * @param creditrequirementId 学分要求主键
     * @return 结果
     */
    @Override
    public int deleteCreditrequirementsByCreditrequirementId(Integer creditrequirementId)
    {
        return creditrequirementsMapper.deleteCreditrequirementsByCreditrequirementId(creditrequirementId);
    }
}

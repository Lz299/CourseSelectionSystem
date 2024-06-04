package com.xxxy.no1.courseselectionsystem.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.xxxy.no1.courseselectionsystem.mapper.AbsencesMapper;
import com.xxxy.no1.courseselectionsystem.domain.Absences;
import com.xxxy.no1.courseselectionsystem.service.IAbsencesService;

/**
 * 请假记录Service业务层处理
 * 
 * @author ruoyi
 * @date 2024-05-20
 */
@Service
public class AbsencesServiceImpl implements IAbsencesService 
{
    @Autowired
    private AbsencesMapper absencesMapper;

    /**
     * 查询请假记录
     * 
     * @param absenceId 请假记录主键
     * @return 请假记录
     */
    @Override
    public Absences selectAbsencesByAbsenceId(Integer absenceId)
    {
        return absencesMapper.selectAbsencesByAbsenceId(absenceId);
    }

    /**
     * 查询请假记录列表
     * 
     * @param absences 请假记录
     * @return 请假记录
     */
    @Override
    public List<Absences> selectAbsencesList(Absences absences)
    {
        return absencesMapper.selectAbsencesList(absences);
    }

    /**
     * 新增请假记录
     * 
     * @param absences 请假记录
     * @return 结果
     */
    @Override
    public int insertAbsences(Absences absences)
    {
        return absencesMapper.insertAbsences(absences);
    }

    /**
     * 修改请假记录
     * 
     * @param absences 请假记录
     * @return 结果
     */
    @Override
    public int updateAbsences(Absences absences)
    {
        return absencesMapper.updateAbsences(absences);
    }

    /**
     * 批量删除请假记录
     * 
     * @param absenceIds 需要删除的请假记录主键
     * @return 结果
     */
    @Override
    public int deleteAbsencesByAbsenceIds(Integer[] absenceIds)
    {
        return absencesMapper.deleteAbsencesByAbsenceIds(absenceIds);
    }

    /**
     * 删除请假记录信息
     * 
     * @param absenceId 请假记录主键
     * @return 结果
     */
    @Override
    public int deleteAbsencesByAbsenceId(Integer absenceId)
    {
        return absencesMapper.deleteAbsencesByAbsenceId(absenceId);
    }
}

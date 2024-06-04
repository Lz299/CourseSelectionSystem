package com.xxxy.no1.courseselectionsystem.mapper;

import java.util.List;
import com.xxxy.no1.courseselectionsystem.domain.Absences;
import org.apache.ibatis.annotations.Mapper;

/**
 * 请假记录Mapper接口
 * 
 * @author ruoyi
 * @date 2024-05-20
 */
@Mapper
public interface AbsencesMapper 
{
    /**
     * 查询请假记录
     * 
     * @param absenceId 请假记录主键
     * @return 请假记录
     */
    public Absences selectAbsencesByAbsenceId(Integer absenceId);

    /**
     * 查询请假记录列表
     * 
     * @param absences 请假记录
     * @return 请假记录集合
     */
    public List<Absences> selectAbsencesList(Absences absences);

    /**
     * 新增请假记录
     * 
     * @param absences 请假记录
     * @return 结果
     */
    public int insertAbsences(Absences absences);

    /**
     * 修改请假记录
     * 
     * @param absences 请假记录
     * @return 结果
     */
    public int updateAbsences(Absences absences);

    /**
     * 删除请假记录
     * 
     * @param absenceId 请假记录主键
     * @return 结果
     */
    public int deleteAbsencesByAbsenceId(Integer absenceId);

    /**
     * 批量删除请假记录
     * 
     * @param absenceIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteAbsencesByAbsenceIds(Integer[] absenceIds);
}

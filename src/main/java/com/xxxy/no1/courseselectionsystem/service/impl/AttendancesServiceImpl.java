package com.xxxy.no1.courseselectionsystem.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.xxxy.no1.courseselectionsystem.mapper.AttendancesMapper;
import com.xxxy.no1.courseselectionsystem.domain.Attendances;
import com.xxxy.no1.courseselectionsystem.service.IAttendancesService;

/**
 * 考勤记录Service业务层处理
 * 
 * @author ruoyi
 * @date 2024-05-20
 */
@Service
public class AttendancesServiceImpl implements IAttendancesService 
{
    @Autowired
    private AttendancesMapper attendancesMapper;

    /**
     * 查询考勤记录
     * 
     * @param attendanceId 考勤记录主键
     * @return 考勤记录
     */
    @Override
    public Attendances selectAttendancesByAttendanceId(Integer attendanceId)
    {
        return attendancesMapper.selectAttendancesByAttendanceId(attendanceId);
    }

    /**
     * 查询考勤记录列表
     * 
     * @param attendances 考勤记录
     * @return 考勤记录
     */
    @Override
    public List<Attendances> selectAttendancesList(Attendances attendances)
    {
        return attendancesMapper.selectAttendancesList(attendances);
    }

    /**
     * 新增考勤记录
     * 
     * @param attendances 考勤记录
     * @return 结果
     */
    @Override
    public int insertAttendances(Attendances attendances)
    {
        return attendancesMapper.insertAttendances(attendances);
    }

    /**
     * 修改考勤记录
     * 
     * @param attendances 考勤记录
     * @return 结果
     */
    @Override
    public int updateAttendances(Attendances attendances)
    {
        return attendancesMapper.updateAttendances(attendances);
    }

    /**
     * 批量删除考勤记录
     * 
     * @param attendanceIds 需要删除的考勤记录主键
     * @return 结果
     */
    @Override
    public int deleteAttendancesByAttendanceIds(Integer[] attendanceIds)
    {
        return attendancesMapper.deleteAttendancesByAttendanceIds(attendanceIds);
    }

    /**
     * 删除考勤记录信息
     * 
     * @param attendanceId 考勤记录主键
     * @return 结果
     */
    @Override
    public int deleteAttendancesByAttendanceId(Integer attendanceId)
    {
        return attendancesMapper.deleteAttendancesByAttendanceId(attendanceId);
    }
}

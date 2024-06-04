package com.xxxy.no1.courseselectionsystem.mapper;

import java.util.List;
import com.xxxy.no1.courseselectionsystem.domain.Attendances;
import org.apache.ibatis.annotations.Mapper;

/**
 * 考勤记录Mapper接口
 * 
 * @author ruoyi
 * @date 2024-05-20
 */
@Mapper
public interface AttendancesMapper 
{
    /**
     * 查询考勤记录
     * 
     * @param attendanceId 考勤记录主键
     * @return 考勤记录
     */
    public Attendances selectAttendancesByAttendanceId(Integer attendanceId);

    /**
     * 查询考勤记录列表
     * 
     * @param attendances 考勤记录
     * @return 考勤记录集合
     */
    public List<Attendances> selectAttendancesList(Attendances attendances);

    /**
     * 新增考勤记录
     * 
     * @param attendances 考勤记录
     * @return 结果
     */
    public int insertAttendances(Attendances attendances);

    /**
     * 修改考勤记录
     * 
     * @param attendances 考勤记录
     * @return 结果
     */
    public int updateAttendances(Attendances attendances);

    /**
     * 删除考勤记录
     * 
     * @param attendanceId 考勤记录主键
     * @return 结果
     */
    public int deleteAttendancesByAttendanceId(Integer attendanceId);

    /**
     * 批量删除考勤记录
     * 
     * @param attendanceIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteAttendancesByAttendanceIds(Integer[] attendanceIds);
}

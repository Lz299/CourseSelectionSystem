package com.xxxy.no1.courseselectionsystem.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.xxxy.no1.courseselectionsystem.domain.Attendances;
import com.xxxy.no1.courseselectionsystem.service.IAttendancesService;


/**
 * 考勤记录Controller
 * 
 * @author ruoyi
 * @date 2024-05-20
 */
@RestController
@RequestMapping("/CourseSelectionSystem/attendances")
public class AttendancesController
{
    @Autowired
    private IAttendancesService attendancesService;

    /**
     * 查询考勤记录列表
     */
    @GetMapping("/list")
    public List<Attendances> list(Attendances attendances)
    {
        List<Attendances> list = attendancesService.selectAttendancesList(attendances);
        return list;
    }

    /**
     * 导出考勤记录列表
     */
//    @PostMapping("/export")
//    public void export(HttpServletResponse response, Attendances attendances)
//    {
//        List<Attendances> list = attendancesService.selectAttendancesList(attendances);
//        ExcelUtil<Attendances> util = new ExcelUtil<Attendances>(Attendances.class);
//        util.exportExcel(response, list, "考勤记录数据");
//    }

    /**
     * 获取考勤记录详细信息
     */
    @GetMapping(value = "/{attendanceId}")
    public Attendances getInfo(@PathVariable("attendanceId") Integer attendanceId)
    {
        return attendancesService.selectAttendancesByAttendanceId(attendanceId);
    }

    /**
     * 新增考勤记录
     */
    @PostMapping
    public int add(@RequestBody Attendances attendances)
    {
        return attendancesService.insertAttendances(attendances);
    }

    /**
     * 修改考勤记录
     */

    @PutMapping
    public int edit(@RequestBody Attendances attendances)
    {
        return attendancesService.updateAttendances(attendances);
    }

    /**
     * 删除考勤记录
     */

	@DeleteMapping("/{attendanceIds}")
    public int remove(@PathVariable Integer[] attendanceIds)
    {
        return attendancesService.deleteAttendancesByAttendanceIds(attendanceIds);
    }
}

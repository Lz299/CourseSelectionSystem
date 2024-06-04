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
import com.xxxy.no1.courseselectionsystem.domain.Courseschedules;
import com.xxxy.no1.courseselectionsystem.service.ICourseschedulesService;


/**
 * 课程时间Controller
 * 
 * @author ruoyi
 * @date 2024-05-20
 */
@RestController
@RequestMapping("/CourseSelectionSystem/courseschedules")
public class CourseschedulesController
{
    @Autowired
    private ICourseschedulesService courseschedulesService;

    /**
     * 查询课程时间列表
     */

    @GetMapping("/list")
    public List<Courseschedules> list(Courseschedules courseschedules)
    {
        List<Courseschedules> list = courseschedulesService.selectCourseschedulesList(courseschedules);
        return list;
    }

    /**
     * 导出课程时间列表
     */

//    @PostMapping("/export")
//    public void export(HttpServletResponse response, Courseschedules courseschedules)
//    {
//        List<Courseschedules> list = courseschedulesService.selectCourseschedulesList(courseschedules);
//        ExcelUtil<Courseschedules> util = new ExcelUtil<Courseschedules>(Courseschedules.class);
//        util.exportExcel(response, list, "课程时间数据");
//    }

    /**
     * 获取课程时间详细信息
     */
    @GetMapping(value = "/{scheduleId}")
    public Courseschedules getInfo(@PathVariable("scheduleId") Integer scheduleId)
    {
        return courseschedulesService.selectCourseschedulesByScheduleId(scheduleId);
    }

    /**
     * 新增课程时间
     */
    @PostMapping
    public int add(@RequestBody Courseschedules courseschedules)
    {
        return courseschedulesService.insertCourseschedules(courseschedules);
    }

    /**
     * 修改课程时间
     */

    @PutMapping
    public int edit(@RequestBody Courseschedules courseschedules)
    {
        return courseschedulesService.updateCourseschedules(courseschedules);
    }

    /**
     * 删除课程时间
     */
	@DeleteMapping("/{scheduleIds}")
    public int remove(@PathVariable Integer[] scheduleIds)
    {
        return courseschedulesService.deleteCourseschedulesByScheduleIds(scheduleIds);
    }
}

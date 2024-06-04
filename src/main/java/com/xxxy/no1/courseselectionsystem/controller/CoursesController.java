package com.xxxy.no1.courseselectionsystem.controller;

import java.util.List;


import com.xxxy.no1.courseselectionsystem.utils.Result;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.xxxy.no1.courseselectionsystem.domain.Courses;
import com.xxxy.no1.courseselectionsystem.service.ICoursesService;

/**
 * 课程Controller
 * 
 * @author ruoyi
 * @date 2024-05-20
 */
@RestController
@RequestMapping("/CourseSelectionSystem/courses")
public class CoursesController
{
    @Autowired
    private ICoursesService coursesService;

    /**
     * 查询课程列表
     */

/*    @GetMapping("/list")
    public TableDataInfo list(Courses courses)
    {
        startPage();
        List<Courses> list = coursesService.selectCoursesList(courses);
        return getDataTable(list);
    }*/



    /**
     * 获取课程详细信息
     */

    @GetMapping(value = "/{courseId}")
    public Result<Courses> getInfo(@PathVariable("courseId") Long courseId)
    {
        return Result.success(coursesService.selectCoursesByCourseId(courseId));
    }

    /**
     * 新增课程
     */

    @PostMapping
    public Result add(@RequestBody Courses courses)
    {
        return Result.success(coursesService.insertCourses(courses));
    }

    /**
     * 修改课程
     */

    @PutMapping
    public Result edit(@RequestBody Courses courses)
    {
        return Result.success(coursesService.updateCourses(courses));
    }

    /**
     * 删除课程
     */

	@DeleteMapping("/{courseIds}")
    public Result remove(@PathVariable Long[] courseIds)
    {
        return Result.success(coursesService.deleteCoursesByCourseIds(courseIds));
    }
}

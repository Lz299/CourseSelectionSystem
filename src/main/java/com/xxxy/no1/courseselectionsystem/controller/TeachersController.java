package com.xxxy.no1.courseselectionsystem.controller;

import java.util.List;

import com.xxxy.no1.courseselectionsystem.utils.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.xxxy.no1.courseselectionsystem.domain.Teachers;
import com.xxxy.no1.courseselectionsystem.service.ITeachersService;


/**
 * 教师Controller
 * 
 * @author ruoyi
 * @date 2024-05-20
 */
@RestController
@RequestMapping("/CourseSelectionSystem/teachers")
public class TeachersController
{
    @Autowired
    private ITeachersService teachersService;

    /**
     * 查询教师列表
     */
    @GetMapping("/list")
    public List<Teachers> list(Teachers teachers)
    {
        List<Teachers> list = teachersService.selectTeachersList(teachers);
        return list;
    }

    /**
     * 导出教师列表
     */

//    @PostMapping("/export")
//    public void export(HttpServletResponse response, Teachers teachers)
//    {
//        List<Teachers> list = teachersService.selectTeachersList(teachers);
//        ExcelUtil<Teachers> util = new ExcelUtil<Teachers>(Teachers.class);
//        util.exportExcel(response, list, "教师数据");
//    }

    /**
     * 获取教师详细信息
     */
    @GetMapping(value = "/{teacherId}")
    public Teachers getInfo(@PathVariable("teacherId") Integer teacherId)
    {
        return teachersService.selectTeachersByTeacherId(teacherId);
    }

    /**
     * 新增教师
     */

    @RequestMapping("/add")
    @ResponseBody
    public Result<String> add(@RequestBody Teachers teachers)
    {
        return Result.success(teachersService.insertTeachers(teachers));
    }

    /**
     * 修改教师
     */

    @PutMapping
    public int edit(@RequestBody Teachers teachers)
    {
        return teachersService.updateTeachers(teachers);
    }

    /**
     * 删除教师
     */

	@DeleteMapping("/{teacherIds}")
    public int remove(@PathVariable Integer[] teacherIds)
    {
        return teachersService.deleteTeachersByTeacherIds(teacherIds);
    }
}

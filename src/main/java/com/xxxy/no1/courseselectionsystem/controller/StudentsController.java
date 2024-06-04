package com.xxxy.no1.courseselectionsystem.controller;

import java.util.List;

import com.xxxy.no1.courseselectionsystem.service.LoginService;
import com.xxxy.no1.courseselectionsystem.utils.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.xxxy.no1.courseselectionsystem.domain.Students;
import com.xxxy.no1.courseselectionsystem.service.IStudentsService;
import org.springframework.web.multipart.MultipartFile;

/**
 * 学生Controller
 * 
 * @author ruoyi
 * @date 2024-05-20
 */
@RestController
@RequestMapping("/CourseSelectionSystem/students")
public class StudentsController
{
    @Autowired
    private IStudentsService studentsService;


    /**
     * 查询学生列表
     */
    @GetMapping("/list")
    @ResponseBody
    public Result<List<Students>> list(Students students)
    {
        List<Students> list = studentsService.selectStudentsList(students);
        return Result.success(list);
    }

    /**
     * 导出学生列表
     */
//
//    @PostMapping("/export")
//    public void export(HttpServletResponse response, Students students)
//    {
//        List<Students> list = studentsService.selectStudentsList(students);
//        ExcelUtil<Students> util = new ExcelUtil<Students>(Students.class);
//        util.exportExcel(response, list, "学生数据");
//    }

    /**
     * 获取学生详细信息
     */

    @GetMapping(value = "/{studentId}")
    public Students getInfo(@PathVariable("studentId") Integer studentId)
    {
        return studentsService.selectStudentsByStudentId(studentId);
    }

    /**
     * 新增学生
     */

    @PostMapping("/add")
    public Result<String> add(@RequestBody Students students)
    {
        return Result.success(studentsService.insertStudents(students));
    }




    /**
     * 修改学生
     */

    @PutMapping
    public int edit(@RequestBody Students students)
    {
        return studentsService.updateStudents(students);
    }

    /**
     * 删除学生
     */

	@DeleteMapping("/{studentIds}")
    public int remove(@PathVariable Integer[] studentIds)
    {
        return studentsService.deleteStudentsByStudentIds(studentIds);
    }
}

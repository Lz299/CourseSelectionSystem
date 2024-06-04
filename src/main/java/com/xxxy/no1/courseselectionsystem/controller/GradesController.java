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

import com.xxxy.no1.courseselectionsystem.domain.Grades;
import com.xxxy.no1.courseselectionsystem.service.IGradesService;


/**
 * 成绩Controller
 * 
 * @author ruoyi
 * @date 2024-05-20
 */
@RestController
@RequestMapping("/CourseSelectionSystem/grades")
public class GradesController
{
    @Autowired
    private IGradesService gradesService;

    /**
     * 查询成绩列表
     */
    @GetMapping("/list")
    public List<Grades> list(Grades grades)
    {

        List<Grades> list = gradesService.selectGradesList(grades);
        return list;
    }

    /**
     * 导出成绩列表
     */

//    @PostMapping("/export")
//    public void export(HttpServletResponse response, Grades grades)
//    {
//        List<Grades> list = gradesService.selectGradesList(grades);
//        ExcelUtil<Grades> util = new ExcelUtil<Grades>(Grades.class);
//        util.exportExcel(response, list, "成绩数据");
//    }

    /**
     * 获取成绩详细信息
     */

    @GetMapping(value = "/{gradeId}")
    public Grades getInfo(@PathVariable("gradeId") String gradeId)
    {
        return gradesService.selectGradesByGradeId(gradeId);
    }

    /**
     * 新增成绩
     */
    @PostMapping
    public int add(@RequestBody Grades grades)
    {
        return gradesService.insertGrades(grades);
    }

    /**
     * 修改成绩
     */

    @PutMapping
    public int edit(@RequestBody Grades grades)
    {
        return gradesService.updateGrades(grades);
    }

    /**
     * 删除成绩
     */

	@DeleteMapping("/{gradeIds}")
    public int remove(@PathVariable String[] gradeIds)
    {
        return gradesService.deleteGradesByGradeIds(gradeIds);
    }
}

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

import com.xxxy.no1.courseselectionsystem.domain.Examgrades;
import com.xxxy.no1.courseselectionsystem.service.IExamgradesService;


/**
 * 考试成绩Controller
 * 
 * @author ruoyi
 * @date 2024-05-20
 */
@RestController
@RequestMapping("/CourseSelectionSystem/examgrades")
public class ExamgradesController
{
    @Autowired
    private IExamgradesService examgradesService;

    /**
     * 查询考试成绩列表
     */
    @GetMapping("/list")
    public List<Examgrades> list(Examgrades examgrades)
    {

        List<Examgrades> list = examgradesService.selectExamgradesList(examgrades);
        return list;
    }

    /**
     * 导出考试成绩列表
     */
//    @PostMapping("/export")
//    public void export(HttpServletResponse response, Examgrades examgrades)
//    {
//        List<Examgrades> list = examgradesService.selectExamgradesList(examgrades);
//        ExcelUtil<Examgrades> util = new ExcelUtil<Examgrades>(Examgrades.class);
//        util.exportExcel(response, list, "考试成绩数据");
//    }

    /**
     * 获取考试成绩详细信息
     */
    @GetMapping(value = "/{examGradeId}")
    public Examgrades getInfo(@PathVariable("examGradeId") Integer examGradeId)
    {
        return examgradesService.selectExamgradesByExamGradeId(examGradeId);
    }

    /**
     * 新增考试成绩
     */
    @PostMapping
    public int add(@RequestBody Examgrades examgrades)
    {
        return examgradesService.insertExamgrades(examgrades);
    }

    /**
     * 修改考试成绩
     */
    @PutMapping
    public int edit(@RequestBody Examgrades examgrades)
    {
        return examgradesService.updateExamgrades(examgrades);
    }

    /**
     * 删除考试成绩
     */

	@DeleteMapping("/{examGradeIds}")
    public int remove(@PathVariable Integer[] examGradeIds)
    {
        return examgradesService.deleteExamgradesByExamGradeIds(examGradeIds);
    }
}

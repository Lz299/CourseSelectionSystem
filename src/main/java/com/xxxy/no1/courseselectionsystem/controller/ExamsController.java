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

import com.xxxy.no1.courseselectionsystem.domain.Exams;
import com.xxxy.no1.courseselectionsystem.service.IExamsService;


/**
 * 考试Controller
 * 
 * @author ruoyi
 * @date 2024-05-20
 */
@RestController
@RequestMapping("/CourseSelectionSystem/exams")
public class ExamsController
{
    @Autowired
    private IExamsService examsService;

    /**
     * 查询考试列表
     */
    @GetMapping("/list")
    public List<Exams> list(Exams exams)
    {

        List<Exams> list = examsService.selectExamsList(exams);
        return list;
    }

    /**
     * 导出考试列表
     */

//    @PostMapping("/export")
//    public void export(HttpServletResponse response, Exams exams)
//    {
//        List<Exams> list = examsService.selectExamsList(exams);
//        ExcelUtil<Exams> util = new ExcelUtil<Exams>(Exams.class);
//        util.exportExcel(response, list, "考试数据");
//    }

    /**
     * 获取考试详细信息
     */

    @GetMapping(value = "/{examId}")
    public Exams getInfo(@PathVariable("examId") Integer examId)
    {
        return examsService.selectExamsByExamId(examId);
    }

    /**
     * 新增考试
     */
    @PostMapping
    public int add(@RequestBody Exams exams)
    {
        return examsService.insertExams(exams);
    }

    /**
     * 修改考试
     */

    @PutMapping
    public int edit(@RequestBody Exams exams)
    {
        return examsService.updateExams(exams);
    }

    /**
     * 删除考试
     */

	@DeleteMapping("/{examIds}")
    public int remove(@PathVariable Integer[] examIds)
    {
        return examsService.deleteExamsByExamIds(examIds);
    }
}

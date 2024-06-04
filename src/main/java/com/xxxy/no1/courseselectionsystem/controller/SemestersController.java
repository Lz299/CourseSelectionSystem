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

import com.xxxy.no1.courseselectionsystem.domain.Semesters;
import com.xxxy.no1.courseselectionsystem.service.ISemestersService;


/**
 * 学期Controller
 * 
 * @author ruoyi
 * @date 2024-05-20
 */
@RestController
@RequestMapping("/CourseSelectionSystem/semesters")
public class SemestersController
{
    @Autowired
    private ISemestersService semestersService;

    /**
     * 查询学期列表
     */
    public List<Semesters> list(Semesters semesters)
    {
        List<Semesters> list = semestersService.selectSemestersList(semesters);
        return list;
    }

    /**
     * 导出学期列表
     */

//    @PostMapping("/export")
//    public void export(HttpServletResponse response, Semesters semesters)
//    {
//        List<Semesters> list = semestersService.selectSemestersList(semesters);
//        ExcelUtil<Semesters> util = new ExcelUtil<Semesters>(Semesters.class);
//        util.exportExcel(response, list, "学期数据");
//    }

    /**
     * 获取学期详细信息
     */

    @GetMapping(value = "/{semesterId}")
    public Semesters getInfo(@PathVariable("semesterId") Integer semesterId)
    {
        return semestersService.selectSemestersBySemesterId(semesterId);
    }

    /**
     * 新增学期
     */
    @PostMapping
    public int add(@RequestBody Semesters semesters)
    {
        return semestersService.insertSemesters(semesters);
    }

    /**
     * 修改学期
     */

    @PutMapping
    public int edit(@RequestBody Semesters semesters)
    {
        return semestersService.updateSemesters(semesters);
    }

    /**
     * 删除学期
     */

	@DeleteMapping("/{semesterIds}")
    public int remove(@PathVariable Integer[] semesterIds)
    {
        return semestersService.deleteSemestersBySemesterIds(semesterIds);
    }
}

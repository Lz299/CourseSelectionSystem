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

import com.xxxy.no1.courseselectionsystem.domain.Absences;
import com.xxxy.no1.courseselectionsystem.service.IAbsencesService;


/**
 * 请假记录Controller
 * 
 * @author ruoyi
 * @date 2024-05-20
 */
@RestController
@RequestMapping("/CourseSelectionSystem/absences")
public class AbsencesController
{
    @Autowired
    private IAbsencesService absencesService;

    /**
     * 查询请假记录列表
     */
    @GetMapping("/list")
    public List<Absences> list(Absences absences)
    {

        List<Absences> list = absencesService.selectAbsencesList(absences);
        return list;
    }

    /**
     * 导出请假记录列表
     */

//    @PostMapping("/export")
//    public void export(HttpServletResponse response, Absences absences)
//    {
//        List<Absences> list = absencesService.selectAbsencesList(absences);
//        ExcelUtil<Absences> util = new ExcelUtil<Absences>(Absences.class);
//        util.exportExcel(response, list, "请假记录数据");
//    }

    /**
     * 获取请假记录详细信息
     */

    @GetMapping(value = "/{absenceId}")
    public Absences getInfo(@PathVariable("absenceId") Integer absenceId)
    {
        return absencesService.selectAbsencesByAbsenceId(absenceId);
    }

    /**
     * 新增请假记录
     */

    @PostMapping
    public int add(@RequestBody Absences absences)
    {
        return absencesService.insertAbsences(absences);
    }

    /**
     * 修改请假记录
     */

    @PutMapping
    public int edit(@RequestBody Absences absences)
    {
        return absencesService.updateAbsences(absences);
    }

    /**
     * 删除请假记录
     */

	@DeleteMapping("/{absenceIds}")
    public int remove(@PathVariable Integer[] absenceIds)
    {
        return absencesService.deleteAbsencesByAbsenceIds(absenceIds);
    }
}

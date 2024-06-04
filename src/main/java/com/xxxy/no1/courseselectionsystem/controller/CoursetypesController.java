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

import com.xxxy.no1.courseselectionsystem.domain.Coursetypes;
import com.xxxy.no1.courseselectionsystem.service.ICoursetypesService;

/**
 * 课程类型Controller
 * 
 * @author ruoyi
 * @date 2024-05-20
 */
@RestController
@RequestMapping("/CourseSelectionSystem/coursetypes")
public class CoursetypesController
{
    @Autowired
    private ICoursetypesService coursetypesService;

    /**
     * 查询课程类型列表
     */
    @GetMapping("/list")
    public List<Coursetypes> list(Coursetypes coursetypes)
    {
        List<Coursetypes> list = coursetypesService.selectCoursetypesList(coursetypes);
        return list;
    }

    /**
     * 导出课程类型列表
     */

//    @PostMapping("/export")
//    public void export(HttpServletResponse response, Coursetypes coursetypes)
//    {
//        List<Coursetypes> list = coursetypesService.selectCoursetypesList(coursetypes);
//        ExcelUtil<Coursetypes> util = new ExcelUtil<Coursetypes>(Coursetypes.class);
//        util.exportExcel(response, list, "课程类型数据");
//    }

    /**
     * 获取课程类型详细信息
     */
    @GetMapping(value = "/{coursetypesId}")
    public Coursetypes getInfo(@PathVariable("coursetypesId") Integer coursetypesId)
    {
        return coursetypesService.selectCoursetypesByCoursetypesId(coursetypesId);
    }

    /**
     * 新增课程类型
     */

    @PostMapping
    public int add(@RequestBody Coursetypes coursetypes)
    {
        return coursetypesService.insertCoursetypes(coursetypes);
    }

    /**
     * 修改课程类型
     */

    @PutMapping
    public int edit(@RequestBody Coursetypes coursetypes)
    {
        return coursetypesService.updateCoursetypes(coursetypes);
    }

    /**
     * 删除课程类型
     */

	@DeleteMapping("/{coursetypesIds}")
    public int remove(@PathVariable Integer[] coursetypesIds)
    {
        return coursetypesService.deleteCoursetypesByCoursetypesIds(coursetypesIds);
    }
}

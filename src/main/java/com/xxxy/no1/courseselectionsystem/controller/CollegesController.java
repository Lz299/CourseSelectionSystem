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

import com.xxxy.no1.courseselectionsystem.domain.Colleges;
import com.xxxy.no1.courseselectionsystem.service.ICollegesService;


/**
 * 学院Controller
 * 
 * @author lz
 * @date 2024-05-20
 */
@RestController
@RequestMapping("/courseselectionsystem/colleges")
public class CollegesController
{
    @Autowired
    private ICollegesService collegesService;

    /**
     * 查询学院列表
     */

    @GetMapping("/list")
    public List<Colleges> list(Colleges colleges)
    {

        List<Colleges> list = collegesService.selectCollegesList(colleges);
        return list;
    }


    /**
     * 获取学院详细信息
     */
    @GetMapping(value = "/{collegeId}")
    public Colleges getInfo(@PathVariable("collegeId") Long collegeId)
    {
        return collegesService.selectCollegesByCollegeId(collegeId);
    }

    /**
     * 新增学院
     */

    @PostMapping
    public int add(@RequestBody Colleges colleges)
    {
        return collegesService.insertColleges(colleges);
    }

    /**
     * 修改学院
     */

    @PutMapping
    public int edit(@RequestBody Colleges colleges)
    {
        return collegesService.updateColleges(colleges);
    }

    /**
     * 删除学院
     */

	@DeleteMapping("/{collegeIds}")
    public int remove(@PathVariable Long[] collegeIds)
    {
        return collegesService.deleteCollegesByCollegeIds(collegeIds);
    }
}

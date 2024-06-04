package com.xxxy.no1.courseselectionsystem.controller;

import java.util.List;


import com.aliyuncs.ram.model.v20150501.CreateAccessKeyRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.xxxy.no1.courseselectionsystem.domain.Creditrequirements;
import com.xxxy.no1.courseselectionsystem.service.ICreditrequirementsService;


/**
 * 学分要求Controller
 * 
 * @author ruoyi
 * @date 2024-05-20
 */
@RestController
@RequestMapping("/CourseSelectionSystem/creditrequirements")
public class CreditrequirementsController
{
    @Autowired
    private ICreditrequirementsService creditrequirementsService;

    /**
     * 查询学分要求列表
     */
    @GetMapping("/list")
    public List<Creditrequirements> list(Creditrequirements creditrequirements)
    {

        List<Creditrequirements> list = creditrequirementsService.selectCreditrequirementsList(creditrequirements);
        return list;
    }

    /**
     * 导出学分要求列表
     */

//    @PostMapping("/export")
//    public void export(HttpServletResponse response, Creditrequirements creditrequirements)
//    {
//        List<Creditrequirements> list = creditrequirementsService.selectCreditrequirementsList(creditrequirements);
//        ExcelUtil<Creditrequirements> util = new ExcelUtil<Creditrequirements>(Creditrequirements.class);
//        util.exportExcel(response, list, "学分要求数据");
//    }

    /**
     * 获取学分要求详细信息
     */
    @GetMapping(value = "/{creditrequirementId}")
    public Creditrequirements getInfo(@PathVariable("creditrequirementId") Integer creditrequirementId)
    {
        return creditrequirementsService.selectCreditrequirementsByCreditrequirementId(creditrequirementId);
    }

    /**
     * 新增学分要求
     */

    @PostMapping
    public int add(@RequestBody Creditrequirements creditrequirements)
    {
        return creditrequirementsService.insertCreditrequirements(creditrequirements);
    }

    /**
     * 修改学分要求
     */

    @PutMapping
    public int edit(@RequestBody Creditrequirements creditrequirements)
    {
        return creditrequirementsService.updateCreditrequirements(creditrequirements);
    }

    /**
     * 删除学分要求
     */

	@DeleteMapping("/{creditrequirementIds}")
    public int remove(@PathVariable Integer[] creditrequirementIds)
    {
        return creditrequirementsService.deleteCreditrequirementsByCreditrequirementIds(creditrequirementIds);
    }
}

package com.xxxy.no1.courseselectionsystem.controller;

import java.util.List;


import com.xxxy.no1.courseselectionsystem.utils.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.xxxy.no1.courseselectionsystem.domain.Admin;
import com.xxxy.no1.courseselectionsystem.service.IAdminService;


/**
 * 管理员Controller
 * 
 * @author ruoyi
 * @date 2024-05-20
 */
@RestController
@RequestMapping("/CourseSelectionSystem/admin")
public class AdminController
{
    @Autowired
    private IAdminService adminService;

    /**
     * 查询管理员列表
     */
    @GetMapping("/list")
    public List<Admin> list(Admin admin)
    {
        List<Admin> list = adminService.selectAdminList(admin);
        return list;
    }

    /**
     * 导出管理员列表
     */
//
//    @PostMapping("/export")
//    public void export(HttpServletResponse response, Admin admin)
//    {
//        List<Admin> list = adminService.selectAdminList(admin);
//        ExcelUtil<Admin> util = new ExcelUtil<Admin>(Admin.class);
//        util.exportExcel(response, list, "管理员数据");
//    }

    /**
     * 获取管理员详细信息
     */
    @GetMapping(value = "/{adminId}")
    public Admin getInfo(@PathVariable("adminId") Integer adminId)
    {
        return adminService.selectAdminByAdminId(adminId);
    }

    /**
     * 新增管理员
     */
    @RequestMapping("/add")
    @ResponseBody
    public Result<String> add(@RequestBody Admin admin)
    {
        return Result.success(adminService.insertAdmin(admin));
    }

    /**
     * 修改管理员
     */

    @PutMapping
    public int edit(@RequestBody Admin admin)
    {
        return adminService.updateAdmin(admin);
    }

    /**
     * 删除管理员
     */

	@DeleteMapping("/{adminIds}")
    public int remove(@PathVariable Integer[] adminIds)
    {
        return adminService.deleteAdminByAdminIds(adminIds);
    }
}

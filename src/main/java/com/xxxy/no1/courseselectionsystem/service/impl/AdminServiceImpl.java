package com.xxxy.no1.courseselectionsystem.service.impl;

import java.util.List;

import com.xxxy.no1.courseselectionsystem.utils.Md5Util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.xxxy.no1.courseselectionsystem.mapper.AdminMapper;
import com.xxxy.no1.courseselectionsystem.domain.Admin;
import com.xxxy.no1.courseselectionsystem.service.IAdminService;

/**
 * 管理员Service业务层处理
 * 
 * @author ruoyi
 * @date 2024-05-20
 */
@Service
public class AdminServiceImpl implements IAdminService 
{
    @Autowired
    private AdminMapper adminMapper;

    /**
     * 查询管理员
     * 
     * @param adminId 管理员主键
     * @return 管理员
     */
    @Override
    public Admin selectAdminByAdminId(Integer adminId)
    {
        return adminMapper.selectAdminByAdminId(adminId);
    }

    /**
     * 查询管理员列表
     * 
     * @param admin 管理员
     * @return 管理员
     */
    @Override
    public List<Admin> selectAdminList(Admin admin)
    {
        return adminMapper.selectAdminList(admin);
    }

    /**
     * 新增管理员
     * 
     * @param admin 管理员
     * @return 结果
     */
    @Override
    public String insertAdmin(Admin admin)
    {
        Admin user =adminMapper.selectAdminByAdminNumber(admin.getAdminNumber());


        if (user==null){
            String md5String = Md5Util.getMD5String(admin.getAdminPassword());
            admin.setAdminPassword(md5String);
            adminMapper.insertAdmin(admin);
            return "200";
        }else {
            return "用户名已被注册";
        }
    }

    /**
     * 修改管理员
     * 
     * @param admin 管理员
     * @return 结果
     */
    @Override
    public int updateAdmin(Admin admin)
    {
        return adminMapper.updateAdmin(admin);
    }

    /**
     * 批量删除管理员
     * 
     * @param adminIds 需要删除的管理员主键
     * @return 结果
     */
    @Override
    public int deleteAdminByAdminIds(Integer[] adminIds)
    {
        return adminMapper.deleteAdminByAdminIds(adminIds);
    }

    /**
     * 删除管理员信息
     * 
     * @param adminId 管理员主键
     * @return 结果
     */
    @Override
    public int deleteAdminByAdminId(Integer adminId)
    {
        return adminMapper.deleteAdminByAdminId(adminId);
    }
}

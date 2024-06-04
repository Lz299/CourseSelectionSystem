package com.xxxy.no1.courseselectionsystem.service;

import java.util.List;
import com.xxxy.no1.courseselectionsystem.domain.Admin;

/**
 * 管理员Service接口
 * 
 * @author ruoyi
 * @date 2024-05-20
 */
public interface IAdminService 
{
    /**
     * 查询管理员
     * 
     * @param adminId 管理员主键
     * @return 管理员
     */
    public Admin selectAdminByAdminId(Integer adminId);

    /**
     * 查询管理员列表
     * 
     * @param admin 管理员
     * @return 管理员集合
     */
    public List<Admin> selectAdminList(Admin admin);

    /**
     * 新增管理员
     * 
     * @param admin 管理员
     * @return 结果
     */
    public String insertAdmin(Admin admin);

    /**
     * 修改管理员
     * 
     * @param admin 管理员
     * @return 结果
     */
    public int updateAdmin(Admin admin);

    /**
     * 批量删除管理员
     * 
     * @param adminIds 需要删除的管理员主键集合
     * @return 结果
     */
    public int deleteAdminByAdminIds(Integer[] adminIds);

    /**
     * 删除管理员信息
     * 
     * @param adminId 管理员主键
     * @return 结果
     */
    public int deleteAdminByAdminId(Integer adminId);
}

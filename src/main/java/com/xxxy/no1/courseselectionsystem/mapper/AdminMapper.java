package com.xxxy.no1.courseselectionsystem.mapper;

import java.util.List;
import com.xxxy.no1.courseselectionsystem.domain.Admin;
import org.apache.ibatis.annotations.Mapper;

/**
 * 管理员Mapper接口
 * 
 * @author ruoyi
 * @date 2024-05-20
 */
@Mapper
public interface AdminMapper 
{
    /**
     * 查询管理员
     * 
     * @param adminId 管理员主键
     * @return 管理员
     */
    public Admin selectAdminByAdminId(Integer adminId);

    public Admin selectAdminByAdminNumber(String adminNumber);
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
    public int insertAdmin(Admin admin);

    /**
     * 修改管理员
     * 
     * @param admin 管理员
     * @return 结果
     */
    public int updateAdmin(Admin admin);

    /**
     * 删除管理员
     * 
     * @param adminId 管理员主键
     * @return 结果
     */
    public int deleteAdminByAdminId(Integer adminId);

    /**
     * 批量删除管理员
     * 
     * @param adminIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteAdminByAdminIds(Integer[] adminIds);
}

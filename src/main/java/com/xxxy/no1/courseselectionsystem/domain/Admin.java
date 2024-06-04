package com.xxxy.no1.courseselectionsystem.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

/**
 * 管理员对象 admin
 * 
 * @author ruoyi
 * @date 2024-05-20
 */

@Data
public class Admin
{

    /** 管理员id */
    private Integer adminId;

    /** 管理员账号 */
    private String adminNumber;

    /** 管理员名称 */

    private String adminName;

    /** 管理员密码 */

    private String adminPassword;

    /** 权限 */
    private String permissions;

    /** 状态 */
    private String status;

    /** 创建时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date createdTime;


}

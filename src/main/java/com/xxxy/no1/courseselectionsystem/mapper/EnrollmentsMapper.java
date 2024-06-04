package com.xxxy.no1.courseselectionsystem.mapper;

import java.util.List;
import com.xxxy.no1.courseselectionsystem.domain.Enrollments;
import org.apache.ibatis.annotations.Mapper;

/**
 * 选课记录Mapper接口
 * 
 * @author ruoyi
 * @date 2024-05-20
 */
@Mapper
public interface EnrollmentsMapper 
{
    /**
     * 查询选课记录
     * 
     * @param enrollmentId 选课记录主键
     * @return 选课记录
     */
    public Enrollments selectEnrollmentsByEnrollmentId(Integer enrollmentId);

    /**
     * 查询选课记录列表
     * 
     * @param enrollments 选课记录
     * @return 选课记录集合
     */
    public List<Enrollments> selectEnrollmentsList(Enrollments enrollments);

    /**
     * 新增选课记录
     * 
     * @param enrollments 选课记录
     * @return 结果
     */
    public int insertEnrollments(Enrollments enrollments);

    /**
     * 修改选课记录
     * 
     * @param enrollments 选课记录
     * @return 结果
     */
    public int updateEnrollments(Enrollments enrollments);

    /**
     * 删除选课记录
     * 
     * @param enrollmentId 选课记录主键
     * @return 结果
     */
    public int deleteEnrollmentsByEnrollmentId(Integer enrollmentId);

    /**
     * 批量删除选课记录
     * 
     * @param enrollmentIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteEnrollmentsByEnrollmentIds(Integer[] enrollmentIds);
}

package com.xxxy.no1.courseselectionsystem.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.xxxy.no1.courseselectionsystem.mapper.EnrollmentsMapper;
import com.xxxy.no1.courseselectionsystem.domain.Enrollments;
import com.xxxy.no1.courseselectionsystem.service.IEnrollmentsService;

/**
 * 选课记录Service业务层处理
 * 
 * @author ruoyi
 * @date 2024-05-20
 */
@Service
public class EnrollmentsServiceImpl implements IEnrollmentsService 
{
    @Autowired
    private EnrollmentsMapper enrollmentsMapper;

    /**
     * 查询选课记录
     * 
     * @param enrollmentId 选课记录主键
     * @return 选课记录
     */
    @Override
    public Enrollments selectEnrollmentsByEnrollmentId(Integer enrollmentId)
    {
        return enrollmentsMapper.selectEnrollmentsByEnrollmentId(enrollmentId);
    }

    /**
     * 查询选课记录列表
     * 
     * @param enrollments 选课记录
     * @return 选课记录
     */
    @Override
    public List<Enrollments> selectEnrollmentsList(Enrollments enrollments)
    {
        return enrollmentsMapper.selectEnrollmentsList(enrollments);
    }

    /**
     * 新增选课记录
     * 
     * @param enrollments 选课记录
     * @return 结果
     */
    @Override
    public int insertEnrollments(Enrollments enrollments)
    {
        return enrollmentsMapper.insertEnrollments(enrollments);
    }

    /**
     * 修改选课记录
     * 
     * @param enrollments 选课记录
     * @return 结果
     */
    @Override
    public int updateEnrollments(Enrollments enrollments)
    {
        return enrollmentsMapper.updateEnrollments(enrollments);
    }

    /**
     * 批量删除选课记录
     * 
     * @param enrollmentIds 需要删除的选课记录主键
     * @return 结果
     */
    @Override
    public int deleteEnrollmentsByEnrollmentIds(Integer[] enrollmentIds)
    {
        return enrollmentsMapper.deleteEnrollmentsByEnrollmentIds(enrollmentIds);
    }

    /**
     * 删除选课记录信息
     * 
     * @param enrollmentId 选课记录主键
     * @return 结果
     */
    @Override
    public int deleteEnrollmentsByEnrollmentId(Integer enrollmentId)
    {
        return enrollmentsMapper.deleteEnrollmentsByEnrollmentId(enrollmentId);
    }
}

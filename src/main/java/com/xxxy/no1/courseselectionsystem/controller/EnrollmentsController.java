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

import com.xxxy.no1.courseselectionsystem.domain.Enrollments;
import com.xxxy.no1.courseselectionsystem.service.IEnrollmentsService;


/**
 * 选课记录Controller
 * 
 * @author ruoyi
 * @date 2024-05-20
 */
@RestController
@RequestMapping("/CourseSelectionSystem/enrollments")
public class EnrollmentsController
{
    @Autowired
    private IEnrollmentsService enrollmentsService;

    /**
     * 查询选课记录列表
     */
    @GetMapping("/list")
    public List<Enrollments> list(Enrollments enrollments)
    {

        List<Enrollments> list = enrollmentsService.selectEnrollmentsList(enrollments);
        return list;
    }

    /**
     * 导出选课记录列表
     */
//    @PostMapping("/export")
//    public void export(HttpServletResponse response, Enrollments enrollments)
//    {
//        List<Enrollments> list = enrollmentsService.selectEnrollmentsList(enrollments);
//        ExcelUtil<Enrollments> util = new ExcelUtil<Enrollments>(Enrollments.class);
//        util.exportExcel(response, list, "选课记录数据");
//    }

    /**
     * 获取选课记录详细信息
     */

    @GetMapping(value = "/{enrollmentId}")
    public Enrollments getInfo(@PathVariable("enrollmentId") Integer enrollmentId)
    {
        return enrollmentsService.selectEnrollmentsByEnrollmentId(enrollmentId);
    }

    /**
     * 新增选课记录
     */

    @PostMapping
    public int add(@RequestBody Enrollments enrollments)
    {
        return enrollmentsService.insertEnrollments(enrollments);
    }

    /**
     * 修改选课记录
     */
    @PutMapping
    public int edit(@RequestBody Enrollments enrollments)
    {
        return enrollmentsService.updateEnrollments(enrollments);
    }

    /**
     * 删除选课记录
     */

	@DeleteMapping("/{enrollmentIds}")
    public int remove(@PathVariable Integer[] enrollmentIds)
    {
        return enrollmentsService.deleteEnrollmentsByEnrollmentIds(enrollmentIds);
    }
}

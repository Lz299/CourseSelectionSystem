package com.xxxy.no1.courseselectionsystem.controller;

import com.xxxy.no1.courseselectionsystem.domain.Students;
import com.xxxy.no1.courseselectionsystem.utils.ExcelUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;


@Controller
@RestController
public class uploadController {
    @PostMapping("/import")
    public void importUser(MultipartFile file) throws Exception {
        System.out.println(file);
        List<Students> users = ExcelUtils.read(file, Students.class);
        for (Students user : users) {
            System.out.println(user.toString());
        }
    }
}

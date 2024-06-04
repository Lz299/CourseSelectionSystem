package com.xxxy.no1.courseselectionsystem.utils;

import org.springframework.util.FileCopyUtils;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

public class MultipartFileToFile {


    public File multipartFile2File(MultipartFile multipartFile) {
        String path = "/export/demo.xlsx"; // 确保这是正确的路径，并且您的应用有权在该路径下写入
        File file = new File(path);

        try {
            // 确保父目录存在
            File parentDir = file.getParentFile();
            if (parentDir != null && !parentDir.exists()) {
                parentDir.mkdirs();
            }

            // 使用 transferTo 方法写入文件
            multipartFile.transferTo(file);

        } catch (IOException e) {
            // 捕获并处理 IO 异常
            throw new RuntimeException("无法将 MultipartFile 写入文件：" + e.getMessage(), e);
        }

        return file;
    }

}


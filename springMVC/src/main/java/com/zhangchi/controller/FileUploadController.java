package com.zhangchi.controller;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.io.*;

/**
 * @Author 张驰
 * @Description:
 * @Date: created in 10:51 2018/7/23
 * @Modified By:
 */
@RequestMapping("/file")
@Controller
public class FileUploadController {

    @GetMapping("/upload")
    public String fileUploadp() {

        return "/file/upload";

    }

    @PostMapping("/upload")
    public String fileUpload(MultipartFile file, RedirectAttributes redirectAttributes) {

        if (!file.isEmpty()) {
            // file
            System.out.println(file.getName());
            // image/jpeg
            System.out.println(file.getContentType());
            // 可阅读的文件大小
            System.out.println(FileUtils.byteCountToDisplaySize(file.getSize()));
            // 文件原始名称
            System.out.println(file.getOriginalFilename());

            File directory = new File("d:/temp/img/");
            if (!directory.exists()) {
                directory.mkdirs();
            }

            try {
                OutputStream outputStream = new FileOutputStream(new File(directory, file.getOriginalFilename()));
                InputStream inputStream = file.getInputStream();
                IOUtils.copy(inputStream, outputStream);

                // 释放资源
                outputStream.flush();
                outputStream.close();
                inputStream.close();

            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("文件不能为空");
            redirectAttributes.addFlashAttribute("message", "文件不能为空");

        }

        return "redirect:/file/upload";
    }
}
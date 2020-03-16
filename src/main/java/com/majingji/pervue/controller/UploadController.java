package com.majingji.pervue.controller;

import com.majingji.pervue.vo.ResultEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

@RestController
public class UploadController {
    @RequestMapping("/upload")
    public ResultEntity Upload(MultipartFile file){
        if(file !=null && !file.isEmpty()){
            //获取文件的原始名称
            String filename = file.getOriginalFilename();
            //生成唯一的前缀
            String pref = UUID.randomUUID().toString();
            //获取后缀
            String suf = filename.substring(filename.lastIndexOf("."));
            //创建一个文件对象用来存放要上传的文件
            File file1 = new File("G:\\pic\\", pref + suf);
            //将文件上传到指定的文件中去
            try {
                file.transferTo(file1);
                String userface = "http://localhost:92/img/"+pref+suf;
                return ResultEntity.ok(userface);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return ResultEntity.error();
    }
}

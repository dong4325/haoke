package cn.itcast.haoke.dubbo.api.controller;

import cn.itcast.haoke.dubbo.api.service.PicUploadService;
import cn.itcast.haoke.dubbo.api.vo.PicUploadResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@RequestMapping("/pic/upload")
@Controller
public class PicUploadController {
    @Autowired
    private PicUploadService picUploadService;

    /**
     * @param uploadFile
     * @return
     * @throws Exception
     */
    @PostMapping
    @ResponseBody
    public PicUploadResult upload(@RequestParam("file") MultipartFile uploadFile)
            throws Exception {
        return this.picUploadService.upload(uploadFile);
    }
}
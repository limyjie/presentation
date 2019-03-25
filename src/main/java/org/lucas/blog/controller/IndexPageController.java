/**
 * Author: lin
 * Date: 2019/3/9 21:01
 */
package org.lucas.blog.controller;


import org.lucas.blog.service.IndexPageService;
import org.lucas.blog.utils.LogUtil;
import org.lucas.blog.utils.ResponseObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.IOException;
import java.util.Optional;

@RestController
@RequestMapping("/index")
public class IndexPageController {

    @Autowired
    private IndexPageService indexPageService;

    @PostMapping(value = "/get")
    public ResponseObject getIndexPage(@RequestBody String projectId) {
        return indexPageService.getIndexPageByProjectId(Integer.getInteger(projectId));
    }

    @PostMapping(value = "/upImg")
    public ResponseObject upImg(HttpServletRequest request,
                                @RequestParam("file") MultipartFile multipartFile,
                                @RequestParam("imgPlace") String imgPlace) {


        LogUtil.log(this,multipartFile.getContentType());
        HttpSession session = request.getSession();
        session.setAttribute("pid","1001");
        //将指定的值封装为Optional对象，如果值为null，则创建空的optional对象
        Optional<String> optional = Optional.ofNullable((String)request.getSession().getAttribute("pid"));

        //从session取出pid，若pid为空，则为session设置pid
        String projectID = (String)session.getAttribute("pid");

        ResponseObject responseObject =  indexPageService.renewImg(multipartFile, projectID, imgPlace);
        return responseObject;
    }
}

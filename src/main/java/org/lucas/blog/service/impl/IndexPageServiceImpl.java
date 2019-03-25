/**
 * Author: lin
 * Date: 2019/3/9 21:00
 */
package org.lucas.blog.service.impl;

import org.lucas.blog.dao.IndexPageDAO;
import org.lucas.blog.entity.IndexPage;
import org.lucas.blog.service.IndexPageService;
import org.lucas.blog.utils.LogUtil;
import org.lucas.blog.utils.ResponseObject;
import org.lucas.blog.utils.StringUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;


@Service
public class IndexPageServiceImpl implements IndexPageService {


    @Autowired
    private IndexPageDAO indexPageDAO;

    @Override
    public ResponseObject getIndexPageByProjectId(Integer projectId) {

        IndexPage indexPage = indexPageDAO.selectIndexPageByProjectId(projectId);

        if(indexPage==null){
            return ResponseObject.send(-1,"cannot find index page",null);
        }

        return ResponseObject.send(0,"find index page",indexPage);
    }

    @Override
    public ResponseObject renewImg(MultipartFile multipartFile, String projectID, String imgPlace) {

        if(multipartFile.isEmpty()){
            return ResponseObject.send(-1,"文件不能为空",null);
        }
        String filePath = StringUtil.imgContext+projectID+imgPlace+multipartFile.getOriginalFilename();
        File file = new File(filePath);
        LogUtil.log("getAbsolutePath "+this,file.getAbsolutePath());
        try {
            multipartFile.transferTo(file);
            LogUtil.log(this,imgPlace+" "+filePath);
            indexPageDAO.updateImgPath(imgPlace,StringUtil.imgUrlContext+projectID+imgPlace+multipartFile.getOriginalFilename());
        } catch (IOException e) {
            e.printStackTrace();
        }
        return ResponseObject.send(0,"提交成功",null);
    }


}

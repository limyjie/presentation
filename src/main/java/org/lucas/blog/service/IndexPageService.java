package org.lucas.blog.service;

import org.lucas.blog.utils.ResponseObject;
import org.springframework.web.multipart.MultipartFile;

public interface IndexPageService {

    ResponseObject getIndexPageByProjectId(Integer projectId);

    ResponseObject renewImg(MultipartFile  multipartFile, String  projectID, String imgPlace);
}

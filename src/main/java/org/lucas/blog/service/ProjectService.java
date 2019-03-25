package org.lucas.blog.service;

import org.lucas.blog.utils.ResponseObject;
import org.springframework.web.bind.annotation.ResponseBody;

public interface ProjectService {

    ResponseObject findProjectByIdAndManager(Integer pid,Integer mid);

    ResponseObject findProjectIndexPageById(Integer pid);

    default ResponseObject findProjectViewPageByViewId(){
        return null;
    }
}

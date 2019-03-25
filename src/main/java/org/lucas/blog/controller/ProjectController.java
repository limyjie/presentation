/**
 * Author: lin
 * Date: 2019/3/10 12:43
 */
package org.lucas.blog.controller;


import org.lucas.blog.entity.Project;
import org.lucas.blog.service.ProjectService;
import org.lucas.blog.utils.ResponseObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@RestController
@RequestMapping("/project")
public class ProjectController {

    @Autowired
    private ProjectService projectService;

    @GetMapping("/info")
    public ResponseObject getProjectInfo(HttpServletRequest request){
        HttpSession  session = request.getSession();
       // String pidStr = (String)session.getAttribute("pid");
       // Integer pid = Integer.getInteger(pidStr);
        //session.getAttribute("mid");

        return  projectService.findProjectByIdAndManager(1001,10001);
    }

    @GetMapping("/index")
    public ResponseObject getIndexPage(){

        return projectService.findProjectIndexPageById(1001);
    }


}

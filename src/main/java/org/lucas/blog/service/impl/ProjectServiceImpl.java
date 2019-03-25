/**
 * Author: lin
 * Date: 2019/3/10 12:55
 */
package org.lucas.blog.service.impl;

import org.lucas.blog.dao.ProjectDAO;
import org.lucas.blog.entity.IndexPage;
import org.lucas.blog.entity.Project;
import org.lucas.blog.service.ProjectService;
import org.lucas.blog.utils.ResponseObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ProjectServiceImpl implements ProjectService {

    @Autowired
    private ProjectDAO projectDAO;

    @Override
    public ResponseObject findProjectByIdAndManager(Integer pid, Integer mid) {

        Project project = projectDAO.selectProjectById(pid);

        if (project != null) {
            return ResponseObject.send(0, "project find", project);
        }
        return ResponseObject.send(-1, "project not found", null);
    }

    @Override
    public ResponseObject findProjectIndexPageById(Integer pid) {

        IndexPage indexPage = projectDAO.selectIndexPageByProjectId(pid);

        if (indexPage != null) {
            return ResponseObject.send(0, "index page found", indexPage);
        }

        return ResponseObject.send(-1, "index page not found", null);
    }
}

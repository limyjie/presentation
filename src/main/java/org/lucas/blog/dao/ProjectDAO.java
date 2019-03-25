package org.lucas.blog.dao;

import org.lucas.blog.entity.IndexPage;
import org.lucas.blog.entity.Project;

public interface ProjectDAO {

    Project selectProjectById(Integer pid);

    IndexPage selectIndexPageByProjectId(Integer pid);
}

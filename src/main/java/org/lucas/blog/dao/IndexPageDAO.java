package org.lucas.blog.dao;

import org.apache.ibatis.annotations.Param;
import org.lucas.blog.entity.IndexPage;

public interface IndexPageDAO {

    IndexPage selectIndexPageByProjectId(Integer projectId);

    int updateImgPath(@Param("imgPlace")String imgPlace,
                      @Param("imgPath")String path);
}

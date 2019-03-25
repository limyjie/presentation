package org.lucas.blog.dao;

import org.lucas.blog.entity.User;

public interface UserDAO {

    User selectUserByNameAndPassword(User user);
}

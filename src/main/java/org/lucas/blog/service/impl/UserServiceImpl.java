/**
 * Author: lin
 * Date: 2019/3/5 18:31
 */
package org.lucas.blog.service.impl;


import org.lucas.blog.dao.UserDAO;
import org.lucas.blog.entity.User;
import org.lucas.blog.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.logging.Level;
import java.util.logging.Logger;


@Service
public class UserServiceImpl implements UserService {

    private Logger logger = Logger.getLogger(this.getClass().getCanonicalName());

    @Autowired
    private UserDAO userDAO;


    @Override
    public boolean login(User webUser) {

        User dbUser = userDAO.selectUserByNameAndPassword(webUser);

        if(dbUser!=null) logger.log(Level.WARNING,dbUser.toString());

        return dbUser!=null ;


    }
}

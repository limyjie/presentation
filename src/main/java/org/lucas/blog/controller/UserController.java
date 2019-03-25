/**
 * Author: lin
 * Date: 2019/3/5 18:32
 */
package org.lucas.blog.controller;


import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import org.lucas.blog.entity.User;
import org.lucas.blog.service.UserService;
import org.lucas.blog.utils.ResponseObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.logging.Level;
import java.util.logging.Logger;

@RestController
@RequestMapping("/user")
public class UserController {

    private Logger logger = Logger.getLogger(this.getClass().getCanonicalName());

    @Autowired
    private UserService userService;
    /*requestBody 接收前端提交的json请求体，请求体与User类之间的属性名称应当保持一致*/
    @PostMapping("/login")
    public ResponseEntity<User> login(@RequestBody User webUser,
                                HttpServletRequest request) {


        boolean userCorrect = userService.login(webUser);

        /*if (userCorrect) {
            return ResponseObject.send(0, "login success", webUser);
        }

        return ResponseObject.send(-1, "login failed", null);
        */
        webUser.setUsername("admin");
        HttpHeaders headers = new HttpHeaders();
        headers.add("success","true");
        return new ResponseEntity<>(webUser,headers, HttpStatus.CREATED);

    }
}

/**
 * Author: lin
 * Date: 2019/2/25 20:01
 */
package org.lucas.blog.controller;


import org.lucas.blog.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DefaultController {

    @GetMapping("/index")
    public String index() {
        return "index";
    }

    @GetMapping("/admin")
    public String admin() {
        return "admin";
    }

    @GetMapping("/login")
    public String login(User user) {
        return "login";
    }


    @GetMapping("/sideNav")
    public String sideNavigation() {
        return "sideNav";
    }

    @GetMapping("/page1")
    public String page1() {
        return "page1";
    }

    @GetMapping("/page2")
    public String page2() {
        return "page2";
    }

    @GetMapping("/page3")
    public String page3() {
        return "page3";
    }

    @GetMapping("/page4")
    public String page4() {
        return "page4";
    }

    @GetMapping("/page5")
    public String page5() {
        return "page5";
    }

    @GetMapping("/page6")
    public String page6() {
        return "page6";
    }

    @GetMapping("/page7")
    public String page7() {
        return "page7";
    }

    @GetMapping("/footer")
    public String footer() {
        return "footer";
    }

    @GetMapping("/mIndex")
    public String mIndex() {
        return "mIndex";
    }

    @GetMapping("/test")
    public String test(){
        return "test";
    }

}


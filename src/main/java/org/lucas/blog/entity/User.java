/**
 * Author: lin
 * Date: 2019/3/5 18:22
 */
package org.lucas.blog.entity;

import org.lucas.blog.service.UserService;

import java.io.Serializable;

public class User implements Serializable {

    private Integer id;
    private String userName;
    private String password;

    public User(){

    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("User{");
        sb.append("id=").append(id);
        sb.append(", username='").append(userName).append('\'');
        sb.append(", password='").append(password).append('\'');
        sb.append('}');
        return sb.toString();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return userName;
    }

    public void setUsername(String username) {
        this.userName = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


}

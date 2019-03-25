/**
 * Author: lin
 * Date: 2019/3/10 12:44
 */
package org.lucas.blog.entity;

import java.io.Serializable;

public class Project implements Serializable {

    private Integer id;
    private String name;
    private Integer managerId;

    public Project(){}

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Project{");
        sb.append("id=").append(id);
        sb.append(", name='").append(name).append('\'');
        sb.append(", managerId=").append(managerId);
        sb.append('}');
        return sb.toString();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getManagerId() {
        return managerId;
    }

    public void setManagerId(Integer managerId) {
        this.managerId = managerId;
    }
}

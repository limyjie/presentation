/**
 * Author: lin
 * Date: 2019/3/9 15:38
 */
package org.lucas.blog.utils;

public class ResponseObject<T> {
    private  Integer status;
    private  String msg;
    private  T object;

    public ResponseObject() {
    }


    public static <T>ResponseObject send(Integer status,String msg,T object){
        ResponseObject responseObject = new ResponseObject();
        responseObject.setStatus(status);
        responseObject.setMsg(msg);
        responseObject.setObject(object);
        return responseObject;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ResponseObject{");
        sb.append("status=").append(status);
        sb.append(", msg='").append(msg).append('\'');
        sb.append(", object=").append(object);
        sb.append('}');
        return sb.toString();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getObject() {
        return object;
    }

    public void setObject(T object) {
        this.object = object;
    }
}

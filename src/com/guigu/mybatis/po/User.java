package com.guigu.mybatis.po;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * <p>project_name:MyBatisDay02</p>
 * <p>package_name:com.guigu.mybatis.po.User</p>
 * <p>description：</p>
 * <p>@author：刘老师<p>   
 * <p> date:2018年1月17日上午8:49:07 </p>
 * <p>comments：    </p>
 * <p>@version  jdk1.8</p>
 * 
 * <p>Copyright (c) 2018, 980991634@qq.com All Rights Reserved. </p>
 */
public class User implements Serializable {

    private int id;

    private String username;

    private String sex;

    private Date birthday;

    private String address;
    
    private List<Orders> ordersList;
    
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    
    
    

    public List<Orders> getOrdersList() {
        return ordersList;
    }

    public void setOrdersList(List<Orders> ordersList) {
        this.ordersList = ordersList;
    }

    @Override
    public String toString() {
        return "User [id=" + id + ", username=" + username + ", sex=" + sex + ", birthday=" + birthday + ", address="
                + address + "]";
    }

    

}

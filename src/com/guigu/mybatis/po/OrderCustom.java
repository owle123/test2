package com.guigu.mybatis.po;

/**       
 * <p>project_name:MyBatisDay02</p>
 * <p>package_name:com.guigu.mybatis.po.OrderCustom</p>
 * <p>description��</p>
 * <p>@author������ʦ<p>   
 * <p> date:2018��1��17������8:49:53 </p>
 * <p>comments��    </p>
 * <p>@version  jdk1.8</p>
 * 
 * <p>Copyright (c) 2018, 980991634@qq.com All Rights Reserved. </p>    
 */

public class OrderCustom extends Orders {

    // ����û�����
    private String username;

    private String sex;

    private String address;

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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

}

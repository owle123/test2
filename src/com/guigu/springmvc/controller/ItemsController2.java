package com.guigu.springmvc.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.HttpRequestHandler;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import com.guigu.mybatis.po.Items;

/**       
 * <p>project_name:SpringMVCDay01</p>
 * <p>package_name:com.guigu.springmvc.controller.ItemsController</p>
 * <p>description：</p>
 * <p>@author：刘老师<p>   
 * <p> date:2018年1月18日上午9:30:28 </p>
 * <p>comments：    </p>
 * <p>@version  jdk1.8</p>
 * 
 * <p>Copyright (c) 2018, 980991634@qq.com All Rights Reserved. </p>    
 */

public class ItemsController2  implements HttpRequestHandler{

    @Override
    public void handleRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setCharacterEncoding("UTF-8");
        //模拟 从数据库查询数据   
        //查询到List集合
        List<Items> itemsList =new ArrayList<>();
        
        Items items1 =new Items();
        items1.setName("iphonex11");
        items1.setPrice(8388f);
        items1.setDetail("这个还不错111");
        items1.setCreatetime(new Date());
        
        Items items2 =new Items();
        items2.setName("联想笔记本111");
        items2.setPrice(9388f);
        items2.setCreatetime(new Date());
        items2.setDetail("联想笔记本挺好的....不卡11");
        
        
        Items items3 =new Items();
        items3.setName("格力空调11");
        items3.setPrice(7888f);
        items3.setDetail("格力空调质量挺好...111");
        items3.setCreatetime(new Date());
        
        itemsList.add(items1);
        itemsList.add(items2);
        itemsList.add(items3);
        
        //可以利用web的相关知识
        //填充数据
        request.setAttribute("itemsList", itemsList);
        //设置视图
        request.getRequestDispatcher("/WEB-INF/jsp/items/itemsList.jsp").forward(request, response);
    }



}



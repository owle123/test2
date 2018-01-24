package com.guigu.springmvc.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.guigu.mybatis.po.Items;

/**       
 * <p>project_name:SpringMVCDay01</p>
 * <p>package_name:com.guigu.springmvc.controller.ItemsController3</p>
 * <p>description：</p>
 * <p>@author：刘老师<p>   
 * <p> date:2018年1月18日上午11:10:10 </p>
 * <p>comments：    </p>
 * <p>@version  jdk1.8</p>
 * 
 * <p>Copyright (c) 2018, 980991634@qq.com All Rights Reserved. </p>    
 */

@Controller
public class ItemsController3 {
    
    @RequestMapping("/queryItem4.action")
    public ModelAndView queryItem() {
        //模拟 从数据库查询数据   
        //查询到List集合
        List<Items> itemsList =new ArrayList<>();
        
        Items items1 =new Items();
        items1.setName("iphonex44");
        items1.setPrice(8388f);
        items1.setDetail("这个还不错444");
        items1.setCreatetime(new Date());
        
        Items items2 =new Items();
        items2.setName("联想笔记本444");
        items2.setPrice(9388f);
        items2.setCreatetime(new Date());
        items2.setDetail("联想笔记本挺好的....不卡444");
        
        
        Items items3 =new Items();
        items3.setName("格力空调444");
        items3.setPrice(7888f);
        items3.setDetail("格力空调质量挺好...444");
        items3.setCreatetime(new Date());
        
        itemsList.add(items1);
        itemsList.add(items2);
        itemsList.add(items3);
        
        //创建ModelAndView  填充数据 和 设置视图
        ModelAndView modelAndView =new ModelAndView();
        //添加数据   相当于request.setAttribute("itemsList",itemsList);
        modelAndView.addObject("itemsList",itemsList);
        //设置视图
        modelAndView.setViewName("items/itemsList");
        
        return modelAndView;
    }
    
    
}



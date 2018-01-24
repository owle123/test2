package com.guigu.springmvc.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import com.guigu.mybatis.po.Items;

/**       
 * <p>project_name:SpringMVCDay01</p>
 * <p>package_name:com.guigu.springmvc.controller.ItemsController</p>
 * <p>description��</p>
 * <p>@author������ʦ<p>   
 * <p> date:2018��1��18������9:30:28 </p>
 * <p>comments��    </p>
 * <p>@version  jdk1.8</p>
 * 
 * <p>Copyright (c) 2018, 980991634@qq.com All Rights Reserved. </p>    
 */
public class ItemsController  implements Controller{

    @Override
    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
        //ģ�� �����ݿ��ѯ����   
        //��ѯ��List����
        List<Items> itemsList =new ArrayList<>();
        
        Items items1 =new Items();
        items1.setName("iphonex");
        items1.setPrice(8388f);
        items1.setDetail("���������");
        items1.setCreatetime(new Date());
        
        Items items2 =new Items();
        items2.setName("����ʼǱ�");
        items2.setPrice(9388f);
        items2.setCreatetime(new Date());
        items2.setDetail("����ʼǱ�ͦ�õ�....����");
        
        
        Items items3 =new Items();
        items3.setName("�����յ�");
        items3.setPrice(7888f);
        items3.setDetail("�����յ�����ͦ��...");
        items3.setCreatetime(new Date());
        
        itemsList.add(items1);
        itemsList.add(items2);
        itemsList.add(items3);
        
        //����ModelAndView  ������� �� ������ͼ
        ModelAndView modelAndView =new ModelAndView();
        //�������   �൱��request.setAttribute("itemsList",itemsList);
        modelAndView.addObject("itemsList",itemsList);
        //������ͼ
        modelAndView.setViewName("items/itemsList");
        
        return modelAndView;
    }

}



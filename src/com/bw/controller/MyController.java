package com.bw.controller;


import com.bw.entity.Dept;
import com.bw.entity.Emp;
import com.bw.entity.EmpDeptVo;
import com.bw.service.MyService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.apache.ibatis.reflection.SystemMetaObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Title: 类标题
 * Description: 类功能描述
 * Author:胡正林(823865618@qq.com)
 * Date:2019/5/27-11:09
 */
@Controller
public class MyController {
    @Autowired
    private MyService service;

    //实现修改功能
    @RequestMapping("update.do")
    @ResponseBody
    public Object update(Emp emp){
        System.out.println(emp);
        service.update(emp);
        return true;
    }

    //实现回显功能
    @RequestMapping("show.do")
    @ResponseBody
    public Object show(@RequestParam(defaultValue = "")String eid){
        System.out.println(eid);
        Emp show = service.show(Integer.parseInt(eid));
        return show;
    }

    //实现批量删除
    @RequestMapping("pldelete.do")
    @ResponseBody
    public Object pldelete(@RequestParam(defaultValue = "")String eid){
        System.out.println(eid);
        //按照逗号分隔
        String[] split = eid.split(",");
        //写一个数组
        int[] arr=new int[split.length];
        //写一个下标
        int i=0;
        for (String s : split) {
            arr[i]=Integer.parseInt(s);
            i++;
        }
        service.pldelete(arr);
        return true;
    }

    //实现添加功能
    @RequestMapping("add.do")
    @ResponseBody
    public Object listdept(Emp emp){
        System.out.println(emp);
        service.addemp(emp);
        return true;
    }

    //实现下拉框
    @RequestMapping("xiala.do")
    @ResponseBody
    public Object listdept(){
        List<Dept> list = service.listdept();
        return list;
    }

    //实现列表
    @RequestMapping("listemp.do")
    public String listemp(Model model, @RequestParam(defaultValue = "1")Integer pagenum,
                          @RequestParam(defaultValue = "")String ename,
                          @RequestParam(defaultValue = "")String mindate,
                          @RequestParam(defaultValue = "")String maxdate){
        //写一个集合
        Map<String, Object> map = new HashMap<>();
        map.put("ename",ename);
        map.put("mindate",mindate);
        map.put("maxdate",maxdate);
        //写一个pageHelper
        PageHelper.startPage(pagenum,2);
        List<EmpDeptVo> list = service.listemp(map);
        //写一个pageInfo对象，把查询放进分页中
        PageInfo page=new PageInfo(list);
        model.addAttribute("page",page);
        model.addAttribute("ename",ename);
        model.addAttribute("mindate",mindate);
        model.addAttribute("maxdate",maxdate);
        return "list";
    }
}

package com.bw.service;


import com.bw.entity.Dept;
import com.bw.entity.Emp;
import com.bw.entity.EmpDeptVo;

import java.util.List;
import java.util.Map;

/**
 * Title: 类标题
 * Description: 类功能描述
 * Author:胡正林(823865618@qq.com)
 * Date:2019/5/27-11:07
 */
public interface MyService {
    //实现修改功能
    void update(Emp emp);

    //实现回显功能
    Emp show(int eid);

    //实现批量删除
    void pldelete(int[] arr);

    //实现添加功能
    void addemp(Emp emp);

    //实现下拉框
    List<Dept> listdept();

    //实现员工列表
    List<EmpDeptVo> listemp(Map<String,Object> map);
}

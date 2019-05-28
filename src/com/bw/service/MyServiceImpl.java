package com.bw.service;


import com.bw.entity.Dept;
import com.bw.entity.Emp;
import com.bw.entity.EmpDeptVo;
import com.bw.mapper.MyMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * Title: 类标题
 * Description: 类功能描述
 * Author:胡正林(823865618@qq.com)
 * Date:2019/5/27-11:07
 */
@Service
public class MyServiceImpl implements MyService{
    @Autowired
    private MyMapper mapper;

    //实现修改功能
    public void update(Emp emp) {
        mapper.update(emp);
    }

    //实现回显功能
    public Emp show(int eid) {
        return mapper.show(eid);
    }

    //实现批量删除
    public void pldelete(int[] arr) {
        mapper.pldelete(arr);
    }

    //实现添加员工
    public void addemp(Emp emp) {
        mapper.addemp(emp);
    }

    //实现下拉框
    public List<Dept> listdept() {
        return mapper.listdept();
    }

    //实现列表
    public List<EmpDeptVo> listemp(Map<String,Object> map){
      return mapper.listemp(map);
    }
}

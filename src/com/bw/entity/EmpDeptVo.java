package com.bw.entity;

import java.sql.Date;

/**
 * Title: 类标题
 * Description: 类功能描述
 * Author:胡正林(823865618@qq.com)
 * Date:2019/5/27-10:34
 */
public class EmpDeptVo {
    private int eid;
    private String ename;
    private String sex;
    private Date birthdate;
    private String hobby;
    private int did;
    private Dept dept;

    public int getEid() {
        return eid;
    }

    public void setEid(int eid) {
        this.eid = eid;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Date getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    public int getDid() {
        return did;
    }

    public void setDid(int did) {
        this.did = did;
    }

    public Dept getDept() {
        return dept;
    }

    public void setDept(Dept dept) {
        this.dept = dept;
    }

    public EmpDeptVo() {
    }

    public EmpDeptVo(int eid, String ename, String sex, Date birthdate, String hobby, int did, Dept dept) {
        this.eid = eid;
        this.ename = ename;
        this.sex = sex;
        this.birthdate = birthdate;
        this.hobby = hobby;
        this.did = did;
        this.dept = dept;
    }

    public EmpDeptVo(int eid, String ename, String sex, Date birthdate, String hobby, int did) {
        this.eid = eid;
        this.ename = ename;
        this.sex = sex;
        this.birthdate = birthdate;
        this.hobby = hobby;
        this.did = did;
    }

    public EmpDeptVo(int eid, String ename, String sex, Date birthdate, String hobby, Dept dept) {
        this.eid = eid;
        this.ename = ename;
        this.sex = sex;
        this.birthdate = birthdate;
        this.hobby = hobby;
        this.dept = dept;
    }

    @Override
    public String toString() {
        return "EmpDeptVo{" +
                "eid=" + eid +
                ", ename='" + ename + '\'' +
                ", sex='" + sex + '\'' +
                ", birthdate=" + birthdate +
                ", hobby='" + hobby + '\'' +
                ", did=" + did +
                ", dept=" + dept +
                '}';
    }
}

package com.bw.entity;

import java.sql.Date;

/**
 * Title: 类标题
 * Description: 类功能描述
 * Author:胡正林(823865618@qq.com)
 * Date:2019/5/27-10:24
 */
public class Emp {
    private int eid;
    private String ename;
    private String sex;
    private Date birthdate;
    private String hobby;
    private int did;

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

    public Emp() {
    }

    public Emp(int eid, String ename, String sex, Date birthdate, String hobby, int did) {
        this.eid = eid;
        this.ename = ename;
        this.sex = sex;
        this.birthdate = birthdate;
        this.hobby = hobby;
        this.did = did;
    }

    public Emp(String ename, String sex, Date birthdate, String hobby) {
        this.ename = ename;
        this.sex = sex;
        this.birthdate = birthdate;
        this.hobby = hobby;
    }

    public Emp(String ename, String sex, Date birthdate, String hobby, int did) {
        this.ename = ename;
        this.sex = sex;
        this.birthdate = birthdate;
        this.hobby = hobby;
        this.did = did;
    }

    public Emp(int eid, String ename, String sex, Date birthdate, String hobby) {
        this.eid = eid;
        this.ename = ename;
        this.sex = sex;
        this.birthdate = birthdate;
        this.hobby = hobby;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "eid=" + eid +
                ", ename='" + ename + '\'' +
                ", sex='" + sex + '\'' +
                ", birthdate=" + birthdate +
                ", hobby='" + hobby + '\'' +
                ", did=" + did +
                '}';
    }
}

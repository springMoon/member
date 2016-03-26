package com.venn.member.bean;

import java.util.Date;

/**
 * Created by venn on 16-3-26.
 *
 * member bean
 */

public class Member {

    private String id;
    private String name;
    private String sex;
    private Date startDate;
    private Date endDate;
    private int num;

    public Member() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
    public  String getString(){
        String str = "id = " + this.getId();
        str += "name = " + this.getName();
        str += "sex = " + this.getSex();

        return str;
    }
}

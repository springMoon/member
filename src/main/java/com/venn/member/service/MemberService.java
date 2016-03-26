package com.venn.member.service;

import com.venn.member.bean.Member;
import com.venn.member.dao.Dao;

import java.util.Date;

/**
 * Created by venn on 16-3-26.
 */
public class MemberService {

    Dao dao = new Dao();

    public Member createMember(String id, String name, String sex, int num, Date startDate,Date endDate){
        Member member = new Member();
        member.setId(id);
        member.setName(name);
        member.setSex(sex);
        member.setStartDate(startDate);
        member.setEndDate(endDate);
        return member;
    }

    public boolean saveMember(){
        Member member = createMember("0001","venn","male",50,new Date(),new Date());
        return dao.save(member);
    }
}

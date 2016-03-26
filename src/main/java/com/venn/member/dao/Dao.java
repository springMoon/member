package com.venn.member.dao;

import com.venn.member.bean.Member;

/**
 * Created by venn on 16-3-26.
 */
public class Dao {
    public boolean save(Member member){
        System.out.println(member.getString());
        return  true;
    }
}

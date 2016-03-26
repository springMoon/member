package com.venn.member.service;

import junit.framework.TestCase;
import org.junit.Test;
import junit.framework.Assert;

/**
 * Created by venn on 16-3-26.
 */
public class MemberServiceDao extends TestCase{


    public void testSaveMember(){
        MemberService ms = new MemberService();
        Assert.assertEquals(true,ms.saveMember());;
    }
}

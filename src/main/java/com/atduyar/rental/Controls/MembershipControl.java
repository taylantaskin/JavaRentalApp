package com.atduyar.rental.Controls;

import com.atduyar.rental.Domain.Entity.Member;
import com.atduyar.rental.Domain.Entity.SuperRent;

public class MembershipControl {
    private SuperRent superRent;

    public MembershipControl(SuperRent superRent) {
        this.superRent = superRent;
    }

    public Member findMember(String memberId) {
        for (Member member: superRent.getMembers()){
            if (member.getId().equals(memberId)){
                return member;
            }
        }
        return null;
    }
}

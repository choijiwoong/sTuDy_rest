package jinu.jimo.hamburger;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Member {
    private String id;
    private String password;
    private String address;
    private String phone;
    private String email;

    public Member registerMember(MemberDTO memberDTO) {
        Member member = new Member();
        member.setId(memberDTO.getId());
        member.setPassword(memberDTO.getPassword());
        member.setAddress(memberDTO.getAddress());
        member.setPhone(memberDTO.getPhone());
        member.setEmail(memberDTO.getEmail());
    }
}
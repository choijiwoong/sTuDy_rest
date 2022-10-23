package jinu.jimo.hamburger;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
public class User {
    private String id;
    private String password;
    private String address;
    private String phone;
    private String email;

    public User(Member member) {
        this.id = member.getId();
        this.password = member.getPassword();
        this.address = member.getAddress();
        this.phone = member.getPhone();
        this.email = member.getEmail();
    }
}

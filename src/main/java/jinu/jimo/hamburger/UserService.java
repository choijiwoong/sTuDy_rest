package jinu.jimo.hamburger;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.regex.Pattern;

import static java.util.regex.Pattern.matches;

public class UserService {
    static User user = new User();
    public ResponseEntity<> register(MemberDTO memberDTO) {

        Member member = new Member();
        member.registerMember(memberDTO);
        String patternId = "^\\d";
        boolean chkId = Pattern.matches(patternId, member.getId());
        String patternPhone = "^\\d{2,3}-\\d{3,4}-\\d{4}$";
        boolean chkPhone = Pattern.matches(patternPhone, member.getPhone());
        String patternEmail = "^[a-zA-Z]+[\\w]+@[a-zA-Z]+(\\.[\\w]+){1,2}$";
        boolean chkEmail = Pattern.matches(patternEmail, member.getEmail());
        if(member.getId() == null) {
            return new ResponseEntity<>("this area cannot be empty", HttpStatus.BAD_REQUEST);
        }
        if(member.getPassword() == null){
            return new ResponseEntity<>("this area cannot be empty", HttpStatus.BAD_REQUEST);
        }
        if(member.getAddress() == null){
            return new ResponseEntity<>("this area cannot be empty", HttpStatus.BAD_REQUEST);
        }
        if(member.getPhone() == null){
            return new ResponseEntity<>("this area cannot be empty", HttpStatus.BAD_REQUEST);
        }
        if(member.getEmail() == null){
            return new ResponseEntity<>("this area cannot be empty", HttpStatus.BAD_REQUEST);
        }
        if(chkId == false){
            return new ResponseEntity<>("Id cannot be started with number", HttpStatus.BAD_REQUEST);
        }
        if(chkPhone = false){
            return new ResponseEntity<>("Phone number is not valid", HttpStatus.BAD_REQUEST);
        }
        if(chkEmail = false){
            return new ResponseEntity<>("Email is not valid", HttpStatus.BAD_REQUEST);
        }
        user.setId(member.getId());
        user.setPassword(member.getPassword());
        return new ResponseEntity<>(HttpStatus.OK);
    }

    public ResponseEntity<> login(LoginDTO loginDTO) {
        if(loginDTO.getId() == null){
            return new ResponseEntity<>("This Area cannot be empty", HttpStatus.BAD_REQUEST);
        }
        if(loginDTO.getPassword() == null){
            return new ResponseEntity<>("This Area cannot be empty", HttpStatus.BAD_REQUEST);
        }

        if(!(loginDTO.getId().equals(user.getId())) || !(loginDTO.getPassword().equals(user.getPassword()))){
            return new ResponseEntity<>("Check your ID or Password", HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
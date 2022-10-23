package jinu.jimo.hamburger;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController//모든 function에 @ResponseBody for JSON
@RequiredArgsConstructor
public class RegisterController {

    private UserService userService;

    @PostMapping(value = "/register")
    public ResponseEntity<String> register(@RequestBody MemberDTO memberDTO) {
        return userService.register(memberDTO);
    }
}
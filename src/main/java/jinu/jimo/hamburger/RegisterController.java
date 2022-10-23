package jinu.jimo.hamburger;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/register", method = {RequestMethod.GET, RequestMethod.POST})
public class RegisterController {

    private UserService userService;

    @PostMapping(value = "/register")
    public ResponseEntity<String> register(@RequestBody MemberDTO memberDTO) {
        return userService.register(memberDTO);
    }
}
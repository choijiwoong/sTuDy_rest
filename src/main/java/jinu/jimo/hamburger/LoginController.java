package jinu.jimo.hamburger;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

public class LoginController {

    @RestController
    @RequiredArgsConstructor
    public class RegisterController {

        private UserService userService;

        @PostMapping(value = "/login")
        public ResponseEntity<String> login(@RequestBody LoginDTO loginDTO) {
            return userService.login(loginDTO);
        }
    }
}
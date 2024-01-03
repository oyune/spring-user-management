package com.example.springusermanagement;

import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping("/users")
public class UserController {

    UserService userService;

    @PostMapping("/register")
    public ResponseEntity<UserEntity> register(
            @RequestBody RegisterDto registerDto
    ) {
        return ResponseEntity.ok(userService.regist(registerDto));
    }

}

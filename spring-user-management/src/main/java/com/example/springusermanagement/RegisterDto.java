package com.example.springusermanagement;

import lombok.Getter;

@Getter
public class RegisterDto {

    // 유저 아이디
    private Long id;

    // 유저 비밀번호
    private String password;

    // 유저 이름
    private String name;

}

package com.example.springusermanagement;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class UserEntity {

    // 유저 아이디
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // 유저 비밀번호
    @Column(unique = false)
    private String password;

    // 유저 이름
    @Column(unique = false)
    private String name;

    // 광고 수신 동의
    @Column(unique = false)
    private boolean agreement;

}

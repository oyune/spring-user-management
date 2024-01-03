package com.example.springusermanagement;

import org.springframework.stereotype.Service;

@Service
public class UserService {
    UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public UserEntity regist(RegisterDto registerDto) {
        // 아이디 중복되는지 확인
        if (userRepository.existsById(registerDto.getId())) {
            throw new IllegalArgumentException("이미 존재하는 아이디");
        }

        // 회원 가입 진행
        UserEntity user = new UserEntity();
        user.setId(registerDto.getId());
        user.setPassword(registerDto.getPassword());
        user.setName(registerDto.getName());

        return userRepository.save(user);
    }
}

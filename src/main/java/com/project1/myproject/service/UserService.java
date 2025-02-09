package com.project1.myproject.service;

import org.springframework.stereotype.Service;

import com.project1.myproject.domain.User;
import com.project1.myproject.repository.UserRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;

    public String handle() {
        return "Trường hóa 2 k12 ";
    }

    public User saveUser(User user) {
        return userRepository.save(user); // ket qua cua ham save se tra ve user da luu
    }

}

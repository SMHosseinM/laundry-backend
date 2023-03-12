package com.example.laundry.user.service;

import com.example.laundry.user.model.User;
import com.example.laundry.user.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;

    public User registerUser(User user) {
        System.out.println("to string is:" + user.toString());
        return userRepository.save(user);
    }


}

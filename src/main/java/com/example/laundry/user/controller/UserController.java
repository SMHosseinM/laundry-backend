package com.example.laundry.user.controller;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;


import com.example.laundry.user.model.User;
import com.example.laundry.user.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/user", produces = "application/json")
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;

    @PostMapping(consumes = APPLICATION_JSON_VALUE)
    public User registerUser(@RequestBody User user) {
        return userService.registerUser(user);
    }
}

package com.hierly.hierlybackend.controller;

import com.hierly.hierlybackend.dto.UserDto;
import com.hierly.hierlybackend.service.impl.UserServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("user")
@RequiredArgsConstructor
public class UserController {

    private final UserServiceImpl userService;

    @GetMapping("all")
    public ArrayList<UserDto> getAllUsers() {
        return null;
    }

    @PostMapping("save")
    public void saveUser(@RequestBody UserDto userDto) {
        userService.saveUser(userDto);
    }

    @PatchMapping("update")
    public void updateUser(UserDto userDto) {
    }

    @DeleteMapping("delete")
    public void deleteUser(UserDto userDto) {
    }

    @GetMapping("search")
    public ArrayList<UserDto> searchUser(UserDto userDto) {
        return null;
    }

}

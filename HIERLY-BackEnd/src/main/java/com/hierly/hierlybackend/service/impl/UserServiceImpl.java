package com.hierly.hierlybackend.service.impl;

import com.hierly.hierlybackend.dto.UserDto;
import com.hierly.hierlybackend.entity.User;
import com.hierly.hierlybackend.repositry.UserRepo;
import com.hierly.hierlybackend.service.UserService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    private final UserRepo userRepo;
    private final ModelMapper modelMapper;

    @Override
    public void saveUser(UserDto userDto) {
        userRepo.save(modelMapper.map(userDto, User.class));
    }
}

package com.example.echat33.service;

import com.example.echat33.DTO.User;
import org.springframework.stereotype.Service;

import java.util.List;


public interface userService {

    public List<User> findAll();
}

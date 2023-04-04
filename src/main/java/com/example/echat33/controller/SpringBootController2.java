package com.example.echat33.controller;

import com.example.echat33.DTO.User;
import com.example.echat33.mapper.userMapper;
import com.example.echat33.service.userService;
import com.example.echat33.serviceImpl.userServiceImpl;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class SpringBootController2 {


    @Resource
    private userServiceImpl userService;
    @RequestMapping(value = "/springBoot/test2")
    public @ResponseBody List<User> say() {
        List<User> users = userService.findAll();
        return users;
    }

}
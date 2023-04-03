package com.example.echat33.serviceImpl;

import com.example.echat33.DTO.User;
import com.example.echat33.Dao.userDao;
import com.example.echat33.mapper.userMapper;
import com.example.echat33.service.userService;
import jakarta.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class userServiceImpl implements userService {

    @Resource
    private userMapper serDao;



    @Override
    public List<User> findAll() {
        return serDao.queryUser();
    }
}

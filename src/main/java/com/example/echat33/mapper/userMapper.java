package com.example.echat33.mapper;

import com.example.echat33.DTO.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface userMapper {

    public List<User> queryUser();



}


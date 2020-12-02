package com.example.coolrabbit.service.impl;

import com.example.coolrabbit.dao.UserMapper;
import com.example.coolrabbit.entity.User;
import com.example.coolrabbit.exceptions.BaseError;
import com.example.coolrabbit.exceptions.BaseException;
import com.example.coolrabbit.response.CommonEnum;
import com.example.coolrabbit.service.UserService;
import com.example.coolrabbit.utils.MD5Util;
import com.example.coolrabbit.vo.LoginVo;
import com.example.coolrabbit.vo.RegisterVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserServiceImpl implements UserService {

    final UserMapper userMapper;

    public UserServiceImpl(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    @Override
    public void register(RegisterVo registerVo) {
        if(userMapper.selectByEmail(registerVo.getEmail())!=null){
            throw new BaseException(CommonEnum.ACCOUNT_EXIST);
        }
        User user=new User();
        user.setEmail(registerVo.getEmail());
        user.setName(registerVo.getName());
        user.setPassword(MD5Util.getMD5_32_lower(registerVo.getPassword()));
        userMapper.insert(user);
    }

    @Override
    public void login(LoginVo loginVo) {

    }
}

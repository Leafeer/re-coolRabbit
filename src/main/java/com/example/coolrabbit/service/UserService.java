package com.example.coolrabbit.service;

import com.example.coolrabbit.vo.LoginVo;
import com.example.coolrabbit.vo.RegisterVo;
import org.springframework.stereotype.Service;

@Service
public interface UserService {

    /**
     * 注册接口
     * @param registerVo
     */
    void register(RegisterVo registerVo);

    /**
     * 登录接口
     * @param loginVo
     */
    void login(LoginVo loginVo);

}

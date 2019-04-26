package com.demo.Service;

import com.demo.Entity.User;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

//Service层接口

public interface IUserService {
    //检验用户登录
    User checkLogin(String username,String password);
    void Register(User user);
}

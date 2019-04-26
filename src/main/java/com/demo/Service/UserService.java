package com.demo.Service;

import com.demo.Dao.UserDao;
import com.demo.Entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class



UserService implements IUserService {
    @Autowired
    private UserDao userDao;

    /**
     * 检验用户登录业务
     * @param username
     * @param password
     * @return
     */
    @Override
    public User checkLogin(String username, String password) {
        User user = userDao.findByUsername(username);
        if (user != null && user.getPassword().equals(password)){
            return user;
        }
        return null;
    }

    @Override
    public void Register(User user) {
        userDao.registerByUsernameAndPassword(user.getUsername(),user.getPassword());

    }
}

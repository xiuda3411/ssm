package com.demo.Dao;

import com.demo.Entity.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao {
    /***
     * 查找用户名和密码
     * @param username
     * @return
     */

    User findByUsername(String username);

    /***
     * 注册用户和密码
     * @param username
     * @param password
     */
    void registerByUsernameAndPassword(@Param("username")String username,@Param("password")String password,@Param("userEmail")String userEmail,@Param("userSex")String userSex);
}

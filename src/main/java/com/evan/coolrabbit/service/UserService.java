package com.evan.coolrabbit.service;

import com.evan.coolrabbit.dao.UserDAO;
import com.evan.coolrabbit.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    UserDAO userDAO;

    public boolean isExist(String username){
        User user = getByName(username);
        return null!= user;
    }

    private User getByName(String username) {
        return userDAO.findByUsUserName(username);
    }

    public User getNameAndPassword(String username, String password){
        return userDAO.getByUsUserNameAndUsPassword(username, password);
    }

    public void add(User user){
        userDAO.save(user);
    }
}

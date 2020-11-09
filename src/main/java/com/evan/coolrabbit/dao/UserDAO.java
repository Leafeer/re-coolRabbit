package com.evan.coolrabbit.dao;

import com.evan.coolrabbit.pojo.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDAO extends JpaRepository<User, Integer> {
    User findByUsUserName(String usUserName);
    User getByUsUserNameAndUsPassword(String usUserName, String usPassword);
}

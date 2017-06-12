package com.chris.demo.service;

import com.chris.demo.dao.UserDAO;
import com.chris.demo.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Chen on 2017/6/11.
 */
@Service
public class UserService {
    @Autowired
    UserDAO userDAO;

    public void add(User user) {
        userDAO.add(user);
    }

    public UserDAO getUserDAO() {
        return userDAO;
    }

    public void setUserDAO(UserDAO userDAO) {
        this.userDAO = userDAO;
    }
}

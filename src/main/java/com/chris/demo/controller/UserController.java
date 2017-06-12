package com.chris.demo.controller;

import com.chris.demo.entity.User;
import com.chris.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


/**
 * Created by Chen on 2017/6/11.
 */
@Controller
public class UserController {
    @Autowired
    private UserService userService;

    @ResponseBody
    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public User add(String username, String password) {
        User user = new User();
        user.setUsername(username);
        user.setPassword(password);
        userService.add(user);
        return user;
    }

}

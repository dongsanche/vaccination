package com.hospital.service;

import com.hospital.bean.userBean;

import javax.servlet.http.HttpSession;

public interface userService {
    String doRegister(String userName, String password, HttpSession session);

    String doLogin(String username, String password,  HttpSession session);

    void change(userBean user, HttpSession session);
}

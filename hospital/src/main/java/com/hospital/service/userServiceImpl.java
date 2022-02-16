package com.hospital.service;


import com.hospital.bean.userBean;
import com.hospital.dao.userDaoImpl;
import com.hospital.util.DButil;
import javax.servlet.http.HttpSession;
import java.sql.Connection;
import java.sql.SQLException;

public class userServiceImpl implements userService{
    private com.hospital.dao.userDaoImpl userDaoImpl = new userDaoImpl();
    public String doRegister(String username, String password,  HttpSession session) {
        String msg;
        DButil db=new DButil();
        Connection conn=db.getConnection();
        //判断用户名和邮箱是否已存在
        if (userDaoImpl.checkUsername(conn,username)) {
            msg = "该用户名已存在";
            return msg;
        }
        if (userDaoImpl.save(conn,new userBean(username,password)) > 0) {
            msg = "注册成功";
            return msg;
        }
        msg = "注册失败，请检查相关信息";
        return msg;
    }

    public String doLogin(String username, String password,  HttpSession session) {
        String msg;
        userBean user = new userBean(username, password);
        DButil db=new DButil();
        Connection conn=db.getConnection();
        if (userDaoImpl.checkUsernameAndPassword(conn,user)!=null) {
            //登录成功把用户放到session中
            session.setAttribute("currentUser", userDaoImpl.checkUsernameAndPassword(conn,user));
            msg = "登录成功";
            return msg;
        }
        if (userDaoImpl.checkUsername(conn,username)) {
            msg = "登录失败，密码错误";
            return msg;
        }
        try{
            conn.close();
        }catch (SQLException e) {
            e.printStackTrace();
        }
        msg = "登录失败，用户不存在";
        return msg;
    }

    public void change(userBean user,HttpSession session)
    {
        DButil db=new DButil();
        Connection conn=db.getConnection();
        userDaoImpl.delete(conn,user.getUsername());
        userDaoImpl.save(conn,user);
        try{
            conn.close();
        }catch (SQLException e) {
            e.printStackTrace();
        }
        return;
    }

}

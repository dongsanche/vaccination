package com.hospital.filter;
import java.io.IOException;
import javax.servlet.Filter;
//import javax.servlet.*;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class encodingFilter implements Filter{
    public void init(FilterConfig filterConfig) throws ServletException {
        // TODO Auto-generated method stub
//        System.out.println("CharacterEncodingFilter初始化");
    }


    //@Override
    public void doFilter(ServletRequest request, ServletResponse response,FilterChain chain) throws IOException, ServletException {
        // TODO Auto-generated method stub
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        chain.doFilter(request, response);
    }

    //@Override
    public void destroy() {
        // TODO Auto-generated method stub

    }
}

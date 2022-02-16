package com.hospital.service;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpSession;

public interface hospitalService {
    public void search(String name, HttpSession session);
}

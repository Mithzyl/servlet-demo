package com.itheima.web.response;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet("/resp1")
public class ResponseDemo1 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("resp1...");

        // 1. 设置响应状态码
//        response.setStatus(302);
//        response.setHeader("Location", "/tomcat_demo_Web_exploded/resp2");

        ///response.sendRedirect("/tomcat_demo_Web_exploded/resp2");
        response.sendRedirect("http://www.baidu.com");

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}

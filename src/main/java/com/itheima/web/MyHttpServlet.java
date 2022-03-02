package com.itheima.web;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

public class MyHttpServlet implements Servlet {

    @Override
    public void init(ServletConfig servletConfig) throws ServletException {

    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        // 根据请求方式不同分别进行处理

        // 1.获取请求方式 HttpServlet
        HttpServletRequest request = (HttpServletRequest) servletRequest;

        String method = request.getMethod();

        // 判断
        if("GET".equals(method)){
            // get methd

            doGet(request, servletResponse);
        }else if("POST".equals(method)){
            // post method

            doPost(request, servletResponse);
        }

    }

    // protected 可以被子类看到
    protected void doPost(HttpServletRequest request, ServletResponse servletResponse) {
    }

    protected void doGet(HttpServletRequest request, ServletResponse servletResponse) {
    }

    @Override
    public String getServletInfo() {
        return null;
    }

    @Override
    public void destroy() {

    }
}

package com.itheima.web.demo;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

@WebServlet(urlPatterns = "/demo2", loadOnStartup = 1)  // 设置访问路径
public class ServletDemo2 implements Servlet {

    // 初始化方法
    // servlet 第一次访问时调用, 只调用一次

    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
        System.out.println("Init...");
    }

    // 提供服务
    // 每一次servlet被访问时都会调用
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("servlet hello world");  // 提示servlet 访问成功
    }


    // 销毁servlet时调用
    // 1. 内存释放时或服务器关闭时销毁
    // 2. 只调用一次
    @Override
    public void destroy() {
        System.out.println("destroy");
    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }



    @Override
    public String getServletInfo() {
        return null;
    }



}

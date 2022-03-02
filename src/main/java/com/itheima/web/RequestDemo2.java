package com.itheima.web;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Map;

@WebServlet("/req2")
public class RequestDemo2 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //System.out.println("get...");

        // 获取所有参数map集合
        Map<String, String[]> map = req.getParameterMap();

        //获取键
        for (String key: map.keySet()){
            // username:zhagnsan
            System.out.print(key + ":");

            //获取对应的值
            String[] values = map.get(key);
            for (String value:values){
                System.out.print(value + " ");
            }

            System.out.println();
        }

        System.out.println("-----------");

        // 获取参数值
        String[] hobbies = req.getParameterValues("hobby");

        for(String hobby : hobbies){
            System.out.println(hobby);
        }

        // 根据key 获取单个参数值
        String username = req.getParameter("username");
        String password = req.getParameter("password");

        System.out.println(username);
        System.out.println(password);

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

//        System.out.println("post...");
//
//        // 获取所有参数map集合
//        Map<String, String[]> map = req.getParameterMap();
//
//        //获取键
//        for (String key: map.keySet()){
//            // username:zhagnsan
//            System.out.print(key + ":");
//
//            //获取对应的值
//            String[] values = map.get(key);
//            for (String value:values){
//                System.out.print(value + " ");
//            }
//
//            System.out.println();
//        }
//
//        System.out.println("-----------");
//
//        // 获取参数值
//        String[] hobbies = req.getParameterValues("hobby");
//
//        for(String hobby : hobbies){
//            System.out.println(hobby);
//        }
//
//        // 根据key 获取单个参数值
//        String username = req.getParameter("username");
//        String password = req.getParameter("password");
//
//        System.out.println(username);
//        System.out.println(password);

        this.doGet(req, resp);
    }
}

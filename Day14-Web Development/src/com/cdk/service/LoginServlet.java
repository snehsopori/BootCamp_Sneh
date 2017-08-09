package com.cdk.service;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

public class LoginServlet extends HttpServlet {
    Map<String, String> map = new HashMap<>();
    public void init() {
        map.put("Ram", "123");
        map.put("Sham", "123");
        map.put("Raj", "124");
        map.put("Suresh", "323");
        map.put("Ramesh", "423");
        map.put("Naresh", "133");
        map.put("Mahesh", "433");
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String userName = request.getParameter("username");
        String password = request.getParameter("password");
        PrintWriter pw = response.getWriter();
        HttpSession session = request.getSession();

        response.setContentType("text/html");
        if(!map.containsKey(userName)){
            pw.write("User not present! Please signup first.");
        }
        else if (password.equals(map.get(userName))){
            pw.write("Login successful.");
            session.setAttribute("Login_Status",true);
            RequestDispatcher requestDispatcher = request.getRequestDispatcher("/services.html");
            requestDispatcher.forward(request,response);
        }
        else {
            pw.write("The password you have entered is wrong. Try again");
        }

    }


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
package com.cdk;

import java.io.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.servlet.*;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RandomNumberGenerator extends HttpServlet {
    public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException{
        PrintWriter pw = response.getWriter();
        response.setContentType("text/html");
        pw.write("Random Number : " + (int) (Math.random() * 1000));
        DateFormat df = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Date date = new Date();
        pw.write("</br>Current date and time is : " + df.format(date));
    }
}

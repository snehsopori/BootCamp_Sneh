package com.cdk.filters;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebFilter(filterName = "LoggedFilter")
public class LoggedFilter implements Filter {
    public void destroy() {
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        HttpSession session = ((HttpServletRequest)req).getSession();
        if((Boolean) session.getAttribute("Login_Status") == false){
            resp.getWriter().write("<h1>Redirecting to login page</h1>");
            RequestDispatcher requestDispatcher = req.getRequestDispatcher("/index.html");
            requestDispatcher.forward(req,resp);
        }else {
            chain.doFilter(req, resp);
        }
    }

    public void init(FilterConfig config) throws ServletException {

    }

}

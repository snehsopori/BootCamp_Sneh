package com.cdk.filters;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

@WebFilter(filterName = "IPFilter")
public class IPFilter implements Filter {
    public void destroy() {
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        String ipaddress = req.getRemoteAddr();
        if(ipaddress.endsWith("6") || ipaddress.endsWith("5")){
            resp.getWriter().write("<h1 style='color:red'>Unauthorized Access</h1>");
        }else{
            chain.doFilter(req, resp);
        }
        chain.doFilter(req, resp);
    }

    public void init(FilterConfig config) throws ServletException {

    }

}

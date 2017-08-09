package com.cdk;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;

@WebServlet(name = "CricketMatchServlet")
public class CricketMatchServlet extends HttpServlet {
    List<Match> data = new ArrayList<>();

    public void init() throws ServletException {
        data.add(new Match("India", "England", "ODI", "Delhi", 320, 350));
        data.add(new Match("India", "England", "Test", "Lords", 230, 155));
        data.add(new Match("India", "England", "T20", "Melbourne", 240, 250));
        data.add(new Match("England", "India", "T20", "Mumbai", 150, 120));
        data.add(new Match("England", "India", "ODI", "Kolkata", 240, 150));
        data.add(new Match("India", "India", "Test", "Queensland", 550, 570));
        data.add(new Match("India", "India", "T20", "Delhi", 170, 150));
    }

    public void destroy() {
        data.clear();
        data = null;
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        String country1Name = request.getParameter("country1");
        String country2Name = request.getParameter("country2");
        String matchType = request.getParameter("matchType");
        Iterator<Match> itr = data.iterator();
        Match match = null;
        while (itr.hasNext()) {
            match = itr.next();
            if ((match.getCountry1().equalsIgnoreCase(country1Name) || match.getCountry1().equalsIgnoreCase(country2Name)) && (match.getCountry2().equalsIgnoreCase(country2Name) || match.getCountry2().equalsIgnoreCase(country1Name))) {
                if (match.getMatchType().equalsIgnoreCase(matchType)) {
                    PrintWriter pw = response.getWriter();
                    pw.write("The " + matchType + " between " + country1Name + " and " + country2Name + " at " + match.getCity() + " was won by " + match.getWinner() + " by " + Math.abs(match.getRunsScoredByCountry1() - match.getRunsScoredByCountry2()) + "</br>");
                }
            }
        }
    }
}

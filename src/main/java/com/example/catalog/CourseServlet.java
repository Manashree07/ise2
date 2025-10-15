package com.example.catalog;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class CourseServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        
        String page = req.getParameter("page");

        if (page == null) {
            req.getRequestDispatcher("index.jsp").forward(req, resp);
            return;
        }

        switch (page) {
            case "courses":
                req.getRequestDispatcher("courses.jsp").forward(req, resp);
                break;
            case "details":
                req.getRequestDispatcher("course-details.jsp").forward(req, resp);
                break;
            case "instructors":
                req.getRequestDispatcher("instructors.jsp").forward(req, resp);
                break;
            case "enroll":
                req.getRequestDispatcher("enroll.jsp").forward(req, resp);
                break;
            default:
                req.getRequestDispatcher("index.jsp").forward(req, resp);
                break;
        }
    }
}

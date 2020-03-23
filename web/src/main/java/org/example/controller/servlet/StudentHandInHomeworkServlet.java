package org.example.controller.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Author:txy
 * @Date:created in 8:50 2020/3/8
 */
@WebServlet("/handInHomework")
public class StudentHandInHomeworkServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("Stu_HandIn_HW.jsp").forward(req,resp);
    }
}

package com.example.assessment.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/adminLogin")
public class AdminLoginServlet extends HttpServlet {
    private String adminusername = "admin";
    private String adminpassword = "admin";

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        if (adminusername.equals(username) && adminpassword.equals(password)) {
            response.sendRedirect("viewFeedback");
        } else {
            response.getWriter().println("<html><body><h3>Invalid Credentials</h3><a href='adminLogin.jsp'>Try Again</a></body></html>");
        }
    }
}
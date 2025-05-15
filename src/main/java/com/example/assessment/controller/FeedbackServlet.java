package com.example.assessment.controller;

import com.example.assessment.model.Feedback;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


@WebServlet("/feedbackservlet")
public class FeedbackServlet extends HttpServlet {
    private static List<Feedback> feedbackList = new ArrayList<>();

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String course = request.getParameter("course");
        int rating = Integer.parseInt(request.getParameter("rating"));
        String comments = request.getParameter("comments");

        Feedback feedback = new Feedback(name, email, course, rating, comments);
        feedbackList.add(feedback);

        response.getWriter().println("<html><body><h3>Feedback Submitted Successfully!</h3><a href='feedback.jsp'>Submit Another</a><br><a href='AdminLoginPage.jsp'>View Feedbacks</a></body></html>");
    }

    public static List<Feedback> getFeedbackList() {
        return feedbackList;
    }
}

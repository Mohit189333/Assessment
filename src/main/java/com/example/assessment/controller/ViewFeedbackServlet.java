package com.example.assessment.controller;

import com.example.assessment.model.Feedback;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet("/viewFeedback")
public class ViewFeedbackServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Feedback> feedbackList = FeedbackServlet.getFeedbackList();

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
       for(Feedback feedback : feedbackList) {
              out.println("<html><body>");
              out.println("<h3>Feedback Details</h3>");
              out.println("<p>Name: " + feedback.getName() + "</p>");
              out.println("<p>Email: " + feedback.getEmail() + "</p>");
              out.println("<p>Course: " + feedback.getCourse() + "</p>");
              out.println("<p>Rating: " + feedback.getRating() + "</p>");
              out.println("<p>Comments: " + feedback.getComments() + "</p>");
              out.println("</body></html>");
       }

    }
}
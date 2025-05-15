package com.example.assessment.model;

public class Feedback {
    private String name;
    private String email;
    private String course;
    private int rating;
    private String comments;

    public Feedback(String name, String email, String course, int rating, String comments) {
        this.name=name;
        this.email=email;
        this.course=course;
        this.rating=rating;
        this.comments=comments;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }
}

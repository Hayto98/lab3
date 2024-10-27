/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sample.dto;

import java.util.Date;

/**
 *
 * @author User
 */
public class Learner {
    private String learnerId;
    private String name;
    private Date dateOfBirth;
    private double score;
    private String courseId;

    public Learner(String learnerId, String name, Date dateOfBirth, double score, String courseId) {
        this.learnerId = learnerId;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.score = score;
        this.courseId = courseId;
    }

    public Learner(String courseId) {
        this.courseId = courseId;
    }

    public Learner() {
    }

    public String getLearnerId() {
        return learnerId;
    }

    public void setLearnerId(String learnerId) {
        this.learnerId = learnerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    @Override
    public String toString() {
        return "Learner ID: " + learnerId + ", Name: " + name + ", Date of Birth: " + dateOfBirth + ", Score: " + score + ", Course ID: " + courseId;
    }
    
}

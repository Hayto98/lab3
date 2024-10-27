/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sample.dto;

import java.time.LocalDate;
import java.util.Date;

/**
 *
 * @author User
 */
public class Course {

    private String courseId;
    private String name;
    private String type;
    private String title;
    private LocalDate  beginDate;
    private LocalDate  endDate;
    private double tuitionFee;
    private String topicId;

    public Course(String courseId, String name, String type, String title, LocalDate beginDate, LocalDate endDate, double tuitionFee, String topicId) {
        this.courseId = courseId;
        this.name = name;
        this.type = type;
        this.title = title;
        this.beginDate = beginDate;
        this.endDate = endDate;
        this.tuitionFee = tuitionFee;
        this.topicId = topicId;
    }


    public Course() {
    }

    public Course(String courseId) {
        this.courseId = courseId;
    }

    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getBeginDate() {
        return beginDate;
    }

    public void setBeginDate(Date beginDate) {
        this.beginDate = beginDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public double getTuitionFee() {
        return tuitionFee;
    }

    public void setTuitionFee(double tuitionFee) {
        this.tuitionFee = tuitionFee;
    }

    public String getTopicId() {
        return topicId;
    }

    public void setTopicId(String topicId) {
        this.topicId = topicId;
    }

    @Override
    public String toString() {
        return "Course ID: " + courseId + ", Name: " + name + ", Type: " + type + ", Title: " + title + ", Begin Date: " + beginDate + ", End Date: " + endDate + ", Tuition Fee: $" + tuitionFee;
    }
    
}

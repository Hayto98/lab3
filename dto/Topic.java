/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sample.dto;

/**
 *
 * @author User
 */
public class Topic {
    private String topicId;
    private String name;
    private String type; 
    private String title;
    private int duration; 

    public Topic(String topicId, String name, String type, String title, int duration) {
        this.topicId = topicId;
        this.name = name;
        this.type = type;
        this.title = title;
        this.duration = duration;
    }

    public Topic() {
    }

    public Topic(String topicId) {
        this.topicId = topicId;
    }

    public String getTopicId() {
        return topicId;
    }

    public void setTopicId(String topicId) {
        this.topicId = topicId;
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

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    @Override
    public String toString() {
        return "Topic ID: " + topicId + ", Name: " + name + ", Type: " + type + ", Title: " + title + ", Duration: " + duration + " hours";
    }
    
}

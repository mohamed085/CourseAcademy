package com.model;

import java.time.LocalDate;
import java.util.List;

public class Course {

    private int id;
    private String desc;
    private LocalDate duration;
    private String cName;
    private Topic topic;
    private List<Instructor> instructors;

    public Course(int id, String desc, LocalDate duration, String cName, Topic topic) {
        this.id = id;
        this.desc = desc;
        this.duration = duration;
        this.cName = cName;
        this.topic = topic;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public LocalDate getDuration() {
        return duration;
    }

    public void setDuration(LocalDate duration) {
        this.duration = duration;
    }

    public String getcName() {
        return cName;
    }

    public void setcName(String cName) {
        this.cName = cName;
    }

    public Topic getTopic() {
        return topic;
    }

    public void setTopic(Topic topic) {
        this.topic = topic;
    }

    public List<Instructor> getInstructors() {
        return instructors;
    }

    public void setInstructors(List<Instructor> instructors) {
        this.instructors = instructors;
    }

}

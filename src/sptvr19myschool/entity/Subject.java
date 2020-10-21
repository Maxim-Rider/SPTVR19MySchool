/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sptvr19myschool.entity;

/**
 *
 * @author Comp
 */
public class Subject {
    private String name;
    private Integer duration;
    private Person teacher;

    public String getName() {
        return name;
    }

    public Integer getDuration() {
        return duration;
    }

    public Person getTeacher() {
        return teacher;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public void setTeacher(Person teacher) {
        this.teacher = teacher;
    }

    @Override
    public String toString() {
        return "Subject{"
                + "name=" + name 
                + ", duration=" + duration 
                + ", teacher=" + teacher 
                + '}';
    }
    
    
}


package sptvr19myschool.entity;

import java.io.Serializable;


public class Subject implements Serializable{
    private String name;
    private Integer duration;
    private Person teacher;

    public Subject() {
    }

    public Subject(String name, Integer duration, Person teacher) {
        this.name = name;
        this.duration = duration;
        this.teacher = teacher;
    }

    public Person getTeacher() {
        return teacher;
    }

    public void setTeacher(Person teacher) {
        this.teacher = teacher;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    @Override
    public String toString() {
        return "Subject{" 
                + "name=" + name 
                + ", duration=" + duration 
                + ", teacher=" + teacher.getFirstname()
                + " " + teacher.getLastname()
                + '}';
    }
    
    
}
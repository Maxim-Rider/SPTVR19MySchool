/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sptvr19myschool.entity;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Comp
 */
public class Journal {
    private Person student;
    private Subject subject;
    private Integer mark;
    private Date date;

    public Journal(Person student, Subject subject, Integer mark, Date date) {
        this.student = student;
        this.subject = subject;
        this.mark = mark;
        this.date = date;
    }

    public Person getStudent() {
        return student;
    }

    public Subject getSubject() {
        return subject;
    }

    public Integer getMark() {
        return mark;
    }

    public Date getDate() {
        return date;
    }

    public void setStudent(Person student) {
        this.student = student;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public void setMark(Integer mark) {
        this.mark = mark;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy HH:mm");
        String dateStr = sdf.format(date);
        return "Journal{"
                + "student=" + student.getFirstname()
                + " " + student.getLastname()
                + ", subject=" + subject .getName()
                + ", mark=" + mark 
                + ", date=" + date 
                + '}';
    }
    
    
}
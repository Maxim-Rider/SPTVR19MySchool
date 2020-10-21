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
public class Person {
    String firstname;
    String lastname;
    String phone;
    String role;
    
    public Person() {       
    }
    
    public Person(String firstname, String lastname, String phone, String role) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.phone = phone;
        this.role = role;
    }    

    public Person(String ivan) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public String getfirstName() {
        return firstname;
    }

    public void setfirstName(String firstname) {
        this.firstname = firstname;
    }

    public String getlastname() {
        return lastname;
    }

    public void setlastname(String lastname) {
        this.lastname = lastname;
    }
    
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
    
    public String getRole() {
        return role;       
    }
    
    public void setRole(String role) {
        this.role = role;
    }
    
    @Override
    public String toString() {
        return "Person{" 
                + "firstname=" + firstname 
                + ", lastname=" + lastname 
                + ", phone=" + phone 
                + ", role" + 
                + '}';
    }
    
}

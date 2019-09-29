/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;

/**
 *
 * @author N
 */
public class Person implements Serializable{
    private Long id;
    private String FirstName;
    private String LastName;
    private String Role;

    public Person() {
    }

    public Person(Long id, String FirstName, String LastName, String Role) {
        this.id = id;
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.Role = Role;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String FirstName) {
        this.FirstName = FirstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String LastName) {
        this.LastName = LastName;
    }

    public String getRole() {
        return Role;
    }

    public void setRole(String Role) {
        this.Role = Role;
    }

    @Override
    public String toString() {
        return "Person{" 
                + "id=" + id 
                + ", FirstName=" + FirstName 
                + ", LastName=" + LastName 
                + ", Role=" + Role 
                + '}';
    }

    
    
}

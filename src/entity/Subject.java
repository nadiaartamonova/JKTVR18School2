/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

/**
 *
 * @author Nadia
 */
@Entity
public class Subject implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Basic()
    private String SubjectName;
    @OneToOne
    private Person person; //Балда! надо было имя переменной учитель написать.
    private String Description;

    public Subject() {
    }

    public Subject(Long id, String SubjectName, Person person, String Description) {
        this.id = id;
        this.SubjectName = SubjectName;
        this.person = person;
        this.Description = Description;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSubjectName() {
        return SubjectName;
    }

    public void setSubjectName(String SubjectName) {
        this.SubjectName = SubjectName;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String Description) {
        this.Description = Description;
    }

    @Override
    public String toString() {
        return "Subject{" + "id=" + id + ", SubjectName=" + SubjectName + ", person=" + person + ", Description=" + Description + '}';
    }

        
}

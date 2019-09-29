
package entity;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Journal implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    //@OneToOne
    private Person personPupil;
   // @OneToOne
    //private Person personTeacher;
    //@OneToOne
    private Subject SubjectName;
    private int Grade;

    public Journal()  {
    }

    public Journal(Long id, Person personPupil, Subject SubjectName, int Grade) {
        this.id = id;
        this.personPupil = personPupil;
        //this.personTeacher = personTeacher;
        this.SubjectName = SubjectName;
        this.Grade = Grade;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Person getPersonPupil() {
        return personPupil;
    }

    public void setPersonPupil(Person personPupil) {
        this.personPupil = personPupil;
    }

    

    

    public Subject getSubjectName() {
        return SubjectName;
    }

    public void setSubjectName(Subject SubjectName) {
        this.SubjectName = SubjectName;
    }

    public int getGrade() {
        return Grade;
    }

    public void setGrade(int Grade) {
        this.Grade = Grade;
    }

    @Override
    public String toString() {
        return "Journal{" + "id=" + id + ", personPupil=" + personPupil + ", SubjectName=" + SubjectName + ", Grade=" + Grade + '}';
    }
    
}

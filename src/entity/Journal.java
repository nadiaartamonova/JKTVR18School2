
package entity;

import java.io.Serializable;

public class Journal implements Serializable{
    private Long id;
    private Person personPupil;
    private Person personTeacher;
    private Subject SubjectName;
    private int Grade;

    public Journal()  {
    }

    public Journal(Long id, Person personPupil, Person personTeacher, Subject SubjectName, int Grade) {
        this.id = id;
        this.personPupil = personPupil;
        this.personTeacher = personTeacher;
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

    public Person getPersonTeacher() {
        return personTeacher;
    }

    public void setPersonTeacher(Person personTeacher) {
        this.personTeacher = personTeacher;
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
        return "Journal{" + "id=" + id + ", personPupil=" + personPupil + ", personTeacher=" + personTeacher + ", SubjectName=" + SubjectName + ", Grade=" + Grade + '}';
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import entity.Journal;
import entity.Person;
import entity.Subject;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author N
 */
public class JournalProvider {
    Scanner scanner = new Scanner(System.in);
    
    public Journal createJournal(List<Person> listPersons, List<Subject> listSubjects){
        
        Journal journal = new Journal();
        
        //----------------- Select Subject------------------
        System.out.println("List of subjects:");
        for(int i=0;i<listSubjects.size(); i++){
            System.out.printf("%d. Subject: %s%n",i+1,listSubjects.get(i).getSubjectName());
        
        }
        System.out.print("Select the subject: ");
        int numSubject=scanner.nextInt();
        journal.setSubjectName(listSubjects.get(numSubject-1));
        
        //----------------- Select Student------------------
        
        System.out.println("List of students: ");
        for(int i=0;i<listPersons.size(); i++){
            if("Student".equals(listPersons.get(i).getRole())){ 
                    System.out.printf("%d. FirstName: %s ,LastName: %s%n"
                            ,i+1
                            ,listPersons.get(i).getFirstName()
                            ,listPersons.get(i).getLastName());
                    }
            
        }
        
        System.out.print("Select the student: ");
        int numPupil=scanner.nextInt();
                
        journal.setPersonPupil(listPersons.get(numPupil-1));
        
        //---------------Input grade---------------
        System.out.print("Grade is : ");
        journal.setGrade(scanner.nextInt());
        
        
        
        
        System.out.print("For saving press y.");
        String flag = scanner.next();
        if("y".equals(flag)){
            return journal;
        }
        return null;
    }
    public void changeGrade(List<Journal> journals){
        
        System.out.println("List of grades: ");
        boolean flag=false;
        
        for(int i=0;i<journals.size(); i++){
           // if(journals.get(i).getGrade()!=null){
               System.out.printf("%d. Student: %s ,Grade: %s %s%n"
                       ,i+1
                       ,journals.get(i).getPersonPupil().getFirstName()
                       ,journals.get(i).getPersonPupil().getLastName()
                       ,journals.get(i).getGrade()
                       );
           // }
            flag=true;
        }
        
        
        if(flag){
            System.out.print("Select the number in journal: ");
            int numJournal=scanner.nextInt();
            
            System.out.print("Insert the new grade: ");
            //int Grade=scanner.nextInt();
            journals.get(numJournal-1).setGrade(scanner.nextInt());
            
            
            System.out.println("Grade was changed");
        }else{
            System.out.println("No grades");
        }
        
    
    }
    
}

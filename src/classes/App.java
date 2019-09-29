/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import Interfaces.Saver;
import entity.Journal;
import entity.Person;
import entity.Subject;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author N
 */
public class App { 
    
//------------LIST-----------------    
        List<Person> listPersons=new ArrayList<>();
        List<Subject> listSubjects=new ArrayList<>();
        List<Journal> listJournals=new ArrayList<>();
        SaverToFile saverToFile =new SaverToFile();

//--------------Saver--------------
        
    private Saver saver;
    
    public App() {
        listPersons.addAll(saverToFile.loadListPersons());
        listSubjects.addAll(saverToFile.loadListSubjects());
        listJournals.addAll(saverToFile.loadListJournals());
                
    }
    
    
    public void run() {
        JournalProvider journalProvider = new JournalProvider();
        boolean badOperation=false;
        String operation="0";
        
        Scanner scanner = new Scanner(System.in);
        
        
        
        do{
            do{
                System.out.println("Please select the operation:");
                System.out.println("1. Personal data");
                System.out.println("2. Subject data");
                System.out.println("3. Grade of subject");
                System.out.println("4. Change the grade");
                System.out.println("5. Persons list");
                System.out.println("6. Subjects list");
                System.out.println("7. Grades list");
                
                System.out.println("0. Exit");
                badOperation=false;
                
                 operation=scanner.next();
                 
                 switch (operation) {
                     
                     case "0":
                                             
                        badOperation=false; 
                        break;

                    default:
                        System.out.println("Ошибка ввода! \"q\"");
                        badOperation=true;
                     
                     case"1":
                         System.out.println("-----------Person info--------------");
                         PersonProvider personProvider = new PersonProvider();
                         Person person = personProvider.createPerson();
                         
                         if(person==null){
                             System.out.println("Fail, person was not add");                         
                         }else{
                             listPersons.add(person);
                             saverToFile.savePersons(listPersons);
                             System.out.println("Person was added.");
                         }
                       
                     break;
                     case"2":
                         System.out.println("-----------Subject info--------------");
                         SubjectProvider subjectProvider = new SubjectProvider();
                         Subject subject = subjectProvider.createSubject(listPersons);
                         
                         if(subject==null){
                             System.out.println("Fail, subject was not add");                         
                         }else{
                             listSubjects.add(subject);
                             saverToFile.saveSubjects(listSubjects);
                             System.out.println("Subject was added.");
                         }
                         
                     break;
                     
                     case "3":
                        System.out.println("---------Grade---------");
                        
                        
                        Journal journal = journalProvider.createJournal(listPersons,listSubjects);
                        
                        if(journal==null){
                             System.out.println("Fail. Cannot add the grade");                         
                         }else{
                             listJournals.add(journal);
                             saverToFile.saveJournals(listJournals);
                             System.out.println("Grade was added");
                         }
                        
                        
                        break;
                        
                        case "4":
                        System.out.println("---------Grade change---------");
                       
                        
                        journalProvider.changeGrade(listJournals);
                        saverToFile.saveJournals(listJournals);
                        
                        
                        break;
                        
                        case "5":
                        System.out.println("---------List of Students and Teachers---------");
                       
                        for (Person p : listPersons){
                             System.out.printf("%d Name: %s %s.  Role: %s%n"
                                        ,p.getId()
                                        ,p.getFirstName()
                                        ,p.getLastName()
                                        ,p.getRole()
                                        );
                        }
                        
                        break;
                        
                        case "6":
                        System.out.println("---------List of Subjects---------");
                       
                        for (Subject s : listSubjects){
                             System.out.printf("%d Subject: %s. Teacher: %s %s%n"
                                        ,s.getId()
                                        ,s.getSubjectName()
                                        ,s.getPerson().getFirstName()
                                        ,s.getPerson().getLastName()
                                        );
                        }
                        
                        break;
                        
                        case "7":
                        System.out.println("---------List of Grades---------");
                       
                        boolean flagOn=false;
                        
                        for(Journal j: listJournals){
                            
                                System.out.printf("%d Student: %s %s. Subject: %s. Grade: %s%n"
                                        ,j.getId()
                                        ,j.getPersonPupil().getFirstName()
                                        ,j.getPersonPupil().getLastName()
                                        ,j.getSubjectName().getSubjectName()
                                        ,j.getGrade()
                                        );
                                flagOn=true;
                            
                        }
                        if(!flagOn){
                            System.out.println("No grades");
                        }
                        break;
                }
            
            
            }while(badOperation);
            if(operation.equals("0"))break;
           
        
        }while(true);
    
    }
}
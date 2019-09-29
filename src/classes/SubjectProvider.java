/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;


import entity.Person;
import entity.Subject;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Nadia Artamonova
 */
public class SubjectProvider {
    public Subject createSubject(List<Person> listPersons){
        Scanner scanner = new Scanner(System.in);
        Subject subject = new Subject();

        
        
        subject.setId(null);
        
        System.out.print("Subject name: ");
        subject.setSubjectName(scanner.nextLine());
        
        System.out.print("Discription: ");
        subject.setDescription(scanner.nextLine());
        
        System.out.println("List of Teachers:");
        for(int i=0;i<listPersons.size(); i++){
            if("Teacher".equals(listPersons.get(i).getRole())){ 
                    System.out.printf("%d. FirstName: %s ,LastName: %s%n"
                            ,i+1
                            ,listPersons.get(i).getFirstName()
                            ,listPersons.get(i).getLastName());
                    }
            
        }
        System.out.print("Select the number of teacher: ");
        int numTeacher=scanner.nextInt();
        
        subject.setPerson(listPersons.get(numTeacher-1));
        
        System.out.print("For saving press y.");
        String flag = scanner.next();
        if("y".equals(flag)){
            return subject;
        }
        return null;

     }
    
}

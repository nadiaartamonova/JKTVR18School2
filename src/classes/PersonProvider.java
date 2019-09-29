/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import entity.Person;
import java.util.Scanner;

/**
 *
 * @author N
 */
public class PersonProvider {
     public Person createPerson(){
        Scanner scanner = new Scanner(System.in);
        Person person = new Person();
        person.setId(null);
        
        System.out.print("FirstName: ");
        person.setFirstName(scanner.nextLine());
        
        System.out.print("LastName: ");
        person.setLastName(scanner.nextLine());
        
        System.out.print("Role Student/Teacher: ");
        person.setRole(scanner.nextLine());
        
               
        System.out.print("For saving person press y. ");
        String flag = scanner.next();
        if("y".equals(flag)){
            return person;
        }
        return null;
     }
}

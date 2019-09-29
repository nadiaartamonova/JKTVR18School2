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
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author N
 */
public class SaverToFile implements Saver{
    private FileOutputStream fos = null;
    private ObjectOutputStream oos = null;
    
    FileInputStream fileInputStream=null;
    ObjectInputStream objectInputStream = null;
    
    @Override
    public void savePersons(List<Person> listPersons){
        try {
            fos = new FileOutputStream("Person.txt");
            oos = new ObjectOutputStream(fos);
            oos.writeObject(listPersons); // передали наш лист
            oos.flush(); // save to file
            
        } catch (FileNotFoundException ex) {
            System.out.println("File was not found. Error: " + ex);
        } catch (IOException ex) {
            System.out.println("Ошибка ввода/вывода. Error: " + ex);
        }finally {
            try {
                oos.close(); // освободили ресурс
                fos.close(); // toze osvobodili
            } catch (IOException ex) {
                System.out.println("Ресурсы закрыть не удалось. Error" + ex);
            }
        }
    }// save Persons
    
    @Override
    public void saveSubjects(List<Subject> listSubjects){
        try {
            fos = new FileOutputStream("Subject.txt");
            oos = new ObjectOutputStream(fos);
            oos.writeObject(listSubjects); // передали наш лист
            oos.flush(); // save to file
            
        } catch (FileNotFoundException ex) {
            System.out.println("File was not found. Error: " + ex);
        } catch (IOException ex) {
            System.out.println("Ошибка ввода/вывода. Error: " + ex);
        }finally {
            try {
                oos.close(); // освободили ресурс
                fos.close(); // toze osvobodili
            } catch (IOException ex) {
                System.out.println("Ресурсы закрыть не удалось. Error" + ex);
            }
        }
    }// save Subject
    
    @Override
    public void saveJournals(List<Journal> listJournals){
        try {
            fos = new FileOutputStream("Journal.txt");
            oos = new ObjectOutputStream(fos);
            oos.writeObject(listJournals); // передали наш лист
            oos.flush(); // save to file
            
        } catch (FileNotFoundException ex) {
            System.out.println("File was not found. Error: " + ex);
        } catch (IOException ex) {
            System.out.println("Ошибка ввода/вывода. Error: " + ex);
        }finally {
            try {
                oos.close(); // освободили ресурс
                fos.close(); // toze osvobodili
            } catch (IOException ex) {
                System.out.println("Ресурсы закрыть не удалось. Error" + ex);
            }
        }
    }// save Journal
    
    @Override
    public List<Person> loadListPersons(){

        List<Person> listPersons=new ArrayList<>();
        try {
            fileInputStream = new FileInputStream("Person.txt");
            objectInputStream=new ObjectInputStream(fileInputStream);
            listPersons = (List<Person>)objectInputStream.readObject();
        } catch (FileNotFoundException ex) {
            System.out.println("Фаил не найден. Error " + ex);
        } catch (IOException ex) {
            System.out.println("Фаил не может быть прочитан. Error " + ex);
        } catch (ClassNotFoundException ex) {
            System.out.println("Не найден класс. Error " + ex);
        } finally {
            try {
                if(fileInputStream!=null)
                {
                    fileInputStream.close(); // освободили ресурс
                }
                if(objectInputStream!=null)
                {
                    objectInputStream.close(); // освободили ресурс
                }
                
            } catch (IOException ex) {
                System.out.println("Ресурсы закрыть не удалось. Error" + ex);
            }
        }
        return listPersons;
    
    }// loadPersons
    
    @Override
    public List<Subject> loadListSubjects(){

        List<Subject> listSubjects=new ArrayList<>();
        try {
            fileInputStream = new FileInputStream("Subject.txt");
            objectInputStream=new ObjectInputStream(fileInputStream);
            listSubjects = (List<Subject>)objectInputStream.readObject();
        } catch (FileNotFoundException ex) {
            System.out.println("Фаил не найден. Error " + ex);
        } catch (IOException ex) {
            System.out.println("Фаил не может быть прочитан. Error " + ex);
        } catch (ClassNotFoundException ex) {
            System.out.println("Не найден класс. Error " + ex);
        } finally {
            try {
                if(fileInputStream!=null)
                {
                    fileInputStream.close(); // освободили ресурс
                }
                if(objectInputStream!=null)
                {
                    objectInputStream.close(); // освободили ресурс
                }
                
            } catch (IOException ex) {
                System.out.println("Ресурсы закрыть не удалось. Error" + ex);
            }
        }
        return listSubjects;
    
    }// loadSubjects
    
    
    @Override
    public List<Journal> loadListJournals(){

        List<Journal> listJournals=new ArrayList<>();
        try {
            fileInputStream = new FileInputStream("Journal.txt");
            objectInputStream=new ObjectInputStream(fileInputStream);
            listJournals = (List<Journal>)objectInputStream.readObject();
        } catch (FileNotFoundException ex) {
            System.out.println("Фаил не найден. Error " + ex);
        } catch (IOException ex) {
            System.out.println("Фаил не может быть прочитан. Error " + ex);
        } catch (ClassNotFoundException ex) {
            System.out.println("Не найден класс. Error " + ex);
        } finally {
            try {
                if(fileInputStream!=null)
                {
                    fileInputStream.close(); // освободили ресурс
                }
                if(objectInputStream!=null)
                {
                    objectInputStream.close(); // освободили ресурс
                }
                
            } catch (IOException ex) {
                System.out.println("Ресурсы закрыть не удалось. Error" + ex);
            }
        }
        return listJournals;
    
    }// loadSubjects
    
}

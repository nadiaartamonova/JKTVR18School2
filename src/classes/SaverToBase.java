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
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

/**
 *
 * @author N
 */
public class SaverToBase implements Saver{
    EntityManager em;
    EntityTransaction tx;

    public SaverToBase() {
        EntityManagerFactory emf= Persistence.createEntityManagerFactory("JKTVR18School2PU");
        this.em=emf.createEntityManager();
        this.tx = em.getTransaction();
    }
    
    @Override
    public void savePersons(List<Person> listPersons) {
        for(Person person: listPersons){
            tx.begin();
            em.persist(person);
            tx.commit();
        }
    }
    
    @Override
    public List<Person> loadListPersons() {
        return em.createQuery("SELECT p FROM Person p").getResultList();
    }
    
    @Override
    public void saveSubjects(List<Subject> listSubjects) {
        for(Subject subject: listSubjects){
            tx.begin();
            em.persist(subject);
            tx.commit();
        }
    }
    
    @Override
    public List<Subject> loadListSubjects() {
        return em.createQuery("SELECT s FROM Subject s").getResultList();
    }
    
    @Override
    public void saveJournals(List<Journal> listJournals) {
        for(Journal journal: listJournals){
            tx.begin();
            em.persist(journal);
            tx.commit();
        }
    }
    
    @Override
    public List<Journal> loadListJournals() {
        return em.createQuery("SELECT j FROM Journal j").getResultList();
    }
    
}


package Interfaces;

import entity.Journal;
import entity.Person;
import entity.Subject;
import java.util.List;

/**
 *
 * @author Nadia
 */
public interface Saver {
    public void savePersons(List<Person> listPersons);
    public void saveSubjects(List<Subject> listSubjects);
    public void saveJournals(List<Journal> listJournals);
    
    public List<Person> loadListPersons();
    public List<Subject> loadListSubjects();
    public List<Journal> loadListJournals();
}

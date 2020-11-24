
package ManyToMany;

import java.util.HashSet;
import java.util.Set;
import javax.transaction.Transaction;

public class TechDev
{
    Developer developer1 = new Developer();
        developer1.setName("Vishal");
    Developer developer2 = new Developer();
        developer2.setName("Yogesh");
    Developer developer3 = new Developer();
        developer3.setName("Virendra");

    Technology technology1 = new Technology();
        technology1.setLanguage("Java");
        technology1.setExpertise("Intermediate");
    Technology technology2 = new Technology();
        technology2.setLanguage("Bigdata");
        technology2.setExpertise("Expert");

    Set<Technology> technologies = new HashSet<Technology>();

    technologies.add(technology1);
    technologies.add(technology2);

    developer1.setTechnology(technologies);
    developer2.setTechnology(technologies);
    developer3.setTechnology(technologies);

    Transaction transaction = session.getTransaction();
        transaction.begin();

    session.save(developer1);
    session.save(developer2);
    session.save(developer3);
    transaction.commit();
}

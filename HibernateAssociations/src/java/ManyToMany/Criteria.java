
package ManyToMany;

import java.util.Set;

public class Criteria
{
    Criteria criteria = session.createCriteria(Developer.class);
        criteria.add(Restrictions.eq("id", 1L));

    Developer developer = (Developer) criteria.uniqueResult();
        System.out.println(developer.toString());

    Set<Technology> tech = developer.getTechnology();

    for(Technology technology : tech)
    {
        System.out.println(technology.toString());
    }

    Criteria criteria = session.createCriteria(Technology.class);
        criteria.add(Restrictions.eq("id", 1L));

    Technology technology= (Technology) criteria.uniqueResult();
        System.out.println(technology);

    Set<Developer> devs = technology.getDeveloper();
    
    for(Developer developer : devs)
    {
        System.out.println(developer.toString());
    }
}

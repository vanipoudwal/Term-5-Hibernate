
package Grant_University;

import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

public class CourseHelper
{
    Session session = null;
    
    public CourseHelper()
    {
        this.session = HibernateUtil.getSessionFactory().getCurrentSession();
    }
    
    public List getCourseByName(String CourseName)
    {
        List<CourseDetails> courselist = null;
        try
        {
            org.hibernate.Transaction tx = session.beginTransaction();
            Criteria criteria = session.createCriteria(CourseDetails.class).add(Restrictions.eq("CourseName", CourseName));
            courselist = (List<CourseDetails>) criteria.list();
            tx.commit();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return courselist;
    }
}

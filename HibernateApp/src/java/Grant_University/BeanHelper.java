
package Grant_University;

import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;

public class BeanHelper
{
    Session session = null;
    
    public BeanHelper()
    {
        this.session = HibernateUtil.getSessionFactory().getCurrentSession();
    }
    public List getStudent()
    {
        List<Student> students = null;
        try
        {
            org.hibernate.Transaction tx = session.beginTransaction();
            Query q = session.createQuery("from university.student");
            students = (List<Student>) q.list();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return students;
    }
}

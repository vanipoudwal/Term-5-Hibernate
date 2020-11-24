
package Grant_University;

import java.io.Serializable;
import java.util.Iterator;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.Query;

public class RegistrationHelper
{
    Session session = null;
    boolean b = true;
    
    public RegistrationHelper()
    {
        this.session = HibernateUtil.getSessionFactory().getCurrentSession();
    }
    
    public String insertStudent(Student std, StudentCourse sc)
    {
        org.hibernate.Transaction tx = session.beginTransaction();
        String uid = (String) std.getUserID();
        System.out.println(uid);
        
        Query query = session.createQuery("FROM UNIVERSITY.STUDDNT");
        List<Student> student = query.list();
        
        for(Iterator it = student.iterator(); it.hasNext();)
        {
            Student st = (Student)it.next();    
            if(st.getUserID().equals(uid))
                b = false;
        }
        if(b == false)
        {
            return "error";
        }
        else
        {
            try
            {
                int rgstnum = 0;
                Query q = session.createQuery("select max(RegistrationNumber) from Student");
                List currentRegNo = q.list();
                rgstnum = (Integer) currentRegNo.get(0)+1;
                std.setRegistrationNumber(rgstnum);
                sc.setRegistrationNumber(rgstnum);
                        
                Serializable objID = session.save(std);
                session.saveOrUpdate(sc);
                tx.commit();
            }
            catch(Exception e)
            {
                if(tx != null)
                {
                    tx.rollback();
                }
                System.out.println(e.getMessage());
            }
            return "true";
        }
    }
}

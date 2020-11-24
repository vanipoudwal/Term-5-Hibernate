
package Config;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil
{
    public static SessionFactory getSessionFactory()
    {
	Configuration config = new Configuration();
	config.configure();
	SessionFactory sessionfactory = config.buildSessionFactory();
	return sessionfactory;
    }
}

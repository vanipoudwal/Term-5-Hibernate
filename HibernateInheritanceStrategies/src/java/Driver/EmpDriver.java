
package Driver;

import Config.HibernateUtil;
import Employee.ContractualEmployee;
import Employee.EmployeeType;
import Employee.PermanentEmployee;
import org.hibernate.SessionFactory;

public class EmpDriver
{
    SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
    
    EmployeeType et = new EmployeeType();
        et.setId(100);
        et.setName("Sachin Sharma");
        session.save(et);
    
    PermanentEmployee pe = new PermanentEmployee();
        pe.setSalary(50000);
        session.save(pe);
    
    ContractualEmployee ce = new ContractualEmployee();
        ce.setContractPeriod(3.5F);
        ce.setHourlyRate(10000.30);
        session.save(ce);
}

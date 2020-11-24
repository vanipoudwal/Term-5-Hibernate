
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;
import Grant_University.BeanHelper;
import Grant_University.Student;

@ApplicationScoped
@Named("bean")

public class Bean
{
    private String ID;
    private String Password;
    private String FirstName;
    private String LastName;
    private String Gender;
    private String DOB;
    private String Address;
    private String ContactNo;
    private String EmailID;
    
    Student std = new Student();
    RegistrationForm rf = new RegistrationForm();
    
    public Bean() {}

    public String Action()
    {
        StringBuilder FirstName = new StringBuilder();
        StringBuilder LastName = new StringBuilder();
        StringBuilder Gender = new StringBuilder();
        StringBuilder DOB = new StringBuilder();
        StringBuilder Address = new StringBuilder();
        StringBuilder ContactNo = new StringBuilder();
        StringBuilder EmailID = new StringBuilder();
        
        BeanHelper bhp = new BeanHelper();
            String ID = getID();
            String Password = getPassword();
        
        boolean b = false;
        List<Student> students = new ArrayList<Student>();
        students = bhp.getStudent();
        
        for(Iterator it = students.iterator(); it.hasNext(); )
        {
            std = (Student)it.next();
            
            if((getID().toString().equals(ID)) && (getPassword().toString().equals(Password)))
            {
                b = true;
                FirstName.append(getFirstName().toString());
                LastName.append(getLastName().toString());
                Gender.append(getGender().toString());
                DOB.append(getDOB().toString());
                Address.append(getAddress().toString());
                ContactNo.append(getContactNo().toString());
                EmailID.append(getEmailID().toString());

                setValues(FirstName, LastName, Gender, DOB, Address, ContactNo, EmailID);
                break;
            }
            else
                b = false;
        }
        if (b == true)
        {
            return "Student";
        }
        else
        {
            return "error";
        }
    }
    
    public String getID()
    {
        return ID;
    }
    public void setID(String ID)
    {
        this.ID = ID;
    }

    public String getPassword()
    {
        return Password;
    }
    public void setPassword(String Password)
    {
        this.Password = Password;
    }

    public String getFirstName()
    {
        return FirstName;
    }
    public void setFirstName(String FirstName)
    {
        this.FirstName = FirstName;
    }

    public String getLastName()
    {
        return LastName;
    }
    public void setLastName(String LastName)
    {
        this.LastName = LastName;
    }

    public String getGender()
    {
        return Gender;
    }
    public void setGender(String Gender)
    {
        this.Gender = Gender;
    }

    public String getDOB()
    {
        return DOB;
    }
    public void setDOB(String DOB)
    {
        this.DOB = DOB;
    }

    public String getAddress()
    {
        return Address;
    }
    public void setAddress(String Address)
    {
        this.Address = Address;
    }

    public String getContactNo()
    {
        return ContactNo;
    }
    public void setContactNo(String ContactNo)
    {
        this.ContactNo = ContactNo;
    }

    public String getEmailID()
    {
        return EmailID;
    }
    public void setEmailID(String EmailID)
    {
        this.EmailID = EmailID;
    }

    void performLookup(StringBuilder FirstName, StringBuilder LastName, StringBuilder Gender, StringBuilder DOB, StringBuilder Address, StringBuilder ContactNo, StringBuilder EmailID)
        {
            rf.setFirstName(this.FirstName.toString());
            rf.setLastName(this.LastName.toString());
            rf.setGender(this.Gender.toString());
            rf.setDOB(this.DOB.toString());
            rf.setContactNo(this.ContactNo.toString());
            rf.setEmailID(this.EmailID.toString());   
        }
    
    private void setValues(StringBuilder FirstName, StringBuilder LastName, StringBuilder Gender, StringBuilder DOB, StringBuilder Address, StringBuilder ContactNo, StringBuilder EmailID)
    {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}

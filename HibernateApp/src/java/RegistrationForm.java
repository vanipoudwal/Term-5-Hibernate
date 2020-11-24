
import Grant_University.Student;
import Grant_University.RegistrationHelper;
import Grant_University.StudentCourse;
import javax.annotation.ManagedBean;
import javax.enterprise.context.RequestScoped;

@ManagedBean
@RequestScoped

public class RegistrationForm
{
    private String ID;
    private String FirstName;
    private String LastName;
    private String Gender;
    private String Address;
    private String ContactNo;
    private String EmailID;
    private String UserID;
    private String UserIdError;
    private String Course;
    private String DOB;
    private String Password;
    private String ConfirmPassword;
    
    public RegistrationForm() {}
	
        public String getID()
	{
            return ID;
	}
        public void setID(String ID)
	{
            this.ID = ID;
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
		
	public String getUserID()
	{
            return UserID;
	}
	public void setUserID(String UserID)
	{
            this.UserID = UserID;
	}
        
        public String getUserIdError()
	{
            return UserIdError;
	}
	public void setUserIdError(String UserIdError)
	{
            this.UserIdError = UserIdError;
	}
        
        public String getCourse()
	{
            return Course;
	}
	public void setCourse(String Course)
	{
            this.Course = Course;
	}
		
	public String getDOB()
	{
            return DOB;
	}
	public void setDOB(String DOB)
	{
            this.DOB = DOB;
	}
		
	public String getPassword()
	{
            return Password;
	}
	public void setPassword(String Password)
	{
            this.Password = Password;
	}
		
	public String getConfirmPassword()
	{
            return ConfirmPassword;
	}
	public void setConfirmPassword(String ConfirmPassword)
	{
            this.ConfirmPassword = ConfirmPassword;
	}
        
        public String submitAction()
        {
            RegistrationHelper rghp = new RegistrationHelper();
            Student std = new Student();
            setFirstName(getFirstName().toString());
            setLastName(getLastName().toString());
            setGender(getGender().toString());
            setDOB(getDOB().toString());
            setAddress(getAddress().toString());
            setContactNo(getContactNo().toString());
            setEmailID(getEmailID().toString());
            setUserID(getUserID().toString());
            setPassword(getPassword().toString());
            
            StudentCourse sc = new StudentCourse();
            sc.setCourseID(getCourse().toString());
            
            String msg = rghp.insertStudent(std, sc);
            if(msg.equals("error"))
            {
                setUserIdError("User ID already exists. Please select another User ID");
                setUserID("");
                return "Registration";
            }
            else
            {
                return "Success";
            }
        }
}

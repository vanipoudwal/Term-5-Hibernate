
package Grant_University;

public class StudentCourse implements java.io.Serializable
{
    private int RegistrationNumber;
    private String CourseID;
    
    public StudentCourse() {}
    
    public StudentCourse(int RegistrationRumber)
    {
        this.RegistrationNumber = RegistrationNumber;
    }
    
    public StudentCourse(int RegistrationNumber, String CourseID)
    {
        this.RegistrationNumber = RegistrationNumber;
        this.CourseID = CourseID;
    }
    
    public int getRegistrationNumber()
    {
        return this.RegistrationNumber;
    }
    public void setRegistrationNumber(int RegistrationNumber)
    {
        this.RegistrationNumber = RegistrationNumber;
    }
    
    public String getCourseID()
    {
        return this.CourseID;
    }
    public void setCourseID(String CourseID)
    {
        this.CourseID = CourseID;
    }
}

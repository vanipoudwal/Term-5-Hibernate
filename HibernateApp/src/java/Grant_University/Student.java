
package Grant_University;

public class Student implements java.io.Serializable
{
    private int RegistrationNumber;
    private Integer Version;
    
    public int getRegistrationNumber()
    {
        return RegistrationNumber;
    }
    public void setRegistrationNumber(int RegistrationNumber)
    {
        this.RegistrationNumber = RegistrationNumber;
    }
    
    public Integer getVersion()
    {
        return Version;
    }
    public void setVersion(Integer Version)
    {
        this.Version = Version;
    }

    Object getUserID() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}


package Grant_University;

public class CourseDetails implements java.io.Serializable
{
    private String CourseID;
    private String CourseName;
    private String CourseDuration;
    private String CourseEligibility;
    private String CourseFee;
    
    public CourseDetails() {}
    
    public CourseDetails(String CourseID)
    {
        this.CourseID = CourseID;
    }
    
    public CourseDetails(String CourseID, String CourseName, String CourseDuration, String CourseEligibility, String CourseFee)
    {
        this.CourseID = CourseID;
        this.CourseName = CourseName;
        this.CourseDuration = CourseDuration;
        this.CourseEligibility = CourseEligibility;
        this.CourseFee = CourseFee;
    }

    public String getCourseID()
    {
        return CourseID;
    }
    public void setCourseID(String CourseID)
    {
        this.CourseID = CourseID;
    }

    public String getCourseName()
    {
        return CourseName;
    }
    public void setCourseName(String CourseName)
    {
        this.CourseName = CourseName;
    }

    public String getCourseDuration()
    {
        return CourseDuration;
    }
    public void setCourseDuration(String CourseDuration)
    {
        this.CourseDuration = CourseDuration;
    }

    public String getCourseEligibility()
    {
        return CourseEligibility;
    }
    public void setCourseEligibility(String CourseEligibility)
    {
        this.CourseEligibility = CourseEligibility;
    }

    public String getCourseFee()
    {
        return CourseFee;
    }
    public void setCourseFee(String CourseFee)
    {
        this.CourseFee = CourseFee;
    }
}

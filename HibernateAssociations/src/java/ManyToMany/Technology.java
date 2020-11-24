
package ManyToMany;

import java.util.Set;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

public class Technology
{
    @Id
    @GeneratedValue
    @Column(name = "Id")
    private long Id;
    @Column(name = "Language")
    private String Language;
    @Column(name = "Expertise")
    private String Expertise;
    @ManyToMany(mappedBy = "Technology")
    private Set<Developer> Developer;

    // Getters & Setters
    public long getId()
    {
        return Id;
    }
    public void setId(long Id)
    {
        this.Id = Id;
    }

    public String getLanguage()
    {
        return Language;
    }
    public void setLanguage(String Language)
    {
        this.Language = Language;
    }

    public String getExpertise()
    {
        return Expertise;
    }
    public void setExpertise(String Expertise)
    {
        this.Expertise = Expertise;
    }

    public Set<Developer> getDeveloper()
    {
        return Developer;
    }
    public void setDeveloper(Set<Developer> Developer)
    {
        this.Developer = Developer;
    }
}
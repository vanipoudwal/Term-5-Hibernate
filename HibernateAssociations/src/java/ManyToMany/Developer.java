
package ManyToMany;

import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

public class Developer 
{
    @Id
    @GeneratedValue
    @Column(name = "Id")
    private long Id;
    @Column(name = "Name")
    private String Name;
    @ManyToMany(cascade = CascadeType.ALL)
    private Set<Technology> Technology;

    // Getters & Setters
    public long getId()
    {
        return Id;
    }
    public void setId(long Id)
    {
        this.Id = Id;
    }

    public String getName()
    {
        return Name;
    }
    public void setName(String Name)
    {
        this.Name = Name;
    }

    public Set<Technology> getTechnology()
    {
        return Technology;
    }
    public void setTechnology(Set<Technology> Technology)
    {
        this.Technology = Technology;
    }
}

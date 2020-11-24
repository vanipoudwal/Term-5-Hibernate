
package PersistingSet;

import java.util.Set;
import javax.persistence.CollectionTable;
import javax.persistence.ElementCollection;
import javax.persistence.FetchType;

public class User
{
    @ElementCollection(fetch = FetchType.LAZY)
    @CollectionTable(name = "Emails")
    private Set<String> Emails;
    
    // Getters & Setters
    public Set<String> getEmails()
    {
        return Emails;
    }
    public void setEmails(Set<String> Emails)
    {
        this.Emails = Emails;
    }
}

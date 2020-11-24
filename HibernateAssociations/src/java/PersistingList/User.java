
package PersistingList;

import java.util.List;
import javax.persistence.CollectionTable;
import javax.persistence.ElementCollection;
import javax.persistence.FetchType;

public class User
{
    @ElementCollection(fetch = FetchType.LAZY)
    @CollectionTable(name = "Emails")
    private List<String> Emails;
    
    // Getters & Setters
    public List<String> getEmails()
    {
        return Emails;
    }
    public void setEmails(List<String> Emails)
    {
        this.Emails = Emails;
    }
}

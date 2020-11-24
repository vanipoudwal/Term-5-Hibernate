
package PersistingMap;

import java.util.Map;
import javax.persistence.CollectionTable;
import javax.persistence.ElementCollection;
import javax.persistence.FetchType;

public class User
{
    @ElementCollection(fetch = FetchType.LAZY)
    @CollectionTable(name = "Emails")
    private Map<String> Emails;
    
    // Getters & Setters
    public Map<String> getEmails()
    {
        return Emails;
    }
    public void setEmails(Map<String> Emails)
    {
        this.Emails = Emails;
    }
}

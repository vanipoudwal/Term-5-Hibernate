
package ComponentMapping;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public class User
{
    @Id
    @Column(name = "UserId")
    @GeneratedValue
    private int Id;
    private Account Account;

    public int getId()
    {
        return Id;
    }
    public void setId(int Id)
    {
        this.Id = Id;
    }

    public Account getAccount()
    {
        return Account;
    }
    public void setAccount(Account Account)
    {
        this.Account = Account;
    }
}

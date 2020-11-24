
package OneToOne;

import javax.persistence.CascadeType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

public class User
{   
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "Cart_Id")

    private Cart Cart;
}

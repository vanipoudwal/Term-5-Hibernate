
package OneToOne;

import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

public class Cart
{
    @Id
    @GeneratedValue
    private int cartId;
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "Items")
    private Set<CartItems> Items;
}

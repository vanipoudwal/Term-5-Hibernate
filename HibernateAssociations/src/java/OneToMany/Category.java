
package OneToMany;

import java.util.Set;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

public class Category
{
    @Id
    @GeneratedValue
    private int Id;
    private String Name;
    private String Description;
    @OneToMany(mappedBy = "Category", fetch = FetchType.EAGER)
    private Set<Product> Products;
    
    // Getters & Setters
    public int getId()
    {
        return Id;
    }
    public void setId(int Id)
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

    public String getDescription()
    {
        return Description;
    }
    public void setDescription(String Description) 
    {
        this.Description = Description;
    }

    public Set<Product> getProducts()
    {
        return Products;
    }
    public void setProducts(Set<Product> Products)
    {
        this.Products = Products;
    }
}

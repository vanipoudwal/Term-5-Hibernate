
package OneToMany;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

public class Product
{
    @Id
    @GeneratedValue
    private int Id;
    private String Name;
    private String Description;
    private int Price;
    @ManyToOne
    @JoinColumn(name = "Category_Id")
    private Category Category;

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

    public int getPrice()
    {
        return Price;
    }
    public void setPrice(int Price)
    {
        this.Price = Price;
    }

    public Category getCategory()
    {
        return Category;
    }
    public void setCategory(Category Category)
    {
        this.Category = Category;
    }
}


package OneToMany;

import java.util.HashSet;
import java.util.Set;
import java.util.function.Supplier;

public class ProCatDriver
{
    Product product = new Product();
        product.setName("Mobile Phone");
        product.setDescription("Samsung Mobile Phone");
        product.setPrice(20000);
    
    Supplier supplier = new Supplier();
        supplier.setName("Advik Saini");
        supplier.setAddress("New Delhi");
        supplier.setEmail("advik@gmail.com");
        supplier.setPhone(7687897979L);

    Category category = new Category();
        category.setDescription("Electronic");
        category.setName("Electric");

    Set<Product> products = new HashSet<>();
        products.add(product);
        category.setProducts(products);
        product.setCategory(category);

        session.save(category);
        session.save(product);
}

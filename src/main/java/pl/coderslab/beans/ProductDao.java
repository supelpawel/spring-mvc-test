package pl.coderslab.beans;

import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
@Component
public class ProductDao {
    List<Product> products;

    public ProductDao() {
        this.products = Arrays.asList(
                new Product(1L, "Nazwa 1", 10),
                new Product(2L, "Nazwa 2", 20),
                new Product(3L, "Nazwa 3", 30),
                new Product(4L, "Nazwa 4", 40),
                new Product(5L, "Nazwa 5", 50),
                new Product(6L, "Nazwa 6", 60),
                new Product(7L, "Nazwa 7", 70),
                new Product(8L, "Nazwa 8", 80),
                new Product(9L, "Nazwa 9", 90),
                new Product(10L, "Nazwa 10", 100)
        );
    }

    public Optional<Product> getProduct(Long id) {
        return products.stream().filter(n -> n.getId() == id).findAny();
    }

    public List<Product> getProducts() {
        return products;
    }
}

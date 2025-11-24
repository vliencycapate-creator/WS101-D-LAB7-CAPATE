package com.example.capate.lab_7;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

@Service
@AllArgsConstructor
public class ProductService {
    private static final List<Product> products = new ArrayList<>();
    private static long productCount = 0;
    static {
        products.add(new Product(++productCount, "mouse", 150.00));
        products.add(new Product(++productCount, "keyboard", 500.50));
        products.add(new Product(++productCount, "battery", 250.99));
    }

    public List<Product> getProducts() { return products; }

    public Product getProductById(long id) {
        Predicate<? super Product> predicate = product -> product.getId() == id;
        return products.stream().filter(predicate).findFirst().orElseThrow(() -> new RuntimeException("Resources not found"));
    }

    public Product addProduct(String name, double price){
        return addProduct(++productCount, name, price);
    }

    public Product addProduct(long id, String name, double price) {
        Product product = new Product(id, name, price);
        products.add(product);
        return product;
    }

    public void deleteProductByid(long id) {
        Predicate<? super Product> predicate = product -> product.getId() == id;
        products.remove(products.stream().filter(predicate).findFirst().orElseThrow(() -> new RuntimeException("Resource not found")));
    }

    public void updateProductByid(long id, String name, double price) {
        Predicate<? super Product> predicate = product -> product.getId() == id;
        Product product = products.stream().filter(predicate).findFirst().map(product1 -> {
            product1.setName(name.isEmpty()? product1.getName() : name);
            product1.setPrice(price);
            return product1;
        }).orElseThrow(() -> new RuntimeException("Resource not found"));
        deleteProductByid(id);
        addProduct(product.getId(), product.getName(), product.getPrice());
    }
}
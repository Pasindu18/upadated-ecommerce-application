package com.ecommerce;

public class App {
    public static void main(String[] args) {
        ProductManager manager = new ProductManager();

        // Adding products to the database
        manager.addProduct(new Product(1, "Laptop", 1500.00, 10));
        manager.addProduct(new Product(2, "Smartphone", 800.00, 20));
        manager.addProduct(new Product(3, "Tablet", 300.00, 15));

        // Display all products from the database
        System.out.println("All Products:");
        manager.getAllProducts().forEach(System.out::println);

        // Removing a product by ID
        manager.removeProduct(1);

        // Display products after removal
        System.out.println("Products After Removal:");
        manager.getAllProducts().forEach(System.out::println);
    }


}
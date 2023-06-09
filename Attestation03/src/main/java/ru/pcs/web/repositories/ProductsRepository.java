package ru.pcs.web.repositories;

import ru.pcs.web.models.Product;

import java.util.List;

public interface ProductsRepository {
    List<Product> findAll();

    void save(Product product);
}

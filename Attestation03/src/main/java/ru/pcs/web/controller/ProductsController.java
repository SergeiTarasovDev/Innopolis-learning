package ru.pcs.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import ru.pcs.web.models.Product;
import ru.pcs.web.repositories.ProductsRepository;

@Controller
public class ProductsController {

    @Autowired
    ProductsRepository productsRepository;

    @PostMapping("/products")
    public String addProduct(@RequestParam("name") String name,
                          @RequestParam("description") String description,
                          @RequestParam("cost") Integer cost,
                            @RequestParam("count") Integer count) {

        Product product = Product.builder()
                .name(name)
                .description(description)
                .cost(cost)
                .count(count)
                .build();

        productsRepository.save(product);

        System.out.println(name + " " + description + " " + cost + " " + count);
        return "redirect:/products_add.html";
    }
}

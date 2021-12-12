package com.ferroblesh.store.product.repository;

import com.ferroblesh.store.product.entity.Category;
import com.ferroblesh.store.product.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> {

    List<Product> findByCategory(Category category);

}

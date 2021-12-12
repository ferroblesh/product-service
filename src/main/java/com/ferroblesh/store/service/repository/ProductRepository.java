package com.ferroblesh.store.service.repository;

import com.ferroblesh.store.service.entity.Category;
import com.ferroblesh.store.service.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> {

    public List<Product> findByCategory(Category category);
}

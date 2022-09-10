package com.revanth.ecommmanagement.repository;

import com.revanth.ecommmanagement.enity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}

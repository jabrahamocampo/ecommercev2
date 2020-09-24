package com.jaom.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jaom.entity.Products;

public interface ProductsRepository extends JpaRepository<Products, Long>{

}

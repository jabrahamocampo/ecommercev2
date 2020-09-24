package com.jaom.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.jaom.entity.ProductCategories;

public interface ProductCategoryRepository extends JpaRepository<ProductCategories, Long> {

}

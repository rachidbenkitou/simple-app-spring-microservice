package com.wecouldcode.category.dao;

import com.wecouldcode.category.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CategoryDAO extends JpaRepository<Category, Integer> {
    boolean existsByCategoryName(String name);
    Optional<Category> findByCategoryName(String categoryName);
}

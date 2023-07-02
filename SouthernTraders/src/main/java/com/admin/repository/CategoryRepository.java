package com.admin.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.admin.entity.Category;

// Annotation
@Repository

// Interface
public interface CategoryRepository
	extends JpaRepository<Category, Long> {
}

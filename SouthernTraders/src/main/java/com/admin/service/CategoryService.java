package com.admin.service;

import java.util.List;

import com.admin.Dto.CategoryDTO;
import com.admin.entity.Category;

public interface CategoryService {
	
	 // Save operation
	CategoryDTO saveCategory(CategoryDTO categoryDTO);
	List<Category> fetchCategoryIdList();
 
	/*
	 * // Read operation List<Category> fetchCategoryIdList();
	 * 
	 * // Update operation Category updateCategory(Category category, Long
	 * categoryId);
	 */

}

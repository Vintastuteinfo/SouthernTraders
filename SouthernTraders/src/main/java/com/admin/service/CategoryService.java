package com.admin.service;

import java.util.List;

import com.admin.Dto.CategoryDTO;
import com.admin.entity.Category;

public interface CategoryService {

	// Save operation
	CategoryDTO saveCategory(CategoryDTO categoryDTO);

	List<Category> fetchCategoryIdList();

	Category updateCategory(Category category);

	String deleteCategory(long categoryId);

}

package com.admin.controller;

import java.util.List;

// Importing required classes
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.admin.Dto.CategoryDTO;
import com.admin.entity.Category;
import com.admin.service.CategoryService;

// Annotation
@RestController

// Class
@RequestMapping("/Category")
public class CategoryController {

	// Annotation
	@Autowired
	private CategoryService categoryService;

	// Save operation
	@PostMapping("/save")
	public CategoryDTO saveCategory(@RequestBody CategoryDTO categoryDTO) {
		return categoryService.saveCategory(categoryDTO);
	}

	@PostMapping(path = "/all")
	public List<Category> fetchCategoryList() {
		return categoryService.fetchCategoryIdList();
	}

	@PostMapping(path = "/update/{id}")
	public Object updateCategory(@PathVariable("id") String requestId,
			@RequestBody Category category) {
		return categoryService.updateCategory(category);
	}

	@DeleteMapping(path = "/delete/{id}")
	public Object deleteCategory(@PathVariable("id") long categoryId) {

		return categoryService.deleteCategory(categoryId);
	}
}

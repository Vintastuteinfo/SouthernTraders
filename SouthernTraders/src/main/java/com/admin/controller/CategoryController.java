package com.admin.controller;


import java.util.List;

// Importing required classes
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
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
	public CategoryDTO saveCategory(@RequestBody CategoryDTO categoryDTO)
	{
		return categoryService.saveCategory(categoryDTO);
	}
	
	 @GetMapping("/departments")
	 public List<Category> fetchCategoryList() {
		  return categoryService.fetchCategoryIdList(); }

	/*
	 * // Read operation
	 * 
	 * @GetMapping("/departments") public List<Department> fetchDepartmentList() {
	 * return departmentService.fetchDepartmentList(); }
	 * 
	 * // Update operation
	 * 
	 * @PutMapping("/departments/{id}") public Department
	 * updateDepartment(@RequestBody Department department,
	 * 
	 * @PathVariable("id") Long departmentId) { return
	 * departmentService.updateDepartment( department, departmentId); }
	 * 
	 * // Delete operation
	 * 
	 * @DeleteMapping("/departments/{id}") public String
	 * deleteDepartmentById(@PathVariable("id") Long departmentId) {
	 * departmentService.deleteDepartmentById( departmentId); return
	 * "Deleted Successfully"; }
	 */
}

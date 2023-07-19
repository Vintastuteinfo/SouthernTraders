package com.admin.service.implemenation;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.admin.Dto.CategoryDTO;
import com.admin.entity.Category;
import com.admin.repository.CategoryRepository;
import com.admin.service.CategoryService;

@Service
public class CategoryServiceImpl implements CategoryService {

	@Autowired
	private CategoryRepository categoryRepository;

	// Save operation
	@Override
	public CategoryDTO saveCategory(CategoryDTO categoryDTO) {
		Category category = categoryRepository.save(convertcategoryEntity(categoryDTO));
		return convertcategoryDTO(category);
	}

	@Override
	public List<Category> fetchCategoryIdList() {
		return categoryRepository.findAll();

	}

	@Override
	public Category updateCategory(Category category) {

		return categoryRepository.save(category);
	}

	@Override
	public String deleteCategory(long categoryId) {
		categoryRepository.deleteById(categoryId);
		return "Success";
	}

	private CategoryDTO convertcategoryDTO(Category category) {
		ModelMapper modelMapper = new ModelMapper();
		CategoryDTO categorydto = modelMapper.map(category, CategoryDTO.class);
		return categorydto;

	}

	private Category convertcategoryEntity(CategoryDTO categoryDTO) {
		ModelMapper modelMapper = new ModelMapper();
		Category category = modelMapper.map(categoryDTO, Category.class);
		return category;

	}
}

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

	private ModelMapper modelMapper;

	// Save operation
	@Override
	public CategoryDTO saveCategory(CategoryDTO categoryDTO) {
		Category category = categoryRepository.save(convertcategoryEntity(categoryDTO));
		return convertcategoryDTO(category);
	}

	private CategoryDTO convertcategoryDTO(Category category) {

		CategoryDTO categorydto = modelMapper.map(category, CategoryDTO.class);
		return categorydto;

	}

	private Category convertcategoryEntity(CategoryDTO categoryDTO) {

		Category category = modelMapper.map(categoryDTO, Category.class);
		return category;

	}
	
	@Override 
	public List<Category> fetchCategoryIdList() { 
		return  categoryRepository.findAll(); 
		
	}
	/*
	 * // Read operation
	 * 
	 * @Override public List<Category> fetchCategoryIdList() { return
	 * (List<Category>) categoryRepository.findAll(); } public
	 * 
	 * // Update operation
	 * 
	 * @Override public Category updateCategory(Category department,Long
	 * departmentId) { Category depDB = categoryRepository.findById(departmentId)
	 * .get();
	 * 
	 * 
	 * if (Objects.nonNull(department.getDepartmentName()) && !"".equalsIgnoreCase(
	 * department.getDepartmentName())) { depDB.setDepartmentName(
	 * department.getDepartmentName()); }
	 * 
	 * if (Objects.nonNull( department.getDepartmentAddress()) &&
	 * !"".equalsIgnoreCase( department.getDepartmentAddress())) {
	 * depDB.setDepartmentAddress( department.getDepartmentAddress()); }
	 * 
	 * if (Objects.nonNull(department.getDepartmentCode()) && !"".equalsIgnoreCase(
	 * department.getDepartmentCode())) { depDB.setDepartmentCode(
	 * department.getDepartmentCode()); }
	 * 
	 * return categoryRepository.save(depDB); }
	 */
}

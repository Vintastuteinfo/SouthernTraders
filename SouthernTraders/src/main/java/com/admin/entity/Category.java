package com.admin.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

// Importing required classes
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

// Annotations
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder

// Class
public class Category {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "category_id", insertable = false, updatable = false, nullable = false)
	private Long categoryId;
	private String categoryName;
	private String description;
	private String isActive;
}

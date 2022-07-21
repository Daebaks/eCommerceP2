package com.revature.data;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.revature.model.Category;

@Repository
public interface Categoryrepository extends JpaRepository<Category, Integer> { //Create a category.class

	Category findByCategoryName(String categoryName);
}

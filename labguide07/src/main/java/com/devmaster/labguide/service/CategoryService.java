package com.devmaster.labguide.service;

import com.devmaster.labguide.entity.Category;
import com.devmaster.labguide.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {
    @Autowired
    private CategoryRepository categoryRepository;

    //lấy ra danh sách
    public List<Category> getAllCategories() {
        System.out.println(categoryRepository.findAll());
        return categoryRepository.findAll();
    }

    //lấy ra id
    public Optional<Category> getCategoryById(Long id) {
        return categoryRepository.findById(id);
    }

    //cap nhat du lieu bang category: create / update
    public Category saveCategory(Category category) {
        return categoryRepository.save(category);
    }

    //xoa theo id
    public void deleteCategory(Long id) {
        categoryRepository.deleteById(id);
    }
}

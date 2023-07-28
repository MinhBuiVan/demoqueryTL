package com.example.demoquerytl.service;

import com.example.demoquerytl.model.Category;
import com.example.demoquerytl.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {
    @Autowired
    private CategoryRepository categoryRepository;
    public List<Category> getCategoryWithMostComposition() {
        return categoryRepository.findCategoryWithMostComposition();
    }
}

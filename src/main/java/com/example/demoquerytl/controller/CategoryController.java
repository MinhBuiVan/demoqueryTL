package com.example.demoquerytl.controller;

import com.example.demoquerytl.model.Category;
import com.example.demoquerytl.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/music")
public class CategoryController {
    @Autowired
    private CategoryService categoryService;

    @GetMapping("/category/mostcomp")
    public List<Category> getCategoryWithMostCompositions() {
        return categoryService.getCategoryWithMostComposition();
    }
}

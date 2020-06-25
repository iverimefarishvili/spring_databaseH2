package com.example.demo.service;

import com.example.demo.dto.category.AddCategoryInput;
import com.example.demo.dto.category.AddCategoryOutput;
import com.example.demo.dto.category.GetCategoryInput;
import com.example.demo.dto.category.GetCategoryOutput;

public interface CategoryService {
    // კატეგორიების წამოღება
    GetCategoryOutput getCategory(GetCategoryInput getCategoryInput);

    // კატეგორიების დამატება
    AddCategoryOutput addCategory(AddCategoryInput addCategoryInput);
}

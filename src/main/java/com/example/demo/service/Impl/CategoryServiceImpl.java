package com.example.demo.service.Impl;

import com.example.demo.dto.category.*;
import com.example.demo.model.Category;
import com.example.demo.repository.CategoryRepository;
import com.example.demo.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    CategoryRepository categoryRepository;

    @Override
    public GetCategoryOutput getCategory(GetCategoryInput getCategoryInput) {
        List<CategoryDTO> categoryDTOS = new ArrayList<>();
        for(Category category : categoryRepository.findAll()) {
            CategoryDTO categoryDTO = new CategoryDTO();
            categoryDTO.setId(category.getId());
            categoryDTO.setTitle(category.getTitle());
            categoryDTOS.add(categoryDTO);
        }
        GetCategoryOutput categoryOutput = new GetCategoryOutput();
        categoryOutput.setCategories(categoryDTOS);
        return categoryOutput;
    }

    @Override
    public AddCategoryOutput addCategory(AddCategoryInput addCategoryInput) {
        Category category = new Category();
        category.setTitle(addCategoryInput.getTitle());
        categoryRepository.save(category);

        AddCategoryOutput addCategoryOutput = new AddCategoryOutput();
        addCategoryOutput.setMsg("კატეგორია წარმატებით დაემატა");
        return addCategoryOutput;
    }
}

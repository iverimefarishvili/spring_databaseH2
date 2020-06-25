package com.example.demo.dto.category;

import lombok.Data;

import java.util.List;

@Data
public class GetCategoryOutput {
    List<CategoryDTO> categories;

    public List<CategoryDTO> getCategories() {
        return categories;
    }

    public void setCategories(List<CategoryDTO> categories) {
        this.categories = categories;
    }
}

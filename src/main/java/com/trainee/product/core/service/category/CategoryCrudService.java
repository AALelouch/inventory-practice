package com.trainee.product.core.service.category;

import com.trainee.product.core.service.category.request.CategoryRequest;
import com.trainee.product.core.service.category.response.CategoryResponse;

import java.util.List;

public interface CategoryCrudService {
    void create(CategoryRequest categoryRequest);
    void update(CategoryRequest categoryRequest, Long id);
    List<CategoryResponse> getAll();
    void delete(Long id);
}

package com.trainee.product.core.mapper;

import com.trainee.product.core.entity.Category;
import com.trainee.product.core.service.category.request.CategoryRequest;
import com.trainee.product.core.service.category.response.CategoryResponse;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CategoryMapper {
    Category toCategory(CategoryRequest categoryRequest);
    CategoryResponse toResponse(Category category);
}

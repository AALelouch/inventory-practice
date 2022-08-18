package com.trainee.product.core.service.category;

import com.trainee.product.core.entity.Category;
import com.trainee.product.core.exception.NotFoundException;
import com.trainee.product.core.mapper.CategoryMapper;
import com.trainee.product.core.repository.CategoryRepository;
import com.trainee.product.core.service.category.request.CategoryRequest;
import com.trainee.product.core.service.category.response.CategoryResponse;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CategoryCrudServiceImpl implements CategoryCrudService{

    private CategoryRepository categoryRepository;

    private CategoryMapper categoryMapper;

    public CategoryCrudServiceImpl(CategoryRepository categoryRepository, CategoryMapper categoryMapper) {
        this.categoryRepository = categoryRepository;
        this.categoryMapper = categoryMapper;
    }

    @Override
    public void create(CategoryRequest categoryRequest) {
        categoryRepository.save(categoryMapper.toCategory(categoryRequest));
    }

    @Override
    public void update(CategoryRequest categoryRequest, Long id) {
        Category category = categoryMapper.toCategory(categoryRequest);
        category.setId(id);
        categoryRepository.save(category);
    }

    @Override
    public List<CategoryResponse> getAll() {
        return categoryRepository.findAll().stream().map(categoryMapper::toResponse)
                .collect(Collectors.toList());
    }

    @Override
    public void delete(Long id) {
        categoryRepository.delete(categoryRepository.findById(id).orElseThrow(
                () -> new NotFoundException("Category not found")
        ));
    }
}

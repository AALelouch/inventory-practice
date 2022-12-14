package com.trainee.product.infra.controller;

import com.trainee.product.core.service.category.CategoryCrudService;
import com.trainee.product.core.service.category.request.CategoryRequest;
import com.trainee.product.core.service.category.response.CategoryResponse;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("api/category")
@AllArgsConstructor
@CrossOrigin(origins = "*")
public class CategoryControllerImpl {

    private CategoryCrudService categoryCrudServiceImpl;


    @PostMapping()
    @ResponseStatus(HttpStatus.CREATED)
    public void createCategory(@RequestBody @Valid CategoryRequest categoryRequest){
        categoryCrudServiceImpl.create(categoryRequest);
    }

    @GetMapping()
    public ResponseEntity<List<CategoryResponse>> getAllCategories(){
        return ResponseEntity.ok(categoryCrudServiceImpl.getAll());
    }

    @PutMapping("/update/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void updateCategory(@PathVariable Long id, @RequestBody @Valid CategoryRequest categoryRequest){
        categoryCrudServiceImpl.update(categoryRequest, id);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteCategory(@PathVariable Long id){
        categoryCrudServiceImpl.delete(id);
    }


}

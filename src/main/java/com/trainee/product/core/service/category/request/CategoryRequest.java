package com.trainee.product.core.service.category.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;

@Data
@NoArgsConstructor
public class CategoryRequest {

    public CategoryRequest(String name) {
        this.name = name;
    }

    @NotBlank(message = "Name can't be empty or null")
    private String name;
}

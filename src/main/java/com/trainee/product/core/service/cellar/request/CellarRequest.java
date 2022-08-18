package com.trainee.product.core.service.cellar.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CellarRequest {

    @NotBlank(message = "this field can't be null or empty")
    private String name;
    @NotBlank(message = "this field can't be null or empty")
    private String address;
}

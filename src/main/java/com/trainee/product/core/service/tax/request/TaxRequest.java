package com.trainee.product.core.service.tax.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TaxRequest {

    @NotBlank(message = "The field name can't be null or empty")
    private String name;

    @NotNull(message = "The field value can't be null or empty")
    private Float value;
}

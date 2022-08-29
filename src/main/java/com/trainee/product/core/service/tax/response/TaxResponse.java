package com.trainee.product.core.service.tax.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Value;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TaxResponse {

    private Long id;
    private String name;
    private Float value;
}

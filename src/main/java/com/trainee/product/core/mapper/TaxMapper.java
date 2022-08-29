package com.trainee.product.core.mapper;

import com.trainee.product.core.entity.Tax;
import com.trainee.product.core.service.tax.request.TaxRequest;
import com.trainee.product.core.service.tax.response.TaxResponse;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface TaxMapper {
    Tax toEntity(TaxRequest taxRequest);
    TaxResponse toResponse(Tax tax);
}

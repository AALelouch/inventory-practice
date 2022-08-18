package com.trainee.product.core.mapper;

import com.trainee.product.core.entity.Cellar;
import com.trainee.product.core.service.cellar.request.CellarRequest;
import com.trainee.product.core.service.cellar.respoonse.CellarResponse;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CellarMapper {
    CellarResponse toResponse (Cellar cellar);
    Cellar toCellar(CellarRequest cellarRequest);
}

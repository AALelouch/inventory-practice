package com.trainee.product.core.service.cellar;

import com.trainee.product.core.service.cellar.request.CellarRequest;
import com.trainee.product.core.service.cellar.respoonse.CellarResponse;

import java.util.List;

public interface CellarCrudService {
    void create(CellarRequest cellarRequest);
    List<CellarResponse> getAll();
    void update(Long id, CellarRequest cellarRequest);
    void delete(Long id);
}

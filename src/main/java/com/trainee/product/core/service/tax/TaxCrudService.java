package com.trainee.product.core.service.tax;

import com.trainee.product.core.service.tax.request.TaxRequest;
import com.trainee.product.core.service.tax.response.TaxResponse;

import java.util.List;

public interface TaxCrudService {
    void create(TaxRequest taxRequest);
    void update(TaxRequest taxRequest, Long id);
    List<TaxResponse> getAll();
    TaxResponse getById(Long id);

    void delete(Long id);
}

package com.trainee.product.core.service.tax;

import com.trainee.product.core.entity.Tax;
import com.trainee.product.core.exception.NotFoundException;
import com.trainee.product.core.mapper.TaxMapper;
import com.trainee.product.core.repository.TaxRepository;
import com.trainee.product.core.service.tax.request.TaxRequest;
import com.trainee.product.core.service.tax.response.TaxResponse;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class TaxCrudServiceImpl implements TaxCrudService{
    private TaxRepository taxRepository;
    private TaxMapper taxMapper;

    public TaxCrudServiceImpl(TaxRepository taxRepository, TaxMapper taxMapper) {
        this.taxRepository = taxRepository;
        this.taxMapper = taxMapper;
    }

    @Override
    public void create(TaxRequest taxRequest) {
        taxRepository.save(taxMapper.toEntity(taxRequest));
    }

    @Override
    public void update(TaxRequest taxRequest, Long id) {
        Tax tax = taxMapper.toEntity(taxRequest);
        tax.setId(id);

        taxRepository.save(tax);
    }

    @Override
    public List<TaxResponse> getAll() {
        return taxRepository.findAll().stream().map(taxMapper::toResponse)
                .collect(Collectors.toList());
    }

    @Override
    public TaxResponse getById(Long id) {
        return taxRepository.findById(id).map(taxMapper::toResponse)
                .orElseThrow(() -> new NotFoundException("Tax doesn't fuound"));
    }

    @Override
    public void delete(Long id) {
        taxRepository.deleteById(id);
    }
}

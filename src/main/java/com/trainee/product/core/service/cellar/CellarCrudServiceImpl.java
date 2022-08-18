package com.trainee.product.core.service.cellar;

import com.trainee.product.core.entity.Cellar;
import com.trainee.product.core.mapper.CellarMapper;
import com.trainee.product.core.repository.CellarRepository;
import com.trainee.product.core.service.cellar.request.CellarRequest;
import com.trainee.product.core.service.cellar.respoonse.CellarResponse;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CellarCrudServiceImpl implements CellarCrudService {

    private CellarRepository cellarRepository;
    private CellarMapper cellarMapper;

    public CellarCrudServiceImpl(CellarRepository cellarRepository, CellarMapper cellarMapper) {
        this.cellarRepository = cellarRepository;
        this.cellarMapper = cellarMapper;
    }

    @Override
    public void create(CellarRequest cellarRequest) {
        cellarRepository.save(cellarMapper.toCellar(cellarRequest));
    }

    @Override
    public List<CellarResponse> getAll() {
        return cellarRepository.findAll().stream().map(cellarMapper::toResponse)
                .collect(Collectors.toList());
    }

    @Override
    public void update(Long id, CellarRequest cellarRequest) {
        Cellar cellar = cellarMapper.toCellar(cellarRequest);
        cellar.setId(id);
        cellarRepository.save(cellar);
    }

    @Override
    public void delete(Long id) {
        cellarRepository.deleteById(id);
    }
}

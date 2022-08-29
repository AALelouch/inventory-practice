package com.trainee.product.infra.controller;

import com.trainee.product.core.service.tax.TaxCrudService;
import com.trainee.product.core.service.tax.request.TaxRequest;
import com.trainee.product.core.service.tax.response.TaxResponse;
import org.apache.coyote.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("api/tax")
public class TaxControllerImpl {

    private TaxCrudService taxCrudServiceImpl;

    public TaxControllerImpl(TaxCrudService taxCrudServiceImpl) {
        this.taxCrudServiceImpl = taxCrudServiceImpl;
    }

    @GetMapping
    public ResponseEntity<List<TaxResponse>> getAll(){
     return ResponseEntity.ok(taxCrudServiceImpl.getAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<TaxResponse> getById(@PathVariable  Long id){
        return ResponseEntity.ok(taxCrudServiceImpl.getById(id));
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void create(@Valid @RequestBody TaxRequest taxRequest){
        taxCrudServiceImpl.create(taxRequest);
    }

    @PutMapping("update/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void update(@Valid @RequestBody TaxRequest taxRequest, @PathVariable Long id){
        taxCrudServiceImpl.update(taxRequest, id);
    }

    @DeleteMapping("delete/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id){
        taxCrudServiceImpl.delete(id);
    }
}

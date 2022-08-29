package com.trainee.product.infra.controller;

import com.trainee.product.core.service.cellar.CellarCrudService;
import com.trainee.product.core.service.cellar.request.CellarRequest;
import com.trainee.product.core.service.cellar.respoonse.CellarResponse;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/cellar")
@CrossOrigin(origins = "*")
public class CellarControllerImpl {
    private CellarCrudService cellarCrudService;

    public CellarControllerImpl(CellarCrudService cellarCrudService) {
        this.cellarCrudService = cellarCrudService;
    }

    @GetMapping
    private ResponseEntity<List<CellarResponse>> getAllCellars(){
        return ResponseEntity.ok(cellarCrudService.getAll());
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    private void createCellar(@RequestBody @Valid CellarRequest cellarRequest){
        cellarCrudService.create(cellarRequest);
    }

    @PutMapping("/update/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    private void updateCellar(@PathVariable Long id, @RequestBody @Valid CellarRequest cellarRequest){
        cellarCrudService.update(id, cellarRequest);
    }

    @DeleteMapping("/delete/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    private void deleteCellar(@PathVariable Long id){
        cellarCrudService.delete(id);
    }


}

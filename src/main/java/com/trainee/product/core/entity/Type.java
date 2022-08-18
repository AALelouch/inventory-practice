package com.trainee.product.core.entity;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Table(name = "type")
@Entity
public class Type {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "unit_of_measure")
    private String unitOfMeasure;

    @Column(name = "measure")
    private Float measure;

    @OneToMany(mappedBy = "type")
    @ToString.Exclude
    private List<Product> productList;
}

package com.trainee.product.core.entity;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Table(name = "product")
@Entity
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "quantity")
    private Float quantity;

    @Column(name = "buy_value")
    private Float buyValue;

    @Column(name= "tax_value")
    private Float taxValue;

    @Column(name = "sell_value")
    private Float sellValue;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;

    @ManyToMany
    @JoinTable(
            name = "product_cellar",
            joinColumns = @JoinColumn(name = "product_id"),
            inverseJoinColumns = @JoinColumn(name = "cellar_id"))
    @ToString.Exclude
    private List<Cellar> cellars;

    @ManyToOne
    @JoinColumn(name = "type_id")
    private Type type;

    @ManyToOne
    @JoinColumn(name = "tax_id")
    private Tax tax;

    private String vendorDni;
}

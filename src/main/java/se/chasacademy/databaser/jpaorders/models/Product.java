package se.chasacademy.databaser.jpaorders.models;

import jakarta.persistence.*;

@Entity
@Table(name = "T_PRODUCT")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "PROD_ID")
    private Long id;

    @Column(name = "PROD_NAME", nullable = false)
    private String name;

    @Column(name = "PROD_DESC")
    private String description;

    @Column(name = "UNIT_PRICE_CENTS", nullable = false)
    private Integer unitPriceCents;

    @Column(name = "ACTIVE_FLAG", nullable = false)
    private String activeFlag;
}

package se.chasacademy.databaser.jpaorders.models;

import jakarta.persistence.*;

@Entity
@Table(name = "T_ORDER_LINE")
public class OrderLine {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ORDER_LINE_ID")
    private Long id;

    @Column(name = "LINE_NUMBER", nullable = false)
    private Integer lineNumber;

    @Column(name = "QTY", nullable = false)
    private Integer quantity;

    @Column(name = "LINE_TOTAL_CENTS", nullable = false)
    private Integer lineTotalCents;

    // ManyToOne → Order
    @ManyToOne
    @JoinColumn(name = "ORDER_ID", nullable = false)
    private Order order;

    // ManyToOne → Product
    @ManyToOne
    @JoinColumn(name = "PRODUCT_ID", nullable = false)
    private Product product;
}

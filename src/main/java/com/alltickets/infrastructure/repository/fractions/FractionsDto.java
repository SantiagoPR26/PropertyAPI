package com.alltickets.infrastructure.repository.fractions;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "FRACTIONS")
public class FractionsDto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private boolean status;

    @Column(nullable = false)
    private double priceFraction;

    @Column(nullable = false)
    private int totalFractions;

    @Column(nullable = false)
    private int soldFractions;

}

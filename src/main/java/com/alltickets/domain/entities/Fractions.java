package com.alltickets.domain.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Fractions {

    private Long id;
    private boolean status;
    private double priceFraction;
    private int totalFractions;
    private int soldFractions;

}

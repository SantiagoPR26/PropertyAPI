package com.alltickets.infrastructure.api.dto.fractions;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class FractionsResponse {

    private int totalFractions;
    private int soldFractions;
}

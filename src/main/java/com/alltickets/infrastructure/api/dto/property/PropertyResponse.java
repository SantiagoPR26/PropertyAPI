package com.alltickets.infrastructure.api.dto.property;

import com.alltickets.infrastructure.api.dto.fractions.FractionsResponse;
import com.alltickets.infrastructure.api.dto.type.TypeResponse;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class PropertyResponse {

    private String id;
    private String propertyIndex;
    private String guid;
    private List<String> priceList;
    private String img;
    private int profitability;
    private String city;
    private TypeResponse type;
    private String phone;
    private String address;
    private FractionsResponse fractions;

}
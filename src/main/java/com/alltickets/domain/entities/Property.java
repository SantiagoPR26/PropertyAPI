package com.alltickets.domain.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Property {

    private String id;
    private String propertyIndex;
    private String guid;
    private List<String> priceList;
    private String img;
    private int profitability;
    private String city;
    private Type type;
    private String phone;
    private String address;
    private Fractions fractions;

}
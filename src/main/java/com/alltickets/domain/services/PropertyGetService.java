package com.alltickets.domain.services;

import com.alltickets.domain.entities.Property;

import java.util.List;

public interface PropertyGetService {

    Property getById(String id);

    List<Property> getAll();
}

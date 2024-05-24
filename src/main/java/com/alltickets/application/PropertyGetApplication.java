package com.alltickets.application;

import com.alltickets.domain.entities.Property;
import com.alltickets.domain.services.PropertyGetService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class PropertyGetApplication {

    private final PropertyGetService propertyGetService;

    public Property getById(String id){
        return propertyGetService.getById(id);
    }

    public List<Property> getAll(){
        return propertyGetService.getAll();
    }
}

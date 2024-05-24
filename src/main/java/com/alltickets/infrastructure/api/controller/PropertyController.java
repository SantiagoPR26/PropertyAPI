package com.alltickets.infrastructure.api.controller;

import com.alltickets.application.PropertyGetApplication;
import com.alltickets.infrastructure.api.dto.property.PropertyResponse;
import com.alltickets.infrastructure.api.mapper.property.PropertyResponseMapper;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("api/property")
public class PropertyController {

    private final PropertyGetApplication propertyGetApplication;
    private final PropertyResponseMapper propertyResponseMapper;

    @GetMapping("/all")
    public ResponseEntity<List<PropertyResponse>> getAllProperties(){
        return ResponseEntity.ok(propertyResponseMapper.toResponse(propertyGetApplication.getAll()));
    }

    @GetMapping("/one/{id}")
    public ResponseEntity<PropertyResponse> getPropertyById(@PathVariable("id") String id){
        return ResponseEntity.ok(propertyResponseMapper.toResponse(propertyGetApplication.getById(id)));
    }
}

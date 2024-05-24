package com.alltickets.infrastructure.api.mapper.property;

import com.alltickets.domain.entities.Property;
import com.alltickets.infrastructure.api.dto.property.PropertyResponse;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "Spring")
public interface PropertyResponseMapper {

    PropertyResponse toResponse(Property property);

    List<PropertyResponse> toResponse(List<Property> propertyList);
}

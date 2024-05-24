package com.alltickets.infrastructure.repository.property;

import com.alltickets.domain.entities.Property;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "Spring")
public interface PropertyMapper {

    Property toEntity(PropertyDto propertyDto);

    PropertyDto toDto(Property property);

    List<Property> toEntity(List<PropertyDto> propertyDtos);
}

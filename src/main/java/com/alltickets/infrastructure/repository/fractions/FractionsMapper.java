package com.alltickets.infrastructure.repository.fractions;

import com.alltickets.domain.entities.Fractions;
import org.mapstruct.Mapper;

@Mapper(componentModel = "Spring")
public interface FractionsMapper {

    Fractions toEntity(FractionsDto fractionsDto);

    FractionsDto toDto(Fractions fractions);

}

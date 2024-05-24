package com.alltickets.infrastructure.api.mapper.fractions;

import com.alltickets.domain.entities.Fractions;
import com.alltickets.infrastructure.api.dto.fractions.FractionsResponse;
import org.mapstruct.Mapper;

@Mapper(componentModel = "Spring")
public interface FractionsResponseMapper {

    FractionsResponse toDto(Fractions fractions);
}

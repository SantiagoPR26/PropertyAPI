package com.alltickets.infrastructure.api.mapper.type;

import com.alltickets.domain.entities.Type;
import com.alltickets.infrastructure.api.dto.type.TypeResponse;
import org.mapstruct.Mapper;

@Mapper(componentModel = "Spring")
public interface TypeResponseMapper {

    TypeResponse toDto(Type type);
}

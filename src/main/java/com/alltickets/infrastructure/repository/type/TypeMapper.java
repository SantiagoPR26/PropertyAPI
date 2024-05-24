package com.alltickets.infrastructure.repository.type;

import com.alltickets.domain.entities.Type;
import org.mapstruct.Mapper;

@Mapper(componentModel = "Spring")
public interface TypeMapper {

    Type toEntity(TypeDto typeDto);

    TypeDto toDto(Type type);

}

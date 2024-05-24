package com.alltickets.infrastructure.adapter;

import com.alltickets.domain.entities.Property;
import com.alltickets.domain.services.PropertyGetService;
import com.alltickets.infrastructure.repository.property.PropertyDto;
import com.alltickets.infrastructure.repository.property.PropertyMapper;
import com.alltickets.infrastructure.repository.property.PropertyRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Service
public class PropertyGetAdapter implements PropertyGetService {

    private final PropertyRepository propertyRepository;
    private final PropertyMapper propertyMapper;

    @Override
    public Property getById(String id){
        Optional<PropertyDto> propertyDto = propertyRepository.findById(id);
        return propertyDto.map(propertyMapper::toEntity).orElseThrow(RuntimeException::new);
    }

    @Override
    public List<Property> getAll(){
        return propertyMapper.toEntity(propertyRepository.findAll());
    }


}

package com.alltickets.infrastructure.repository.type;

import jakarta.persistence.*;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@AllArgsConstructor
@NoArgsConstructor
@Entity
@Data
@Table(name = "TYPE")
public class TypeDto {

    @Id()
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Size(max = 12)
    @Column(name = "type_property", nullable = false)
    private String typeProperty;

}

package com.alltickets.infrastructure.repository.property;

import com.alltickets.infrastructure.repository.fractions.FractionsDto;
import com.alltickets.infrastructure.repository.type.TypeDto;
import jakarta.persistence.*;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "PROPERTY")
public class PropertyDto {

    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    private String id;

    @Column(name = "index", nullable = false)
    private String propertyIndex;

    @Column(nullable = false)
    private String guid;

    @Column(nullable = false)
    private List<String> priceList;

    @Column(nullable = false)
    private String img;

    @Column(nullable = false)
    private int profitability;

    @Column(nullable = false)
    private String city;


    @ManyToOne
    @JoinColumn(name = "type_id", referencedColumnName = "id")
    private TypeDto type;


    @Column(nullable = false)
    private String phone;

    @Size(max = 50)
    @Column(nullable = false)
    private String address;


    @ManyToOne
    @JoinColumn(name = "fractions_id", referencedColumnName = "id")
    private FractionsDto fractions;

}

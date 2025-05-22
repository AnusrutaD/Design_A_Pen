package com.anusruta.pen.version1.entities;

import com.anusruta.pen.version1.entities.enums.NibType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
@NoArgsConstructor
public class Nib {
    private String brand;
    private Double radius;
    private NibType type;
}

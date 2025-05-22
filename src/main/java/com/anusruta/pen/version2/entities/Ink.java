package com.anusruta.pen.version2.entities;

import com.anusruta.pen.version2.entities.enums.InkType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
@NoArgsConstructor
public class Ink {
    private String brand;
    private String colour;
    private InkType type;
}

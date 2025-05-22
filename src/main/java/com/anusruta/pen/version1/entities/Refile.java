package com.anusruta.pen.version1.entities;

import com.anusruta.pen.version1.entities.enums.RefileType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
@NoArgsConstructor
public class Refile {
    private String brand;
    private String name;
    private Double price;
    private Ink ink;
    private Nib nib;
    private RefileType type;
}

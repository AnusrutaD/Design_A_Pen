package com.anusruta.pen.version1.entities;

import com.anusruta.pen.version1.entities.enums.PenType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
@NoArgsConstructor
public class Pen {
    private String brand;
    private String name;
    private Double price;
    private Refile refile;
    private Ink ink;
    private Nib nib;
    private PenType type;

    public void write(){
        switch (this.type) {
            case GEL:
                System.out.println("Write by gel pen");
                break;
            case BALL:
                System.out.println("Write by ball pen");
                break;
            case FOUNTAIN:
                System.out.println("Write by fountain pen");
                break;
            case MARKER:
                System.out.println("Write by marker pen");
        }

    }
}

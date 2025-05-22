package com.anusruta.pen.version2.entities;

import com.anusruta.pen.version2.entities.strategy.WritingStrategy;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
@NoArgsConstructor
public abstract class Pen {
    private String brand;
    private String name;
    private Double price;
    protected WritingStrategy strategy;

    public abstract void write();
//    {
//        switch (this.type) {
//            case GEL:
//                System.out.println("Write by gel pen");
//                break;
//            case BALL:
//                System.out.println("Write by ball pen");
//                break;
//            case FOUNTAIN:
//                System.out.println("Write by fountain pen");
//                break;
//            case MARKER:
//                System.out.println("Write by marker pen");
//        }
//
//    }
}

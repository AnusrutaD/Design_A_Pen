package com.anusruta.pen.version2.entities;

import com.anusruta.pen.version2.entities.strategy.WritingStrategy;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Marker extends Pen{
    private Ink ink;
    private Nib nib;

    public Marker(String brand, String name, Double price, WritingStrategy strategy, Ink ink, Nib nib) {
        super(brand, name, price, strategy);
        this.ink = ink;
        this.nib = nib;
    }


    @Override
    public void write() {
        this.strategy.write();
    }
}

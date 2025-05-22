package com.anusruta.pen.version2.entities;

import com.anusruta.pen.version2.entities.interfaces.Refillable;
import com.anusruta.pen.version2.entities.strategy.WritingStrategy;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Gel extends Pen implements Refillable {
    private Refile refile;

    public Gel(String brand, String name, Double price, WritingStrategy strategy, Refile refile) {
        super(brand, name, price, strategy);
        this.refile = refile;
    }


    @Override
    public void write() {
        this.strategy.write();
    }

    @Override
    public void changeRefile(Refile refile) {
        this.refile = refile;
    }
}

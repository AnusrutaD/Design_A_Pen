package com.anusruta.pen.version2.entities.strategy;

public class Rough implements WritingStrategy{
    @Override
    public void write() {
        System.out.println("Writing roughly");
    }
}

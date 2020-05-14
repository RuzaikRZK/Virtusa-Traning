package com.practicle.factorymethoddesignpattern;

public class BasicPackage  extends Package{
    protected void createPackage() {

        decorations.add(new AlloyWheelDecoration());

    }
}

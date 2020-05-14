package com.practicle.factorymethoddesignpattern;

public class SilverPackage extends Package{
    protected void createPackage() {
        decorations.add(new BodyKitDecoration());
        decorations.add(new AlloyWheelDecoration());
    }
}

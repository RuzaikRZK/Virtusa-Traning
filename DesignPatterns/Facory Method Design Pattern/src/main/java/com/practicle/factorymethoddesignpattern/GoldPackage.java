package com.practicle.factorymethoddesignpattern;

public class GoldPackage extends Package{
    protected void createPackage() {
        decorations.add(new AlloyWheelDecoration());
        decorations.add(new BodyKitDecoration());
        decorations.add(new SpoilerDecaration());

    }
}

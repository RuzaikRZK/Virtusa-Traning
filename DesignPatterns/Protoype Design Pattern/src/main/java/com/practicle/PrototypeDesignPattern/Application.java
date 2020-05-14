package com.practicle.PrototypeDesignPattern;

public class Application {
    public static void main(String[] args) {

        Registry registry = new Registry();

        Cat cat = (Cat) registry.GetAnimal(AnimalType.CAT);
        System.out.println(cat);

        cat.setFood("Fish");

        System.out.println(cat);

        Cat cat2 = (Cat) registry.GetAnimal(AnimalType.CAT);
        System.out.println(cat2);




    }

}

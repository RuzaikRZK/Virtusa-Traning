package com.practicle.PrototypeDesignPattern;

import java.util.HashMap;
import java.util.Map;

public class Registry {

    private Map<AnimalType,Animal> animalMap = new HashMap<AnimalType, Animal>();

    public Registry(){

        Intialized();

    }

    public Animal GetAnimal(AnimalType animalType){
        Animal animal =null;

        try {
             animal =(Animal) animalMap.get(animalType).clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        return animal;
    }


    private void Intialized(){

        Cat cat = new Cat();
        cat.setAnimalName("White Cat");
        cat.setAnimalSound("Miaoww ...");
        cat.setFood("Milk");

        Cow cow = new Cow();
        cow.setAnimalName("Molly");
        cow.setAnimalSound("Umbaaaa..");
        cow.setFood("Green Grass");


        animalMap.put(AnimalType.CAT,cat);
        animalMap.put(AnimalType.COW,cow);



    }




}

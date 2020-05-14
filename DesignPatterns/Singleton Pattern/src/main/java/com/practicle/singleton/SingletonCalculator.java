package com.practicle.singleton;

public class SingletonCalculator {

    private static volatile  SingletonCalculator singletonCalculator;



    private SingletonCalculator(){

        if(singletonCalculator != null){

            throw  new RuntimeException("Please Use Get SingletonCalculatorMethod");
        }

    }

    // double check singleton

    public static SingletonCalculator getSingletonCalculatorInstace(){

        if(singletonCalculator == null){
            synchronized (SingletonCalculator.class){

                if(singletonCalculator == null){

                    singletonCalculator = new SingletonCalculator();
                }

            }

        }

        return singletonCalculator;

    }

    public int PrintMax(int num1,int num2){

        return Math.max(num1,num2);


    }

    public int PrintMin(int num1,int num2){

        return  Math.min(num1,num2);
    }



}

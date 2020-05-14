package com.practicle.singleton;

public class Main {

    public static void main(String[] args) {

        long start;
        long end;


        //start =System.currentTimeMillis();
        SingletonCalculator singletonCalculator = SingletonCalculator.getSingletonCalculatorInstace();
       // end =System.currentTimeMillis();
        SingletonCalculator singletonCalculator1 = SingletonCalculator.getSingletonCalculatorInstace();
        System.out.println( singletonCalculator.PrintMax(1,2) +" : Max Value");
        System.out.println( singletonCalculator1.PrintMin(1,2) +" : Min Value");


        // this will prove its create on same instance at 1 time ;
        System.out.println(singletonCalculator);
        System.out.println(singletonCalculator1);


        //System.out.println(start-end);





    }
}

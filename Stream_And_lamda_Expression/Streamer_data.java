/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication7;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

/**
 *
 * @author RZK Technology
 */
public class Streamer_data {

    public static void main(String[] args) {

        Map<String, Integer> datamap = new HashMap<>();
        datamap.put("Ruzaik", 45);
        datamap.put("Anuhas", 65);
        datamap.put("Lamda", 76);
        datamap.put("hashan", 54);
        datamap.put("Madushan", 98);

        Set<String> strings = datamap.keySet();
        System.out.println(strings);

        //  System.out.println( datamap.get("Ruzaik"));
        //Collectors vr ;
        //Marks Counting
        datamap.values().stream().filter(data -> data > 60).collect(Collectors.toList()).forEach(System.out::println);

        //Sorted With name and counting the marks marks>60
        datamap.keySet().stream().sorted().filter(data -> datamap.get(data) > 60).collect(Collectors.toList()).forEach(System.out::println);

        System.out.println();

    }

}

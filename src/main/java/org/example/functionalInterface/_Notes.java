package org.example.functionalInterface;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class _Notes {
    public static void main(String[] args) {
        System.out.println(notes(370));

    }
    static List<Integer> notes(int amount){
        ArrayList<Integer>result = new ArrayList<>();
        int hun = 0;
        int fifty = 0;
        int twenty = 0;

        while (amount >= 100){
//            hun = amount / 100;
            amount -= 100;
            hun++;


        }
        while (amount >= 50){
            //fifty = amount / 50;
            amount -= 50;
            fifty++;


        }
        while (amount >= 20){

            amount -= 20;
            twenty++;


        }
        result.add(hun);
        result.add(fifty);
        result.add(twenty);
       return result.stream().collect(Collectors.toList());
    }
}

package org.example.functionalInterface;

import java.util.function.BiFunction;
import java.util.function.Function;

public class _Function {
    public static void main(String[] args) {

int increment = increment(34);
        System.out.println(increment);

        int increment2 = incrementByOneFunction.apply(34);
        System.out.println(increment2);
        int multiply = multiplyBy10Function.apply(increment2);
        System.out.println(multiply);
        Function<Integer, Integer> result = incrementByOneFunction
                .andThen(multiplyBy10Function);
        System.out.println(result.apply(4));

        //BiFunction takes 2 argument and produce 1 result
        System.out.println(incrementByOneAndMultiply10(4,100));
        System.out.println(incrementByOneAndMultiplyBiFunction10.apply(4,100));

    }


    static Function<Integer,Integer>incrementByOneFunction
            = number -> number + 1;
    static Function<Integer,Integer> multiplyBy10Function
            = number -> number * 10;
    static BiFunction<Integer,Integer,Integer>incrementByOneAndMultiplyBiFunction10
            = (numberToIncrement, numberToMultiply) ->
            (numberToIncrement + 1) * numberToMultiply * 10;

    static int increment(int number){
        return number + 1;
    }
    static int incrementByOneAndMultiply10(int number, int numToMultiply){
      return (number + 1) * numToMultiply;
    }
}

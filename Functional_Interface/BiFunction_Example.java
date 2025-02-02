package Functional_Interface;

import java.util.function.BiFunction;

public class BiFunction_Example {
    //Like Function<T, R>, but takes two arguments (T, U) and returns a result of type R.
    // BiFunction <T, U, R>
    public static void main(String[] args) {
        BiFunction<Integer, Integer, Integer> add = (x, y) -> x + y;

        System.out.println(add.apply(10, 20));
    }
}

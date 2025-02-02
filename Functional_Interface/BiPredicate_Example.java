package Functional_Interface;

import java.util.function.BiPredicate;

public class BiPredicate_Example {

    //Like Predicate<T>, but takes two arguments (T, U) and returns a boolean.
    public static void main(String[] args) {
        BiPredicate<Integer, Integer> isGreaterThanTen = (x, y) -> x > 10 && y > 10;

        System.out.println(isGreaterThanTen.test(15, 20));
        System.out.println(isGreaterThanTen.test(5, 20));
    }
}

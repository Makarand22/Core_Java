package Functional_Interface;
import java.util.function.Predicate;

public class PredicateIsEven {
//    Represents a function that takes an input T and returns a boolean.
//    Commonly used for filtering or conditional checks.
//
//    test(n) to provide input as n
//    and() → Both conditions must be true.
//    or() → At least one condition must be true.
    public static void main(String[] args) {
        Predicate<Integer> isEven = num -> num % 2 == 0;

        System.out.println("12 is Even : " + isEven.test(12));
        System.out.println("11 is Even : " + isEven.test(11));

        Predicate<Integer> isGreaterThan10 = n -> n>10;
        System.out.println("8 is Even AND greater than 10 : " + isEven.and(isGreaterThan10).test(8));
        System.out.println("8 is Even OR greater than 10 : " + isEven.or(isGreaterThan10).test(8));
        System.out.println("12 is Even AND greater than 10 : " + isEven.and(isGreaterThan10).test(12));
    }
}

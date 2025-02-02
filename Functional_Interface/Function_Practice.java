package Functional_Interface;

import java.util.function.Function;

public class Function_Practice {

    public static void main(String[] args) {

        // Square
        Function<Integer, Integer> square = num -> num * num;

        System.out.println("Square of 5 : " + square.apply(5));  // Output: 25
        System.out.println("Square of 10 : " + square.apply(10)); // Output: 100

        // INR to USD
        Function<Double, Double> convertToINR = usd -> usd * 83.0; // Assuming 1 USD = 83 INR

        System.out.println("Conversion of 1000RS : " +convertToINR.apply(1000.0));
        System.out.println("Conversion of 500RS : " +convertToINR.apply(500.0));


        // Extract Domain
        Function<String, String> extractDomain = email -> email.substring(email.indexOf("@") + 1);

        System.out.println(extractDomain.apply("user@gmail.com"));  // Output: gmail.com
    }

}

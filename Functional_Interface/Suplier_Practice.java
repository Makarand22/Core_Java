package Functional_Interface;

import java.util.Random;
import java.util.function.Supplier;
import java.time.LocalDateTime;

public class Suplier_Practice {
//    Represents a function that does not take any input but returns a value of type T.
//    Commonly used for lazy initialization or fetching values.

    public static void main(String[] args) {

        // get current date
        Supplier<LocalDateTime> currentDateTime = () -> LocalDateTime.now();

        System.out.println("Current Date & Time: " + currentDateTime.get());


        // Generate OTP 6 digits
        Supplier<String> generateOTP = () -> String.valueOf(100000 + new Random().nextInt(900000));

        System.out.println("Generated OTP: " + generateOTP.get());
    }
}

package Functional_Interface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Consumer_Practice {
//    Purpose: Performs an action without returning a result.
//    Think of it as: "I will consume this data and do something with it (like print or log), but I don’t give anything back."

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");

        // Consumer that prints the string
        Consumer<String> printName = System.out::println;

        // Using Consumer to print each name
        names.forEach(printName);
    }
}

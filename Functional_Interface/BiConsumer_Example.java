package Functional_Interface;

import java.util.function.BiConsumer;

public class BiConsumer_Example {
//    Like Consumer<T>, but takes two arguments (T, U) and returns no result (i.e., it performs some side effect).
//    Use case: Performing actions like printing, updating, or logging based on two inputs.
    public static void main(String[] args) {

        BiConsumer<Integer, String > result = (empId, name) -> System.out.println("Employee ID : " + empId + "Emplpyee Name : " + name) ;

        result.accept(132, "Atul");
        result.accept(234, "Ram");


    }
}

package callbacks;

import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;

public class Lambdas {
    public static void main(String[] args) {
//      Using Function
//      Function <String, String> upperCaseName = String::toUpperCase;
        Function <String, String> upperCaseName = name -> {
            if (name.isBlank()) throw new IllegalArgumentException("");
            return name.toUpperCase();
        };

//      Using BiFunction
        BiFunction<String, Integer, String> BiupperCaseName = (name, age)-> {
            if (name.isBlank()) throw new IllegalArgumentException("");
            System.out.print("By Using BiFunctional Interface Age: "+ age);
            return name.toUpperCase();
        };

        System.out.println("By Using Functional Interface name: "+upperCaseName.apply("Alex"));
        System.out.println(" And Name: " +BiupperCaseName.apply("Alex", 20));

    }
}

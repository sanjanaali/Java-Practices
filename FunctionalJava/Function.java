package function;

import java.util.function.BiFunction;

public class Function {

    public static void main(String[] args) {

//      Normal Java Function

        int increment = incrementByOne(1);
        System.out.println(increment);

//      Functional Interface

        int increment2 = incrementByOneFunction.apply(1);
        System.out.println(increment2);

        int multiply = multiplyBy10Function.apply(increment2);
        System.out.println(multiply);



//      Functional Interface (Function takes 1 arg as input and also gives 1 result)

        java.util.function.Function <Integer, Integer> addBy1AndThenMultiplyBy10 =
                incrementByOneFunction.andThen(multiplyBy10Function);
        System.out.println(addBy1AndThenMultiplyBy10.apply(4));

        System.out.println(add1Multiply10.apply(4,100));
        }

    static java.util.function.Function<Integer, Integer> incrementByOneFunction =
            number ->  number + 1;

    static java.util.function.Function<Integer, Integer> multiplyBy10Function =
            number -> number * 10;

//    Normal java function
    static int incrementByOne(int number){

        return number + 1;
    }

//    BiFunction takes 2 arg as input and give 1 result
    static BiFunction <Integer, Integer, Integer> add1Multiply10 =
            (numAdd, numMul) -> (numAdd + 1)* numMul;



}

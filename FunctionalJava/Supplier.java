package function;

import java.util.List;

public class Supplier {

    public static void main(String[] args) {

        System.out.println("Without Supplier");
        System.out.println(getDBUrl());

        System.out.println("Using Supplier");
        System.out.println(getDBUrlSupplier.get());
        System.out.println(getNumList.get());
    }

    static String getDBUrl(){
        return "https://chat.openai.com/";
    }
    static java.util.function.Supplier <String> getDBUrlSupplier = ()
            -> "https://chat.openai.com/";

    static java.util.function.Supplier <List<String>> getNumList = ()
            -> List.of("Alice", "Bob", "Tim") ;

}

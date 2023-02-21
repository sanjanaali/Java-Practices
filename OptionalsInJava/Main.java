package optionals;

import java.util.Optional;

public class Main {

    public static void main(String[] args) {
        Object value = Optional.ofNullable(null)
                .orElseGet(()->"default value");

        System.out.println(value);

        Object value2 = Optional.ofNullable("Hello")
                        .orElseThrow(()->new IllegalStateException("exception"));

        System.out.println(value2);

        Optional.ofNullable("Hi")
                .ifPresent(System.out::println);

/*
        Optional.ofNullable("Hi")
                .ifPresent(value3 -> {
                    //logic here
                    System.out.println(value3);
                });
*/
        Optional.ofNullable("sanjanaa028@gmail.com")
                .ifPresentOrElse(
                        email -> System.out.println("Sending email to "+email),()-> {
                            //execute the below line if the given value is NUll
                            System.out.println("Cannot send email!!");
                        });


                }
    }


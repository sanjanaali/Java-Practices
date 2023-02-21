package callbacks;

import java.util.function.Consumer;

public class CallBacks {
    public static void main(String[] args) {

        hello("Sanjana", "Yesmin", value-> {
            System.out.println("No lastName Provided for " +value);
        });

        System.out.println();
        hello2("Sanjana", null, ()-> {
            System.out.println("No lastName Provided");
        });
    }

    static void hello(String firstName, String lastName, Consumer<String> callback){
        System.out.println(firstName);
        if(lastName!=null){
            System.out.println(lastName);
        }
        else{
            callback.accept(firstName);
        }
    } static void hello2(String firstName, String lastName, Runnable callback){
        System.out.println(firstName);
        if(lastName!=null){
            System.out.println(lastName);
        }
        else{
            callback.run();
        }
    }
//    function hello(firstName, lastName, callback){
//        console.log(firstName);
//        if(lastName) {
//            console.log(lastName)
//        }
//        else{
//            callback();
//        }
//        }
    }


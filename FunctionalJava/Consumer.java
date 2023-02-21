package function;

import java.util.function.BiConsumer;

public class Consumer {
    public static void main(String[] args) {

//      Normal java function
        System.out.println("Normal java function");
        Customer maria = (new Customer("Maria","99999"));
        greetCustomer(maria);

//      Consumer Functional Interface
        System.out.println();
        System.out.println("Consumer Functional Interface");
        greetCustomerConsumer.accept(maria);

//      BiConsumer Functional Interface
        System.out.println();
        System.out.println("BiConsumer Functional Interface");
        greetCustomerConsumerV2.accept(maria,false);

    }

    static java.util.function.Consumer<Customer> greetCustomerConsumer = customer ->
            System.out.println("Hello " + customer.name +
                    " Thanks for registering phone number " + customer.phnNum);

    static BiConsumer<Customer, Boolean> greetCustomerConsumerV2 = (customer, showPhn) ->
            System.out.println("Hello " + customer.name +
                    " Thanks for registering phone number " + (showPhn ? customer.phnNum : "*******"));
    static void greetCustomer(Customer customer){
        System.out.println("Hello " + customer.name +
                " Thanks for registering phone number " + customer.phnNum);
    }

    static class Customer {
        private final String name;
        private final String phnNum;


        Customer(String name, String phnNum) {
            this.name = name;
            this.phnNum = phnNum;
        }
    }
}

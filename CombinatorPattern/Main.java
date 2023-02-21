package combinatorpattern;

import java.time.LocalDate;

import static combinatorpattern.CustomerRegistrationValidator.*;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer(
                "Alice",
                "alice34@gmail.com",
                "+88012387456",
                LocalDate.of(2000,1,1)
        );

//        CustomerValidatorService service = new CustomerValidatorService();
//        service.isValid(customer);

//        System.out.println(new CustomerValidatorService().isValid(customer));

//        If valid we can store customer in DB

        //Using combinator Pattern
        ValidationResult result = isEmailValid()
                .and(isPhnNumValid())
                .and(isAnAdult())
                .apply(customer);

        System.out.println(result);

        if (result != ValidationResult.SUCCESS){
            throw new IllegalStateException(result.name());
        }

    }
}

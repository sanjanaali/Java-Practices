package combinatorpattern;

import java.time.LocalDate;
import java.time.Period;

public class CustomerValidatorService {

    private boolean isEmailValid(String email) {
        return email.contains("@");
    }

    private boolean isPhnNumValid(String phnNum) {
        return phnNum.startsWith("+88");
    }
        private boolean isAdult (LocalDate dob) {
        return Period.between(dob, LocalDate.now()).getYears() > 16;
        }

        public boolean isValid(Customer customer){
        return isEmailValid(customer.getEmail())&&
                isPhnNumValid(customer.getPhnNumber())&&
                isAdult(customer.getDoB());
        }

}
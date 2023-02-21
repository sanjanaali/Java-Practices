package combinatorpattern;

import java.time.LocalDate;

public class Customer {

    private final String name;
    private final String email;
    private final String phnNumber;
    private final LocalDate doB;

    public Customer(String name, String email, String phnNumber, LocalDate doB) {
        this.name = name;
        this.email = email;
        this.phnNumber = phnNumber;
        this.doB = doB;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPhnNumber() {
        return phnNumber;
    }

    public LocalDate getDoB() {
        return doB;
    }
}

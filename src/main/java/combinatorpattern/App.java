package combinatorpattern;

import java.time.LocalDate;

import static combinatorpattern.CustomerRegistrationValidator.*;

public class App {
    public static void main(String[] args) {
        Customer customer = new Customer(
                "Alice",
                "alicegmail.com",
                "+07863450111",
                LocalDate.of(2000, 1, 1)
        );

//        System.out.println(new CustomerValidatorService().isValid(customer));

        ValidationResult result = isEmailValid()
                .and(isPhoneNumberValid())
                .and(isAdult())
                .apply(customer);
        System.out.println(result);

        if (result != ValidationResult.SUCCESS){
            throw new IllegalArgumentException(result.name());
        }
    }
}

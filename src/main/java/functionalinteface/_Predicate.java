package functionalinteface;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class _Predicate {
    public static void main(String[] args) {
        System.out.println(isPhoneNumberValid("07863450187"));
        System.out.println(isPhoneNumberValid("08863450187"));
        System.out.println("With Predicate : ");
        System.out.println(isPhoneNumberValidFunction.test("08863450187"));
        System.out.println("Is phone number valid and contains 3");
        System.out.println(
                isPhoneNumberValidFunction.and(containsNumber3).test("08863450187")
        );

        System.out.println(
                isPhoneNumberValidFunction.or(containsNumber3).test("07860450187")
        );


    }

    static boolean isPhoneNumberValid(String phoneNumber) {
        return phoneNumber.startsWith("07") && phoneNumber.length() == 11;
    }

    static Predicate<String> isPhoneNumberValidFunction = number -> number.startsWith("07")
            && number.length() == 11;

    static Predicate<String> containsNumber3 = phoneNumber -> phoneNumber.contains("3");

}

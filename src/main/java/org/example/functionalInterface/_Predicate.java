package org.example.functionalInterface;

import java.util.function.Predicate;

public class _Predicate {
    public static void main(String[] args) {
        // Validation without Predicate
        System.out.println(isPhoneNumberValid("07000000000"));

        // Validation with Predicate
        System.out.println("Validation with Predicate");
        System.out.println(isPhoneNumberValidPredicate
                .test("07000000000"));

        // Contain3
        System.out.println(" // Contain3");
        System.out.println(isPhoneNumberValidPredicate.and(contains3)
                .test("07089611296"));


    }

    static Predicate<String> isPhoneNumberValidPredicate = phoneNumber ->
            phoneNumber.startsWith("07") && phoneNumber.length() == 11;
    static Predicate<String>contains3 = phoneNumber -> phoneNumber.contains("3");

    static Boolean isPhoneNumberValid(String number) {
        return number.startsWith("07") && number.length() == 11;
    }
}

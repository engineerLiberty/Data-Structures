package org.example.functionalInterface;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class _Consumer {
    public static void main(String[] args) {
        Customer liberty = new Customer("Liberty","9999");
        // Normal java function
        greetCustomer(liberty);

        // This is using functional interface
        greetCustomerConsumer.accept(liberty);
        // This is a biFunction
        greetCustomerConsumerV2.accept(liberty,false);

    }
    static BiConsumer<Customer,Boolean>greetCustomerConsumerV2 = (customer,showPhoneNumber) -> System.out.println("Hello " + Customer.customerName + ", thanks for registering phone number "
    + (showPhoneNumber ? Customer.customerPhoneNumber: "*******"));
    static Consumer<Customer>greetCustomerConsumer = customer -> System.out.println("Hello " + Customer.customerName + ", thanks for registering phone number "
            + Customer.customerPhoneNumber);
    static void greetCustomer(Customer customer){
        System.out.println("Hello " + Customer.customerName + ", thanks for registering phone number "
                + Customer.customerPhoneNumber);
    }
    static  class Customer{
        private static String customerName;
        private static String customerPhoneNumber;

        public Customer(String customerName, String customerPhoneNumber) {
            this.customerName = customerName;
            this.customerPhoneNumber = customerPhoneNumber;
        }

    }
}

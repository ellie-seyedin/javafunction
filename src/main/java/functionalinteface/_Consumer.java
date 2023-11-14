package functionalinteface;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class _Consumer {
    public static void main(String[] args) {
        greeting(new Customer("Elaheh", 99999));
        System.out.println();
        //Consumer Functional interface
        greetCustomerConsumer.accept(new Customer("Sina", 777));
        System.out.println();
        //BiConsumer Functional interface
        greetCustomerBiConsumer.accept(new Customer("SOmo", 9876), false);
    }

    static Consumer<Customer> greetCustomerConsumer = customer -> System.out.println(
            "Hello " + customer.customerName +
                    ", Thank you for registering phone number " +
                    customer.phoneNumber);

    //BiConsumer Functional interface
    static BiConsumer<Customer,Boolean> greetCustomerBiConsumer = (customer, showPhoneNumber) -> System.out.println(
            "Hello " + customer.customerName +
                    ", Thank you for registering phone number " +
                    (showPhoneNumber ? customer.phoneNumber : "******"));


    static void greeting(Customer customer){
        System.out.println("Hello " + customer.customerName + ", Thank you for registering phone number " + customer.phoneNumber);
    }

    static class Customer{
        private final String customerName;
        private final int phoneNumber;

        public Customer(String customerName, int phoneNumber) {
            this.customerName = customerName;
            this.phoneNumber = phoneNumber;
        }
    }
}

package functionalinterface;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class _Consumer {
    public static void main(String[] args) {
        greetCustomer(new Customer("sam","8838173366"));
        customerConsumer.accept(new Customer("queen","9442586318"));
        biConsumerCustomer.accept(new Customer("Tharani","1234567890"),false);
    }

    static Consumer<Customer> customerConsumer= customer->System.out.println("Hello "+customer.name+"!!! Thanks for registering "+customer.phNo);
    static BiConsumer<Customer,Boolean> biConsumerCustomer=(m,n)->System.out.println("Hello "+m.name+" Registered Mobile "+ (n?m.phNo:"****"));

    static void greetCustomer(Customer customer)
    {
        System.out.println("Hello "+customer.name+"!!! Thanks for registering "+customer.phNo);
    }
    static class Customer{
        private final String name;
        private final String phNo;

        public Customer(String name, String phNo) {
            this.name = name;
            this.phNo = phNo;
        }
    }
}

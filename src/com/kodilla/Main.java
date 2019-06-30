package com.kodilla;

import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Set<Order> orders = new HashSet<>();
        for(int i = 0; i < 10; i++) {
            orders.add(Order.generator(i));
        }

        orders.add(new Order("I am indyvidual. Don't tell me that i'm not",1000,1));
        orders.add(new Order("I am indyvidual. Don't tell me that i'm not",1000,1));
        orders.add(new Order("I am indyvidual. Don't tell me that i'm not",1000,2));

        orders.stream().forEach(System.out::println);

    }
}

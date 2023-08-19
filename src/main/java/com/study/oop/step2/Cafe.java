package com.study.oop.step2;

import lombok.AllArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
public class Cafe {

    private Barista barista;
    private Menu menu;

    public void enter(Customer customer) {
        customer.orderCoffee(barista, menu);
    }

    public static void main(String[] args) {

        //init
        Menu menu = new Menu();
        Barista mike = new Barista(100_000);
        Customer lucy = new Customer(50_000);
        Cafe cafe = new Cafe(mike, menu);

        cafe.enter(lucy);
    }
}

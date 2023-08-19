package com.study.oop.step2;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
//@Getter @Setter step1
public class Barista {

    private Integer amount;

    public Coffee makeCoffee(MenuItem menuItem) {
        return new Coffee(
                menuItem.getName(),
                menuItem.getPrice()
        );
    }

    public void receive(Integer value) {
        this.amount += value;
    }

    public Coffee takeOrder(MenuItem menuItem, Customer customer) {
        customer.pay(menuItem.getPrice());
        receive(menuItem.getPrice());
        return makeCoffee(menuItem);
    }
}

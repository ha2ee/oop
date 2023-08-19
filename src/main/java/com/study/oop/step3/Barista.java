package com.study.oop.step3;

import com.study.oop.step3.customer.PayAble;
import lombok.Getter;

public class Barista {

    @Getter
    private Integer amount;

    public Barista(Integer amount) {
        this.amount = amount;
    }

    public Coffee makeCoffee(MenuItem menuItem) {
        return new Coffee(menuItem);
    }

    public void receive(Integer value) {
        this.amount += value;
    }

    public Coffee takeOrder(MenuItem menuItem, PayAble payAble) {
        payAble.pay(menuItem.cost());
        receive(menuItem.cost());
        return makeCoffee(menuItem);
    }
}

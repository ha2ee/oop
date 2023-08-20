package com.study.oop.domain.customer;


import com.study.oop.domain.Barista;
import com.study.oop.domain.Coffee;
import com.study.oop.domain.Menu;
import com.study.oop.domain.MenuItem;

public class Customer {

    private Coffee coffee;
    private PayAble payable;

    public Customer(PayAble payable) {
        this.payable = payable;
    }

    public void order(Menu menu, Barista barista) {
        MenuItem menuItem = menu.recommend();
        Coffee coffee = barista.takeOrder(menuItem, payable);
        this.coffee = coffee;
    }

}

package com.study.oop.step3.customer;

import com.study.oop.step3.Barista;
import com.study.oop.step3.Coffee;
import com.study.oop.step3.Menu;
import com.study.oop.step3.MenuItem;

public class Customer {

    private Coffee coffee;

    private PayAble payAble;

    public Customer(PayAble payAble) {
        this.payAble = payAble;
    }

    public void order(Menu menu, Barista barista) {
        MenuItem menuItem = menu.choose(menu.recommend());
        barista.takeOrder(menuItem, payAble);
        this.coffee = coffee;
    }

}

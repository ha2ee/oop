package com.study.oop.step3.customer;

import lombok.Getter;

@Getter//확인용
public class PayWithCash implements PayAble{

    private Integer money;

    public PayWithCash(Integer money) {
        this.money = money;
    }

    @Override
    public void pay(Integer cost) {
        if(money >= cost) {
            this.money -= cost;
        } else {
            throw new RuntimeException("잔액이 부족합니다!");
        }
    }
}

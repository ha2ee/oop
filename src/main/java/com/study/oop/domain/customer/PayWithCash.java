package com.study.oop.domain.customer;

public class PayWithCash implements PayAble {

    private Integer money = 10_000; // db에서 조회

    public void pay(Integer cost) {
        if (money >= cost){
            this.money -= cost;
        } else {
            throw new RuntimeException("잔액이 부족합니다!");
        }
    }
}

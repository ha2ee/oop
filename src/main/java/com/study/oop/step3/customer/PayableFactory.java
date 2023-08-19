package com.study.oop.step3.customer;

public class PayableFactory {

    public static PayAble with(PayWay payWay, Integer money) {
        if(payWay.equals(PayWay.CASH)) return new PayWithCash(money);
        if(payWay.equals(PayWay.CARD)) return new PayWithCard(money);
        throw new IllegalArgumentException("지원하지 않는 결제 방식입니다.");
    }
}

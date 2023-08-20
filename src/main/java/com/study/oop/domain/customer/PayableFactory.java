package com.study.oop.domain.customer;

public class PayableFactory {

    public static PayAble of(PayWay payWay) {
        if(payWay.equals(PayWay.CASH)) return new PayWithCash();
        if(payWay.equals(PayWay.CARD)) return new PayWithCard();
        throw new IllegalArgumentException("지원하지 않는 결제 방식입니다.");
    }
}

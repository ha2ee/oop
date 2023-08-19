package com.study.oop.step3;

import com.study.oop.step3.customer.Customer;
import com.study.oop.step3.customer.PayAble;
import com.study.oop.step3.customer.PayWay;
import com.study.oop.step3.customer.PayableFactory;
import lombok.AllArgsConstructor;

public class Cafe {

    private final Barista barista;
    private final Menu menu = new Menu();

    public Cafe(Barista barista) {
        this.barista = barista;
    }

    public void enter(Customer customer) {
        customer.order(menu, barista);
        System.out.println("주문이 완료 되었습니다.");
    }

    public static void main(String[] args) {

        Barista mike = new Barista(100_000);
        Cafe cafe = new Cafe(mike);

        PayWay clientChoice = PayWay.CASH;
        PayAble payAble = PayableFactory.with(clientChoice, 10_000);
        Customer customer = new Customer(payAble);

        cafe.enter(customer);
        System.out.println(mike.getAmount()); // 확인용
    }
}

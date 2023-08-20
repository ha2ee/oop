package com.study.oop;

import com.study.oop.domain.Barista;
import com.study.oop.domain.Cafe;
import com.study.oop.domain.customer.Customer;
import com.study.oop.domain.customer.PayWay;
import com.study.oop.domain.customer.PayableFactory;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class OrderService {

    private final Cafe cafe;

    public void order(PayWay payWay) {
        Customer customer = new Customer(PayableFactory.of(payWay));
        Barista barista = new Barista();
        cafe.enter(customer, barista);
    }
}

package com.study.oop;

import com.study.oop.domain.customer.PayWay;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class OrderServiceTest {

    @Autowired OrderService orderService;

    @Test
    void test() {
        orderService.order(PayWay.CASH);
    }

}
package com.study.oop;

import com.study.oop.domain.customer.PayWay;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RestController
public class CafeController {

    private final OrderService orderService;

    @PostMapping("/customers/{id}/order/{payWay}")
    public String recommendOrder(@PathVariable Integer id, @PathVariable String payWay) {
        // payway 검증
        orderService.order(PayWay.of(payWay));

        return "커피 나왔습니다. 맛있게 드세요.";
    }
}

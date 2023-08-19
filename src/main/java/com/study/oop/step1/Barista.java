package com.study.oop.step1;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter @Setter
public class Barista {

    private Integer amount;

    public Coffee makeCoffee(MenuItem menuItem) {
        return new Coffee(
                menuItem.getName(),
                menuItem.getPrice()
        );
    }
}

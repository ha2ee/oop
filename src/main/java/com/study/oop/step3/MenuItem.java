package com.study.oop.step3;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
public class MenuItem {

    @Getter private final String name;
    private Integer price;
    public int cost() {
        return price;
    }
}

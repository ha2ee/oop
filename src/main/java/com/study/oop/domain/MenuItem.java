package com.study.oop.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public class MenuItem {

    @Getter private final String name;
    private Integer price;
    public int cost() {
        return price;
    }
}

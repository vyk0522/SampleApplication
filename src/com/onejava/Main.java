package com.onejava;

import com.onejava.service.Apple;
import com.onejava.service.Fruit;
import com.onejava.service.Papaya;

public class Main {
    public static void main(String[] args) {
        Fruit fruit = new Apple();
        fruit.printName();
        fruit = new Papaya();
        fruit.printName();
    }
}

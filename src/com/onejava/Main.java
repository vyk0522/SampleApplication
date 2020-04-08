package com.onejava;

import com.onejava.service.Apple;
import com.onejava.service.Fruit;
import com.onejava.service.Papaya;
import com.onejava.service.Pineapple;

public class Main {
    public static void main(String[] args) {
        Fruit fruit = new Apple();
        fruit.printName();
        fruit = new Papaya();
        fruit.printName();
        fruit = new Pineapple();
        fruit.printName();
    }
}

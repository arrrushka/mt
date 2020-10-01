package com.company;

import java.util.*;

public class Main {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        BasicCar basicCar = new BigCar(new BasicCar(1, "nissan", 3.5), "big");

        basicCar.info();
    }
}

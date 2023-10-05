package ru.borodin.test20;

import java.util.Scanner;
import java.util.function.UnaryOperator;

/*
* Написать метод, возвращающий реализацию функционального интерфейса UnaryOperator,
* который принимает целое число (тип int) и возвращает его квадрат.
* */

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int u = in.nextInt();

        UnaryOperator<Integer> squareInt = (h) -> h * h;

        System.out.println("Вывод = " + squareInt.apply(u) );
    }
}
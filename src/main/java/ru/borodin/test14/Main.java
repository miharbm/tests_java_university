package ru.borodin.test14;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
* Написать программу, считывающую введённые пользователем с клавиатуры 5 строк и записывающую их в список ArrayList.
* Найти самую короткую строку в списке и вывести её на экран.
* Если таких строк несколько, вывести на экран каждую с новой строки.
* */

public class Main {
    public static void main(String[] args) throws IOException {

        Scanner in = new Scanner(System.in);

        final int arrLength = 5;

        List<String> arr = new ArrayList<>(5);

        for (int i = 0; i < arrLength; i++){
            arr.add(in.nextLine());
        }

//        for (int i = 0; i < arrLength; i ++) {
//            System.out.println(arr.get(i));
//        }

        int lengthItemMin = arr.get(0).length();
        for (String value : arr) {
            if (value.length() < lengthItemMin) {
                lengthItemMin = value.length();
            }
        }

        for (String s : arr) {
            if (s.length() == lengthItemMin) {
                System.out.println("Минимальная строка: " + s);
            }
        }

    }
}
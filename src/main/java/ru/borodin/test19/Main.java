package ru.borodin.test19;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

/*
* Написать программу, считывающую из консоли последовательность целых чисел, разделенных пробелами,
* удаляющую из них все числа, стоящие на четных позициях, и выводящую получившуюся последовательность в обратном порядке.
* Позиции чисел в последовательности нумеруются с нуля.
*
* (Требование: в решении использовать очередь)
*
* Пример ввода: 1 2 3 4 5 6 7 8 9 10
* Пример вывода: 10 8 6 4 2
* */

public class Main {
    public static void main(String[] args) {

        int N = 10;
        Scanner in = new Scanner(System.in);

        Deque<Integer> deque= new ArrayDeque<>();

        for (int i = 0; i < N; i++){
            deque.add(in.nextInt());
        }


        System.out.println("Введено:");
        System.out.println(deque);
        System.out.println(deque.size());

        for (int i = 1; i < N + 1; i++){
            if(i % 2 == 0) {
                deque.removeFirst();
                System.out.println(i + "  - удалил его, теперь тут   " + deque.peekFirst());
            } else {
                deque.addLast(deque.removeFirst());
                System.out.println(i + "  - добавил в конец  " + deque.getLast());
            }
            System.out.println("Размер дека  =  " + deque.size());
        }

        while(!deque.isEmpty()){
            System.out.println(deque.removeLast());
        }

        System.out.println("Вывод:");
        System.out.println(deque);
        System.out.println(deque.size());

    }
}
package ru.borodin.test19;

import java.util.*;
import java.util.stream.Collectors;

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
        dequeRealization();
//        queueRealization();
    }

    public static void queueRealization() {
        Scanner scanner = new Scanner( System.in );

        Queue<Integer> queue = Arrays.stream( scanner.nextLine()
                        .trim()
                        .split( " " ) )
                .map( Integer::parseInt )
                .collect( Collectors.toCollection(ArrayDeque::new) );

        int size = queue.size();
        for (int i = 0; i < size; i++) {
            if (i % 2 == 0) {
                queue.poll();
            } else {
                queue.add( queue.poll() );
            }
        }
        System.out.println(queue);

        reversePrint( queue );
        System.out.println();
    }

    private static void reversePrint(Queue<Integer> queue) {
        int tmp = queue.remove();
        if (!queue.isEmpty()) {
            reversePrint( queue );
        }
        System.out.print(tmp + " ");
    }

    public static void dequeRealization() {

        Scanner scanner = new Scanner( System.in );

        Deque<Integer> deque = Arrays.stream( scanner.nextLine()
                        .trim()
                        .split( " " ) )
                .map( Integer::parseInt )
                .collect( Collectors.toCollection(ArrayDeque::new) );

        int size = deque.size();
        for (int i = 0; i < size; i++) {
            if (i % 2 == 0) {
                deque.poll();
            } else {
                deque.add( deque.poll() );
            }
        }
        System.out.println(deque);

        while(!deque.isEmpty()){
            System.out.print(deque.removeLast() + " ");
        }
        System.out.println();
    }
}
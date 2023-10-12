package ru.borodin.test18;

import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/*
* Написать метод, добавляющий 500 тыс. элементов в ArrayList и LinkedList.
* Написать еще один метод, выбирающий из каждого из заполненных списков элемент наугад 100 тыс. раз.
* Замерить время, которое потрачено на это. Сравнить результаты.
* */
public class Main {
    public static void main(String[] args) {

        int N = 500000;
        int M = 100000;

        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();

        Instant startAddArrayList = Instant.now();
        add500_000Elems( arrayList );
        Instant endAddArrayList = Instant.now();

        Instant startAddLinkedList = Instant.now();
        add500_000Elems( linkedList );
        Instant endAddLinkedList = Instant.now();


        Instant startGetArrayList = Instant.now();
        get100_000RandomElems( arrayList );
        Instant endGetArrayList = Instant.now();

        Instant startGetLinkedList = Instant.now();
        get100_000RandomElems( linkedList );
        Instant endGetLinkedList = Instant.now();

        System.out.println("Время добавления элементов в ArrayList = "
                + Duration.between(startAddArrayList, endAddArrayList).toMillis());
        System.out.println("Время добавления элементов в LinkedList = "
                + Duration.between(startAddLinkedList, endAddLinkedList).toMillis());
        System.out.println("Время получения элементов в ArrayList = "
                + Duration.between(startGetArrayList, endGetArrayList).toMillis());
        System.out.println("Время получения элементов в LinkedList = "
                + Duration.between(startGetLinkedList, endGetLinkedList).toMillis());

    }

    public static void add500_000Elems(List<Integer> list ) {
        for(int i = 0; i < 500_000; i ++) {
            list.add(3 + (int) ( Math.random() * 100 )) ;
        }
    }

    public static int[] get100_000RandomElems(List<Integer> list) {
        final int M = 100_000;
        final int N = list.size();

        int[] resultArr = new int[M];

        for(int i = 0; i < M; i++){
            resultArr[i] = list.get( (int)(Math.random() * N) );
        }

        return resultArr;
    }
}
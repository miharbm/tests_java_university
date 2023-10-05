package ru.borodin.test18;

import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.LinkedList;

/*
* Написать метод, добавляющий 500 тыс. элементов в ArrayList и LinkedList.
* Написать еще один метод, выбирающий из каждого из заполненных списков элемент наугад 100 тыс. раз.
* Замерить время, которое потрачено на это. Сравнить результаты.
* */
public class Main {
    public static void main(String[] args) {

        int N = 500000;
        int M = 100000;

        ArrayList<Integer> arr = new ArrayList<>();

        Instant start = Instant.now();
        for(int i = 0; i < N; i ++) {
          arr.add(3 + (int) ( Math.random() * 100 )) ;
        }

        int[] arr2 = new int[M];


//        Instant start = Instant.now();

        for(int i = 0; i < M; i++){
          arr2[i] = arr.get( (int)(Math.random() * N) );
        }


        Instant finish = Instant.now();
        long elapsed = Duration.between(start, finish).toMillis();

        System.out.println("Прошло времени, мс: " + elapsed);

        LinkedList<Integer> arr4 = new LinkedList<>();

         start = Instant.now();
        for(int i = 0; i < N; i ++) {
            arr4.add(3 + (int) ( Math.random() * 100 )) ;
        }

        int[] arr3 = new int[M];


//        Instant start = Instant.now();

        for(int i = 0; i < M; i++){
            arr3[i] = arr4.get( (int)(Math.random() * N) );
        }


        finish = Instant.now();
        elapsed = Duration.between(start, finish).toMillis();

        System.out.println("Прошло времени, мс: " + elapsed);

    }
}
package ru.borodin.test22_23;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

//Здесь помимо задачи 22 еще задача 23

/*
* 22. Написать метод, принимающий массив элементов типа T и возвращающий Map<T, Integer>,
* где ключ — элемент из массива, а значение — количество вхождений этого элемента в массив.
*
* 23. Написать метод, принимающий Map<T, R> и возвращающий Map, где ключи и значения поменялись местами.
* Учесть случай, когда в исходном Map разным ключам соответствуют одинаковые значения.
* */


public class Main {
    public static void main(String[] args) {

        Integer[] arr1 = {1, 5, 7, 4, 23, 1, 7, 1, 666, 123, 1};

        Map<Integer, Integer> map1 = mapOfArray(arr1);
        Map<Integer, ArrayList<Integer>> map2 = mapSwap(map1);

        System.out.println(map1);
        System.out.println(map2);

    }


    static <T> Map<T,Integer> mapOfArray(T[] arr){

        Map<T, Integer> map = new HashMap<>();

        for (T t : arr) {
            if (map.containsKey(t)) {
                map.put(t, map.get(t) + 1);
            } else {
                map.put(t, 1);
            }
        }

        return map;
    }

    static <T, R> Map<R,ArrayList<T>> mapSwap(Map<T, R> mapIn){

        Map<R, ArrayList<T>> mapOut = new HashMap<>();

        Set<Map.Entry<T, R>> entries = mapIn.entrySet();

        for(Map.Entry<T, R> pair: entries) {
            if (!mapOut.containsKey(pair.getValue())) {
                mapOut.put( pair.getValue(), new ArrayList<>() );
            }
            mapOut.get( pair.getValue() ).add( pair.getKey() );
        }

        return mapOut;
    }
}
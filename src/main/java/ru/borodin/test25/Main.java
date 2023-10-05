package ru.borodin.test25;

import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

/*
* Написать программу, выводящую 10 (или сколько есть) наиболее часто встречающихся слов (без учета регистра) из текста,
* введённого в консоль. Словом считается любая непрерывная последовательность букв и цифр.
* Если в тексте некоторые слова имеют одинаковую частоту, то дополнительно упорядочить их в лексикографическом порядке.
*
* Пример ввода 1:
* Мама мыла-мыла-мыла раму!
* Вывод:
* мыла
* мама
* раму
*
* Пример ввода 2:
* Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed sodales consectetur purus at faucibus. Donec mi quam, tempor vel ipsum non, faucibus suscipit massa. Morbi lacinia velit blandit tincidunt efficitur. Vestibulum eget metus imperdiet sapien laoreet faucibus. Nunc eget vehicula mauris, ac auctor lorem. Lorem ipsum dolor sit amet, consectetur adipiscing elit. Integer vel odio nec mi tempor dignissim.
* Вывод:
* consectetur
* faucibus
* ipsum
* lorem
* adipiscing
* amet
* dolor
* eget
* elit
* mi
*
* (Требование: решить с использованием Stream API
* Указание: Не использовать циклы и условные операторы, решить, не разрывая цепочку методов стрима)
* */

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        Arrays.stream( in.nextLine()
                        .trim()
                        .toLowerCase()
                        .replaceAll( "\\p{Punct}", "" ).split( " " ) )
                .collect(Collectors.groupingBy(s -> s, Collectors.counting()))
                .entrySet()
                .stream()
                .sorted( Map.Entry
                        .<String,Long>comparingByValue()
                        .reversed()
                        .thenComparing( Map.Entry::getKey ) )
                .limit( 10 )
                .map( Map.Entry::getKey )
                .forEach( System.out::println );

    }
}
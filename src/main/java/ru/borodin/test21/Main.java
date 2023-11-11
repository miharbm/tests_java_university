package ru.borodin.test21;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

/*
* Написать метод, позволяющий убрать из заданного массива произвольного типа лишние элементы.
* Продемонстрировать работу этого метода на массивах различных типов.
* (Указание: воспользоваться функциональным интерфейсом Function<T, R>)
* */

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> arr1 = new ArrayList<>();
        arr1.add( 1 );
        arr1.add( 2 );
        arr1.add( 3 );
        arr1.add( 3 );
        arr1.add( 3 );
        arr1.add( 4 );
        arr1.add( 5 );
        arr1.add( 6 );
        arr1.add( 7 );

        Collection<Integer> arrCLear1 = deleteSuperfluous( arr1, (x) -> x % 2 == 0  ).apply( arr1 );
        arrCLear1.forEach( System.out::println );

        System.out.println("------");

        Collection<Integer> arrCLear2 = deleteSuperfluous( arr1, (x) -> x  == 3  ).apply(arr1);
        arrCLear2.forEach( System.out::println );
    }

    public static <T> Function<Collection<T>, Collection<T>> deleteSuperfluous (Collection<T> array, Predicate<T> predicate) {
        return (z) -> {
            Collection<T> resultCol = new ArrayList<>();
            for (T x : array) {
                if (predicate.test(x)) {
                    resultCol.add( x );
                }
            }
            return resultCol;
        };

    }
}

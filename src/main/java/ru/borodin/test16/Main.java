package ru.borodin.test16;

import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;

/*
* Реализовать метод, который на вход получает коллекцию объектов, а возвращает коллекцию без дубликатов.
* Порядок элементов исходной коллекции должен сохраняться.
* */


public class Main {
    public static void main(String[] args) {



    }

    public <E> Collection<E> removeDuplicates (Collection<E> col) {

        return new LinkedHashSet<>(col);
    }
}
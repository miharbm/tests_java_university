package ru.borodin.test10;

/*
* Реализовать абстрактные классы и интерфейсы, а также наследование и полиморфизм для следующих классов:
* interface Транспортное Средство ← abstract class Общественный Транспорт ← class Трамвай.
*/

public class Main {
    public static void main(String[] args) {
        System.out.println( "Hello world!" );
        PublicTransport p = new PublicTransport(78) {
            @Override
            public int move() {
                return 0;
            }
        };
    }
}
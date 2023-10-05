package ru.borodin.test11_12_13;

public class Car {

    private int fuelLitres = 0;
    private boolean fastenedAll = false;

    public void move() throws CarIsNotReadyException {

        System.out.println( Main.getCallerClassAndMethodName());

        if (fuelLitres > 0 && fastenedAll) {
            System.out.println("движется");
        } else {
            throw new CarIsNotReadyException("тачка не готова");
        }


    }

    public Car(int litres, boolean fastened) {
        this.fastenedAll = fastened;
        this.fuelLitres = litres;
    }
}


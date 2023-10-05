package ru.borodin.test11_12_13;

public class CarIsNotReadyException extends RuntimeException {

    public CarIsNotReadyException(String massage) {

        super(massage);
    }
}

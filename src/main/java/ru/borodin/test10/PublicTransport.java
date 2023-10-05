package ru.borodin.test10;

public abstract class PublicTransport implements Vehicle {

    int local;

    public PublicTransport(int local) {
        this.local = local;
    }

    @Override
    public abstract int move();
}

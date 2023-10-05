package ru.borodin.test10;

public class Tram extends PublicTransport{

    public Tram(int local) {
        super( local );
    }

    @Override
    public int move() {
        return 0;
    }
}

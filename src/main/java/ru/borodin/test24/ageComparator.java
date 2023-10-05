package ru.borodin.test24;

import java.util.Comparator;

public class ageComparator implements Comparator<User> {


    @Override
    public int compare(User a, User b) {

        return Integer.compare(a.getAge(), b.getAge());
    }
}

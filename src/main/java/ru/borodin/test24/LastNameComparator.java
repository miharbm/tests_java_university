package ru.borodin.test24;

import java.util.Comparator;

public class LastNameComparator implements Comparator<User> {


    @Override
    public int compare(User a, User b) {

        return a.getLastName().toUpperCase().compareTo(b.getLastName().toUpperCase());
    }
}

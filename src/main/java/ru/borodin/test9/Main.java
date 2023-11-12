package ru.borodin.test9;

public class Main {
    public static void main(String[] args) {

        Student s1 = new Student("s1", "s11", 5.0);
        Student s2 = new Student("s1", "s11", 4.0);
        System.out.println("s1 scholarship = " + s1.getScholarship());
        System.out.println("s2 scholarship = " + s2.getScholarship());
        PostGraduateStudent p1 = new PostGraduateStudent("p1", "p11", 5.0);
        PostGraduateStudent p2 = new PostGraduateStudent("p2", "p22", 4.0);
        System.out.println("p1 scholarship = " + p1.getScholarship());
        System.out.println("p2 scholarship = " + p2.getScholarship());
    }
}




package ru.borodin.test15;

import java.util.ArrayList;
import java.util.List;


/*
* Создать класс Student, содержащий следующие характеристики – имя, группа, курс, оценки по предметам.
* Создать коллекцию, содержащую объекты класса Student.
* Написать метод, который удаляет студентов со средним баллом < 3.
* Если средний балл >= 3, студент переводится на следующий курс.
* Реализовать метод printStudents(List<Student> students, int course), который получает список студентов и номер курса
* и выводит в консоль имена тех студентов из списка, которые обучаются на данном курсе.
* */

public class Main {
    public static void main(String[] args) {

        String[] subjects = {"math", "history", "PE"};

        List<Student> students = new ArrayList<>();

        students.add( new Student( "name1", "surname1", 1, "1", 1, subjects ) );
        students.add( new Student( "name2", "surname2", 2, "1", 4, subjects ) );
        students.add( new Student( "name5", "surname5", 1, "1", 3, subjects ) );
        students.add( new Student( "name6", "surname6", 2, "1", 3, subjects ) );

        for (Student student : students) {
            student.setMarks();
        }

        System.out.println("Все студенты");
        students.forEach( System.out::println );

        System.out.println("Студенты на 3 курсе");
        printStudentsByCourse( students, 3 );


        deleteFailingStudents( students );

        System.out.println("Переведенные студенты");
        students.forEach( System.out::println );
    }

    public static void deleteFailingStudents(List<Student> students){

        for(int i = students.size()- 1; i > 0; i--){
            if (students.get(i).getAvrMark() < 3.0){
                students.remove(i);
            } else {
                students.get(i).setCourse(students.get(i).getCourse() + 1);
            }
        }

    }

    public static void printStudentsByCourse(List<Student> students, int course) {
        System.out.println("Студенты " + course + " курса");
        for (Student student : students) {
            if (student.getCourse() == course) {
                System.out.println(student.getFirstName() + " " + student.getSecondName());
            }
        }
    }
}

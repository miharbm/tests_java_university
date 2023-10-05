package ru.borodin.test15;

import java.util.List;


/*
* Создать класс Student, содержащий следующие характеристики – имя, группа, курс, оценки по предметам.
* Создать коллекцию, содержащую объекты класса Student.
* Написать метод, который удаляет студентов со средним баллом < 3.
* Если средний балл >= 3, студент переводится на следующий курс.
* Реализовать метод printStudents(List<Student> students, int course),который получает список студентов и номер курса
* и выводит в консоль имена тех студентов из списка, которые обучаются на данном курсе.
* */

public class Main {
    public static void main(String[] args) {


    }

    public void deleteFailingStudents(List<Student> students){

        for(int i = students.size()- 1; i > 0; i--){
            if (students.get(i).getAvrMark() < 3.0){
                students.remove(i);
            } else{
                students.get(i).setCourse(students.get(i).getCourse() + 1);
            }
        }

    }

    public void printStudents(List<Student> students, int course) {
        for (Student student : students) {
            if (student.getCourse() == course) {
                System.out.println(student.getFirstName() + student.getSecondName());
            }
        }
    }
}

package ru.borodin.test9;

public class PostGraduateStudent extends Student{

    public PostGraduateStudent(String name, String second_name, Double averageMark) {
        super( name, second_name, averageMark );
    }

    public int getScholarship() {
        if (this.getAverageMark().equals( 5.0 ) ) {
            return 150;
        } else {
            return 100;
        }
    }
}

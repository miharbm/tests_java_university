package ru.borodin.test9;

public class Student {
    private String name;
    private String second_name;

    private Double averageMark;


    public Student(String name, String second_name, Double averageMark) {
        this.name = name;
        this.second_name = second_name;
        this.averageMark = averageMark;
    }

    public int getScholarship() {
        if (averageMark.equals( 5.0 ) ) {
            return 80;
        } else {
            return 40;
        }
    }

    public String getName() {
        return name;
    }

    public String getSecond_name() {
        return second_name;
    }

    public Double getAverageMark() {
        return averageMark;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSecond_name(String second_name) {
        this.second_name = second_name;
    }

    public void setAverageMark(Double averageMark) {
        this.averageMark = averageMark;
    }
}

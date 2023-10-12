package ru.borodin.test15;

import java.util.*;

public class Student {

    private String firstName;
    private String secondName;
    private int    id;
    private String group;
    private int    course;
    private final  HashMap<String, Integer> marks = new HashMap<>();
    private double avrMark;


    public double getAvrMark() {

        if (this.avrMark == 0.0) {
            List<Integer> valueList = new ArrayList<>(marks.values());

            int sumOfMarks = 0;

            for(Integer value : valueList)
                sumOfMarks += value;

            this.avrMark = 1.0 * sumOfMarks / valueList.size();
        }

        return this.avrMark;
    }

    public Student( String firstName, String secondName,
                    int id, String group, int course,
                    String[] subjects) {

        this.setFirstName(firstName);
        this.setSecondName(secondName);
        this.setId(id);
        this.setGroup(group);
        this.setCourse(course);
        for (String subject : subjects) {
            this.marks.put(subject, 0);
        }
    }

    public void setMarks() {
        for(Map.Entry<String, Integer> entry: this.marks.entrySet()) {

            System.out.print(entry.getKey() + " = " );
            Scanner in = new Scanner(System.in);
            entry.setValue(in.nextInt());
        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                ", group='" + group + '\'' +
                ", course=" + course +
                ", marks=" + marks +
                ", avrMark=" + getAvrMark() +
                '}';
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }
}

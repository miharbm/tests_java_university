package ru.borodin.test24;

public class User {
    private int id;
    private String firstName;
    private String lastName;
    private int age;
    private String country;

    public User(int _id, String _firstName, String _lastName, int _age, String _country){
        this.id = _id;
        this.firstName = _firstName;
        this.lastName = _lastName;
        this.age = _age;
        this.country = _country;
    }

    @Override
    public String toString() {
        return id + " " + firstName + " " + lastName + " " + age + " " + country;
    }




    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}


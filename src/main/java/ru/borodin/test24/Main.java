package ru.borodin.test24;

import java.util.ArrayList;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
* Создать класс User, описывающий пользователя (необходимые поля: id, firstName, lastName, age, country).
* Создать список из некоторого количества пользователей.
* 1)      Вывести всех пользователей, отсортированных по lastName
* 2)      Вывести всех пользователей, отсортированных по age
* 3)      Проверить, что для всех пользователей age > 7
* 4)      Вычислить средний возраст всех пользователей
* 5) Вывести количество разных стран проживания (country) среди заданных пользователей
*
* (Требование: реализовать все пункты с использованием Stream API
* Указание: можно использовать аннотации Lombok)
* */

public class Main {
    public static void main(String[] args) {

        ArrayList<User> users = new ArrayList<>();

        users.add(new User(1, "Samuel", "Adamson", (int)(Math.random() * 92 + 8),"Russia"));
        users.add(new User(2, "Jack", "Aldridge", (int)(Math.random() *  92 + 8),"Germany"));
        users.add(new User(3, "Samuel", "Aldridge", (int)(Math.random() *  92 + 8),"Russia"));
        users.add(new User(4, "Joseph", "Johnson", (int)(Math.random() *  92 + 8),"France"));
        users.add(new User(5, "Harry", "Johnson", (int)(Math.random() *  92 + 8),"China"));
        users.add(new User(6, "Thomas", "Johnson", (int)(Math.random() *  92 + 8),"Russia"));
        users.add(new User(7, "George", "Johnson", (int)(Math.random() *  92 + 8),"Turkey"));
        users.add(new User(8, "Connor", "Ellington", (int)(Math.random() *  92 + 8),"Russia"));
        users.add(new User(9, "Olivia", "Smith", (int)(Math.random() *  92 + 8),"Norway"));
        users.add(new User(10, "Amelia", "Brown", (int)(Math.random() *  92 + 8),"France"));
        users.add(new User(11, "Emily", "Walker", (int)(Math.random() *  92 + 8),"Germany"));
        users.add(new User(12, "Jessica", "Harris", (int)(Math.random() *  92 + 8),"Turkey"));
        users.add(new User(13, "Isabella", "Lewis", (int)(Math.random() *  92 + 8),"Russia"));
        users.add(new User(14, "Lily", "King", (int)(Math.random() *  92 + 8),"Russia"));
        users.add(new User(15, "Scarlett", "Young", (int)(Math.random() *  92 + 8),"Germany"));

        for (User user : users) {
            System.out.println(user);
        }

        Stream<User> stream = users.stream();

        System.out.println("\nSORTED BY LAST NAME:");
        stream.sorted(new LastNameComparator()).forEach(System.out::println);

        System.out.println("\nSORTED BY AGE:");
        users.stream().sorted(new ageComparator()).forEach(System.out::println);

        if(users.stream().allMatch((user) -> user.getAge() > 7)){
            System.out.println("Все старше семи лет");
        }else{
            System.out.println("Не все старше семи лет");
        }

        System.out.println("Средний возраст = " + users.stream().mapToInt(User::getAge).average().orElse(0));

        Map<String,Integer> mapCountries = users.stream().collect(Collectors.toMap(User::getCountry,e -> 1, Integer::sum));
        System.out.println(mapCountries);
        System.out.println(users.stream().collect(Collectors.groupingBy(User::getCountry,Collectors.counting())));

        Set<String> setCountries = users.stream().map(User::getCountry).collect(Collectors.toSet());
        System.out.println("Количество стран = " + setCountries.size());

        System.out.println("Количество стран = " + users.stream().map(User::getCountry).distinct().count());


    }
}
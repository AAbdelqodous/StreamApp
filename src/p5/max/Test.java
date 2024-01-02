package p5.max;

import p1.stream.Gender;
import p1.stream.Person;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Test {
    public static void main(String[] args) {
        List<Person> people = getPeople();
        System.out.println("----------------- Max ---------------------");
        // Max
        people.stream()
                .max(Comparator.comparing(Person::getAge))
                .ifPresent(System.out::println);
        System.out.println("----------------- Min ---------------------");
        // Min
        people.stream()
                .min(Comparator.comparing(Person::getAge))
                .ifPresent(System.out::println);
        System.out.println("------------------ Group ---------------------");
        // Group
        Map<Gender, List<Person>> groupByGender = people.stream()
                .collect(Collectors.groupingBy(Person::getGender));
        groupByGender.forEach((gender, people1) -> {
            System.out.println(gender);
            people1.forEach(System.out::println);
            System.out.println("-----------------");
        });
    }

    private static List<Person> getPeople() {
        return List.of(
                new Person("Mohamed", 60, Gender.MALE),
                new Person("Amal", 58, Gender.FEMALE),
                new Person("Nora", 38, Gender.FEMALE),
                new Person("Ahmed", 36, Gender.MALE),
                new Person("Elsayed", 33, Gender.MALE),
                new Person("Nehal", 23, Gender.FEMALE),
                new Person("AMohamed", 8, Gender.MALE),
                new Person("Asiya", 2, Gender.FEMALE)
        );
    }
}

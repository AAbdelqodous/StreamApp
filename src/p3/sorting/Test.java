package p3.sorting;

import p1.stream.Gender;
import p1.stream.Person;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Test {
    public static void main(String[] args) {
        List<Person> people = getPeople();
        // Sorting
        List<Person> sorted = people.stream()
                .sorted(Comparator.comparing(Person::getAge).reversed())
                .toList();
//                .collect(Collectors.toList());
        sorted.forEach(System.out::println);
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

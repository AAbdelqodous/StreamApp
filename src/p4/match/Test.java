package p4.match;

import p1.stream.Gender;
import p1.stream.Person;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Test {
    public static void main(String[] args) {
        List<Person> people = getPeople();
        boolean anyMatch = people.stream()
                .anyMatch(person -> person.getAge() > 60);
        System.out.println("Anyone older than 60 year: " +anyMatch);

        boolean allMatch = people.stream()
                .allMatch(person -> person.getAge() > 1.5);
        System.out.println("All people older than 1.5 year: " +allMatch);

        boolean noneMatch = people.stream()
                .noneMatch(person -> person.getName().equals("Asia"));
        System.out.println("Asia none exist in people list: " +noneMatch);
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

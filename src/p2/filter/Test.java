package p2.filter;

import p1.stream.Gender;
import p1.stream.Person;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Test {
    public static void main(String[] args) {
        List<Person> people = getPeople();

        // Declarative approach
        // Filter
        List<Person> femalesF = people.stream()
                .filter(person -> person.getGender().equals(Gender.FEMALE))
                .collect(Collectors.toList()); // .toList();
        femalesF.forEach(System.out::println);
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

package p1.stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Test {
    public static void main(String[] args) {
        List<Person> people = getPeople();
        // Imperative approach
        List<Person> females = new ArrayList<>();
        for (Person person : people){
            if (person.getGender().equals(Gender.FEMALE)){
                females.add(person);
            }
        }
        females.forEach(System.out::println);

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

package streams;

import imperative.Gender;
import imperative.Person;

import java.util.List;
import java.util.stream.Collectors;

public class _Stream {
    private imperative.Person person;
    private imperative.Gender gender;

    public static void main(String[] args) {
        List<Person> people = List.of(
                new Person("John", Gender.MALE),
                new Person("Maria", Gender.FEMALE),
                new Person("Aisha", Gender.FEMALE),
                new Person("Alex", Gender.MALE),
                new Person("Bob", Gender.PREFER_NOT_TO_SAY),
                new Person("Alice", Gender.FEMALE));

        //Find Length of names in people
        people.stream()
                .map(Person::getName)
                .mapToInt(String::length)
                .forEach(System.out::println);

        //Find Gender in people
        people.stream()
                .map(Person::getGender)
                .collect(Collectors.toSet())
                .forEach(System.out::println);

        boolean allFemales = people.stream()
                .allMatch(person1 -> person1.getGender().equals(Gender.FEMALE));
        System.out.println(allFemales);
    }
}

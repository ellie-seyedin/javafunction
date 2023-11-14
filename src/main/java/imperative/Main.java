package imperative;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        List<Person> people = List.of(
                new Person("John", Gender.MALE),
                new Person("Maria", Gender.FEMALE),
                new Person("Aisha", Gender.FEMALE),
                new Person("Alex", Gender.MALE),
                new Person("Alice", Gender.FEMALE));

       //Imperative approach
        System.out.println("Imperative approach");
       List<Person> females = new ArrayList<>();
        for (Person person: people) {
            if (person.getGender().equals(Gender.FEMALE)) {
                females.add(person);
            }
        }
            for (Person female : females) {
                System.out.println(female);
            }

        //Declarative approach
        System.out.println("Declarative approach");

            people.stream().filter(person -> person.getGender().equals(Gender.FEMALE))
                    .collect(Collectors.toList()).forEach(System.out::println);
        }


}
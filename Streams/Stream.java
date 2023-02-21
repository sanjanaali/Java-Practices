package streams;

import java.text.CollationElementIterator;
import java.util.List;
import java.util.stream.Collectors;

import static streams.Stream.Gender.*;
public class Stream {

    public static void main(String[] args) {

        List<person> people = List.of(
                new person("John", MALE),
                new person("Maria", FEMALE),
                new person("Bob", MALE),
                new person("Alice", FEMALE),
                new person("Copper",PREFER_NOT_TO_SAY)
        );

        System.out.println("All Genders Are: ");
        people.stream()
                .map(person -> person.gender)
                .collect(Collectors.toSet())
                .forEach(System.out::println);

        System.out.println();
        System.out.println("All Names Are: ");

        people.stream()
                .map(person -> person.name)
                .collect(Collectors.toSet())
                .forEach(System.out::println);

        System.out.println();
        System.out.println("All Names Length Are:");

        people.stream()
                .map(person -> person.name)
                .mapToInt(String::length)
                .forEach(System.out::println);

        boolean containsOnlyFemales = people.stream()
                .allMatch(person -> FEMALE.equals(person.gender));

        System.out.println("Does it contain only females ?\n -"+containsOnlyFemales);

        boolean containsAnyFemales = people.stream()
                .anyMatch(person -> FEMALE.equals(person.gender));

        System.out.println("Does it contain any females ? \n -"+containsAnyFemales);

        boolean containsOther = people.stream()
                .noneMatch(person -> PREFER_NOT_TO_SAY.equals(person.gender));

        System.out.println("Does it contain  no other gender ?\n -"+containsOther);
    }

    static class person {
        private final String name;
        private final Gender gender;

        person(String name, Gender gender) {
            this.name = name;
            this.gender = gender;
        }

        @Override
        public String toString() {
            return "person{" +
                    "name='" + name + '\'' +
                    ", gender=" + gender +
                    '}';
        }
    }

    enum Gender{
        MALE,FEMALE, PREFER_NOT_TO_SAY;
    }

}

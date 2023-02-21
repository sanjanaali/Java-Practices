package Imperative;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static Imperative.Main.Gender.*;


public class Main {

    public static void main(String[] args) {

        List<person> people = List.of(
                new person("John", MALE),
                new person("Maria", FEMALE),
                new person("Bob", MALE),
                new person("Alice", FEMALE)
        );
        //Imperative approach
        System.out.println("Imperative approach");
        List<person> females = new ArrayList<>();

        for (person p : people) {
            if (FEMALE.equals(p.gender)) {
                females.add(p);

            }
        }

        for (person female : females) {
            System.out.println(female);
        }

        //Declarative approach
        System.out.println();
        System.out.println("Declarative approach");
        people.stream()
                .filter(person -> FEMALE.equals(person.gender))
                .collect(Collectors.toList())
                .forEach(System.out::println);

//        In declarative approach we can also print 3 other ways.
//        way 1:
//        people.stream()
//                .filter(person -> FEMALE.equals(person.gender))
//                .forEach(System.out::println);

//        way 2:
//        people.stream()
//                .filter(person -> FEMALE.equals(person.gender))
//                .toList()
//                .forEach(System.out::println);

//        way 3:

/*        List<person> females2 = people.stream()
                .filter(person -> FEMALE.equals(person.gender))
                .collect(Collectors.toList());
        females2.forEach(System.out::println); */

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
        MALE,FEMALE
    }
}

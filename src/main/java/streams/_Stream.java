package streams;

import imperative.Main;

import java.util.ArrayList;
import java.util.List;
import java.util.function.IntConsumer;
import java.util.function.ToIntFunction;
import java.util.stream.Collectors;

public class _Stream{
    public static void main(String[] args) {
        List<Person> people=List.of(
                new Person("John", Gender.Male),
                new Person("Meena", Gender.Female),
                new Person("Sam", Gender.Male)
        );

        ToIntFunction<String> length = String::length;
        IntConsumer println = System.out::println;
        people.stream().map(e->e.name)
                .mapToInt(length)
                .forEach(println);

        System.out.println(people.stream().allMatch(e->e.gender.equals(Gender.Female)));
        System.out.println(people.stream().anyMatch(e->e.gender.equals(Gender.Female)));
        System.out.println(people.stream().noneMatch(e->e.gender.equals(Gender.Transgender)));



    }
    static class Person{
        private final String name;
        private final Gender gender;

        public Person(String name, Gender gender) {
            this.name = name;
            this.gender = gender;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", gender=" + gender +
                    '}';
        }
    }
    enum Gender {
        Male,Female,Transgender
    }
    
}

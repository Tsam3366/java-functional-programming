package imperative;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Person> people=List.of(
                new Person("John",Gender.Male),
                new Person("Meena",Gender.Female),
                new Person("Sam",Gender.Male)
        );
        System.out.println("Imperative Approach");
        List<Person> personList=new ArrayList<>();
        for(Person p:people)
        {
            if(p.gender.equals(Gender.Female))
                personList.add(p);
        }
        for(Person female:personList)
            System.out.println(female);

        System.out.println("Declarative Approach");
        people.stream().filter(p->p.gender.equals(Gender.Female)).toList().forEach(System.out::println);


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
        Male,Female
    }
}

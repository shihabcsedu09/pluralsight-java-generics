package module8.a_type_inference;


import module8.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;

import static java.util.stream.Collectors.partitioningBy;

public class LambdaExamples {
    public static void main(String[] args) {
        final Person donDraper = new Person("Don Draper", 89);
        final Person peggyOlson = new Person("Peggy Olson", 75);
        final Person bertCooper = new Person("Bert Cooper", 100);

        Predicate<Person> isOld = person -> person.getAge() > 80;

        isOld.test(donDraper);

        List<Person> people = new ArrayList<>();
        people.add(donDraper);
        people.add(peggyOlson);
        people.add(bertCooper);

        Map<Boolean, List<Person>> oldAndYoungPeople = people.stream().collect(partitioningBy(isOld));


    }
}

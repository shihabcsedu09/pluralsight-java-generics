package module2;

import java.util.Arrays;

public class TheArrayProblem {
    public static void main(String[] args) {
        Person donDraper = new Person("Don Draper", 89);
        Person peggyOlson = new Person("Peggy Olson", 65);

        Person[] madMen = {donDraper, peggyOlson};

        System.out.println(Arrays.toString(madMen));

        madMen = add(new Person("Bert Cooper", 100), madMen);

        System.out.println(Arrays.toString(madMen));

        madMen = add(peggyOlson, madMen);

        System.out.println(Arrays.toString(madMen));
    }

    private static Person[] add(Person person, Person[] array) {
        final int length = array.length;
        Person[] people = Arrays.copyOf(array, array.length + 1);

        people[length] = person;
        return people;

    }
}

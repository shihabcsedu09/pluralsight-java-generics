package module2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListExamples
{
    public static void main(String[] args)
    {
        Person donDraper = new Person("Don Draper", 89);
        Person peggyOlson = new Person("Peggy Olson", 65);

        List<Person> madMan = new ArrayList<>();
        madMan.add(donDraper);
        madMan.add(peggyOlson);

        System.out.println(madMan);

        madMan.add(new Person("Bert Cooper", 100));

        System.out.println(madMan.get(1));

        for (Person person : madMan) {
            System.out.println(person);
        }


    }
}

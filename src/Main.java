import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Set<Person> personSet = new HashSet<>();
        personSet.add(new Person("Ion",23));
        personSet.add(new Person("Elena", 64));
        personSet.add(new Person("Andrei",86));
        personSet.add(new Person("Natalia", 29));

        for (Person person : personSet) {
            if (person.getAge() > 60) {
                System.out.println(person.toString());
            }

        }

    }
}
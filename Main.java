import company.beans.*;
import company.exceptions.*;
import company.implementations.*;
import company.interfaces.*;
import company.utils.*;

public class Main {

    public static void main(String[] args) {
        Person[] people = new Person[5];
        final int b = 10;
        Messenger messenger = new EmailMessenger();
        try {
            people[0] = new Person("Jan Kowalski", 30);
            people[1] = new Person("Anna Nowak", 25);
            people[2] = new Person("Piotr Zieliński", 40);
            people[3] = new Person("Marta Wiśniewska", 35);
            people[4] = new Person("Krzysztof Górski", 50);

            for (Person person : people) {
                int result = MathUtils.add(person.getAge(), b);
                messenger.sendMessage("Wynik dodania wieku " + person.getName() + " (" + person.getAge() + ") i " + b
                        + " wynosi: " + result);
            }
        } catch (InvalidAgeException e) {
            System.err.println("Błąd: " + e.getMessage());
        }
    }
}
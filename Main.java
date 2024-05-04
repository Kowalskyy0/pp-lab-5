import company.implementations.*;
import company.interfaces.*;
import company.utils.*;

public class Main {

    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        int sum = MathUtils.add(a, b);
        System.out.println("Suma: " + sum);

        Messenger messenger = new EmailMessenger();
        messenger.sendMessage("Suma " + a + " i " + b + " wynosi: " + sum);
    }
}
import company.implementations.*;
import company.interfaces.*;

public class Main {

    public static void main(String[] args) {
        Messenger messenger = new EmailMessenger();
        messenger.sendMessage("test");
    }
}
package UI;

import Models.Client;
import Models.User;

import java.util.ArrayList;

public class ClientUI extends BaseUI {

    public ClientUI(Client actCLient, ArrayList<User> users) {
        super(actCLient, users);
        menuLoop();
    }

    public void menuLoop() {
        menuText();
    }

    public void menuText() {
        System.out.println("Witaj: "
                + super.getActUser().getName() + "\t"
                + super.getActUser().getSurename() +
                "\nWybierz jaką czynność chcesz zrobic.");
        System.out.println("1:\tZobacz stan konta");
        System.out.println("2:\tZlec przelew");
        System.out.println("3:\tWez kredyt");

    }


}


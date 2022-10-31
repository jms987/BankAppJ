package UI;

import Models.User;
import Models.Worker;

import java.util.ArrayList;

public class WorkerUI extends BaseUI {
    public WorkerUI(Worker worker, ArrayList<User> users) {
        super((Worker) worker, users);
    }

    public void menuLoop() {

    }

    public void menuText() {
        System.out.println("Witaj: "
                + super.getActUser().getName() + "\t"
                + super.getActUser().getSurename()
                + "\nWybierz jaką czynność chcesz zrobic.");
        System.out.println("1:\tZobacz stan konta klienta");
        System.out.println("2:\tZlec przelew z konta klienta");
        System.out.println("3:\tDaj kredyt klientowi");
        System.out.println("4:\tWplac pieniadze na konto klienta");
        System.out.println("5:\tWyplac pieniadze z konta klienta");
        System.out.println("6:\tDodaj klienta");
        System.out.println("7:\tUsun klienta");
        System.out.println("8:\tDodaj pracownika");
        System.out.println("9:\tUsun pracownika");
    }
}


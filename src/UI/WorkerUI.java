package UI;

import Models.User;
import Models.Worker;

import java.util.ArrayList;

public class WorkerUI extends BaseUI {

    private Worker actWorker;
    public WorkerUI(Worker worker, ArrayList<User> users) {
        super(users);
    }

    public void menuLoop() {
        int choice = 0;

        if(choice == 0)
        {
            seeClientAccount();
        }
        else if (choice == 1)
        {
            makeClientTransaction();
        }
        else if (choice == 2)
        {
            giveClientCredit();
        }
        else if (choice == 3)
        {
            makeClientIncome();
        }
        else if (choice == 4)
        {
            makeClientPayout();
        }
        else if (choice == 5)
        {
            addClient();
        }
        else if (choice == 6)
        {
            deleteClient();
        }
        else if (choice == 7)
        {
            addWorker();
        }
        else if (choice == 8)
        {
            deleteWorker();
        }
        else if (choice == 9)
        {
            //break;
        }
    }

    public void menuText() {
        System.out.println("Witaj: "
                + actWorker.getName() + "\t"
                + actWorker.getSurename()
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

    public void seeClientAccount()
    {
        
    }

    public void makeClientTransaction()
    {}

    public void giveClientCredit()
    {

    }

    public void makeClientIncome()
    {

    }

    public void makeClientPayout()
    {

    }

    public void addClient()
    {

    }

    public void deleteClient()
    {

    }

    public void addWorker()
    {

    }

    public void deleteWorker()
    {

    }

}


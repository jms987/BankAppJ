package UI;

import Models.Client;
import Models.Credit;
import Models.Transfer;
import Models.User;

import java.util.ArrayList;
import java.util.Date;

public class ClientUI extends BaseUI {
    private Client actCLient;

    public ClientUI(Client actCLient, ArrayList<User> users) {
        super(users);
        this.actCLient = actCLient;
        menuLoop();
    }

    public void menuLoop() {
        menuText();
        int choice = 2;

        if (choice == 0) {
            seeAccount();
        } else if (choice == 1) {
            MakeTransactionUI();
        } else if (choice == 2) {
            takeCreditUI();
        }

    }

    public void menuText() {
        System.out.println("Witaj: "
                + actCLient.getName() + "\t"
                + actCLient.getSurename() +
                "\nWybierz jaką czynność chcesz zrobic.");
        System.out.println("1:\tZobacz stan konta");
        System.out.println("2:\tZlec przelew");
        System.out.println("3:\tWez kredyt");
        System.out.println("4:\tSplac kredyt");
    }

    public void seeAccount() {
        System.out.println("Stan twojego konta o numerze:\t" + actCLient.getNumberofAccount() +
                ", wynosi:\t" + actCLient.getBalance());

    }

    public void takeCreditUI() {
        actCLient.addTransfer(new Transfer(2, 1, 100, new Date(122, 10, 5)));
        actCLient.addTransfer(new Transfer(2, 3, 100, new Date(122, 9, 5)));
        actCLient.addTransfer(new Transfer(2, 1, 100, new Date(122, 8, 5)));
        actCLient.addTransfer(new Transfer(2, 3, 100, new Date(122, 10, 5)));
        actCLient.addTransfer(new Transfer(2, 1, 100, new Date(122, 9, 5)));
        actCLient.addTransfer(new Transfer(2, 3, 100, new Date(122, 8, 5)));
        actCLient.addTransfer(new Transfer(2, 1, 100, new Date(122, 7, 5)));
        actCLient.addTransfer(new Transfer(2, 3, 100, new Date(122, 6, 5)));
        actCLient.addTransfer(new Transfer(2, 1, 100, new Date(122, 5, 5)));
        actCLient.addTransfer(new Transfer(2, 3, 100, new Date(122, 4, 10)));
        actCLient.addTransfer(new Transfer(2, 1, 100, new Date(122, 4, 9)));
        actCLient.addTransfer(new Transfer(2, 3, 100, new Date(122, 4, 1)));

        System.out.print("Na jak dlugi okres chcesz wziać kredyt? Podaj w pelnych miesiacach:\t");
        int months = 6;
        int limit = actCLient.calculateCredit(months);
        System.out.println("Twoja maksymalna do uzyskania kwota to:\t" + limit);
        System.out.println("Jaka kwote chcesz uzyskac?:\t");
        int moneyAmount = 1000;

        boolean result = takeCredit(moneyAmount, months, limit);
        if(result)
        {
            System.out.println("Udzieliliśmy prawidlowo kredtytu. Dziekujemy za skorzystanie uslug naszego banku.");
        }
        else {
            System.out.println("Przykro mi, nie posiadasz wystarczajacej zdolnosci by dostac kredyt o " +
                    "okreslonych parametrach");
        }

    }

    public void MakeTransactionUI() {
        System.out.print("Wpisz numer konta:\t");
        int numberofAccountOut = 1;
        System.out.print("Wpisz kwote jaka chcesz przelac:\t");
        float balance = 1.0f;
        if (makeTransaction(balance, numberofAccountOut)) {
            System.out.print("Przelew został wykonany poprawnie");
        } else {
            System.out.println("Przykro mi ale nie możemy wykonać zleconego przelewu");
        }
    }

    public boolean makeTransaction(float balance, int account_number) {
        if (balance > actCLient.getBalance()) {
            return false;
        } else {
            Client nextClient = null;
            for (Client c : super.getClients()) {
                if (c.getNumberofAccount() == account_number) {
                    nextClient = c;
                }
            }

            if (nextClient == null) {
                return false;
            }

            Transfer t = new Transfer(account_number, actCLient.getNumberofAccount(), balance);
            nextClient.addTransfer(t);
            actCLient.addTransfer(t);
        }

        return true;
    }

    public boolean takeCredit(int moneyAmount, int months, int limit) {
        if (moneyAmount > limit) {
            return true;
        } else {
            ArrayList<Credit> credits = actCLient.getCredits();
            if (credits.size() == 0) {
                Credit c = new Credit(0, Float.valueOf(moneyAmount), months, 20.0f);
                actCLient.addCredit(c);
                return true;
            } else {
                float sum = 0;
                int highest = 0;
                for (Credit c : credits) {
                    sum += (c.getBaseValue() / c.getNumberofrepayment());
                    if (highest < c.getNumber()) {
                        highest = c.getNumber();
                    }
                }
                if ((sum + moneyAmount / months) < limit) {
                    Credit c = new Credit((highest +1),moneyAmount,months,20.0f);
                    actCLient.addCredit(c);
                    return true;
                }
            }
        }
        return false;
    }

}


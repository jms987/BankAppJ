package UI;

import Models.Client;
import Models.Transfer;
import Models.User;

import java.util.ArrayList;

public class ClientUI extends BaseUI {
    private Client actCLient;
    public ClientUI(Client actCLient, ArrayList<User> users) {
        super(users);
        this.actCLient = actCLient;
        menuLoop();
    }

    public void menuLoop() {
        menuText();
        int choice = 0;

        if(choice==0)
        {
            seeAccount();
        }
        else if(choice==1)
        {
            MakeTransactionUI();
        }
        else if(choice==2)
        {
            takeCredit();
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
    }

    public void seeAccount()
    {
        System.out.println("Stan twojego konta o numerze:\t"+actCLient.getNumberofAccount()+
                ", wynosi:\t"+actCLient.getBalance());

    }

    public void MakeTransactionUI()
    {
        makeTransaction(1,1);
    }

    public boolean makeTransaction(float balance,int account_number)
    {
        if(balance>actCLient.getBalance())
        {
            return false;
        }
        else
        {
            Client nextClient = null;
            for(Client c : super.getClients())
            {
                if(c.getNumberofAccount() == account_number)
                {
                    nextClient = c;
                }
            }

            if(nextClient ==null)
            {
                return false;
            }

            Transfer t = new Transfer(actCLient.getNumberofAccount(),account_number,balance);
            nextClient.addTransfer(t);
            actCLient.addTransfer(t);
        }

    return true;
    }

    public void takeCredit()
    {

    }

}


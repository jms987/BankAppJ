package Models;

import java.util.ArrayList;
import java.util.Date;

public class Client extends User{
    private long NumberofAccount;
    private float Balance;
    private ArrayList<Credit> Credits;
    private ArrayList<Transfer> History;
    private Date BornDate;

    public Client(String name, String surename, String login,String password, long numberofAccount, Date bd) {
        super(name, surename, login,password);
        NumberofAccount = numberofAccount;
        Balance = 0;
        History = new ArrayList<Transfer>();
        Credits = new ArrayList<Credit>();
        BornDate = bd;
    }

    public Client(String name, String surename, String login, long numberofAccount, String password,
                  ArrayList<Transfer> h,ArrayList<Credit> c, float b, Date bd) {
        super(name, surename, login,password);
        NumberofAccount = numberofAccount;
        Balance = b;
        History = h;
        Credits = c;
        BornDate = bd;
    }

    public Client() {
        super();
    }

    public void deposit(float in) {
        Balance += in;
    }

    public boolean payout(float out) {
        if (out > Balance) {
            Balance -= out;
            return true;
        }
        return false;
    }

    public void addTransfer(Transfer transfer) {
        History.add(transfer);
        if(transfer.getNumberofAccountIn() == NumberofAccount)
        {
            Balance +=(transfer.getMoneyAmount());
        }
        else if(transfer.getNumberofAccountOut() == NumberofAccount)
        {
            Balance -=(transfer.getMoneyAmount());
        }
    }

    //Getters and Setters
    public boolean setPassword(String password) {
        if (password.length() > 8) {
            super.setPassword(password);
            return true;
        }
        return false;
    }

    public long getNumberofAccount() {
        return NumberofAccount;
    }

    public void setNumberofAccount(long numberofAccount) {
        NumberofAccount = numberofAccount;
    }

    public float getBalance() {
        return Balance;
    }

    public void setBalance(float balance) {
        this.Balance = balance;
    }

    public ArrayList<Credit> getCredits() {
        return Credits;
    }

    public void setCredits(ArrayList<Credit> credits) {
        this.Credits = credits;
    }

    public ArrayList<Transfer> getHistory() {
        return History;
    }

    public void setHistory(ArrayList<Transfer> history) {
        this.History = history;
    }

    public void addCredit(Credit credit) {
        Credits.add(credit);
    }


}

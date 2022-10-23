package Models;

import java.util.ArrayList;
import java.util.Date;

public class Client extends User{
    private long NumberofAccount;
    private float balance;
    private ArrayList<Credit> credits;
    private ArrayList<Transfer> history;
    private Date BornDate;

    public Client(String name, String surename, String login, long numberofAccount, Date bd) {
        super(name, surename, login,null);
        NumberofAccount = numberofAccount;
        balance = 0;
        history = new ArrayList<Transfer>();
        credits = new ArrayList<Credit>();
        BornDate = bd;
    }

    public Client(String name, String surename, String login, long numberofAccount, String password,
                  ArrayList<Transfer> h,ArrayList<Credit> c, float b, Date bd) {
        super(name, surename, login,password);
        NumberofAccount = numberofAccount;
        balance = b;
        history = h;
        credits = c;
        BornDate = bd;
    }

    public void deposit(float in) {
        balance += in;
    }

    public boolean payout(float out) {
        if (out > balance) {
            balance -= out;
            return true;
        }
        return false;
    }

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
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    public ArrayList<Credit> getCredits() {
        return credits;
    }

    public void setCredits(ArrayList<Credit> credits) {
        this.credits = credits;
    }

    public ArrayList<Transfer> getHistory() {
        return history;
    }

    public void setHistory(ArrayList<Transfer> history) {
        this.history = history;
    }

    public void addCredit(Credit credit) {
        credits.add(credit);
    }

    public void addTransfer(Transfer transfer) {
        history.add(transfer);
        if(transfer.getNumberofAccountIn() == NumberofAccount)
        {
            balance+=(transfer.getMoneyAmount());
        }
        else if(transfer.getNumberofAccountOut() == NumberofAccount)
        {
            balance-=(transfer.getMoneyAmount());
        }

    }
}

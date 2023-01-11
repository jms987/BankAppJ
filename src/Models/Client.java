package Models;

import java.util.ArrayList;
import java.util.Date;

public class Client extends User {
    private long NumberofAccount;
    private float Balance;
    private ArrayList<Credit> Credits;
    private ArrayList<Transfer> History;
    private Date BornDate;

    public Client(String name, String surename, String login, String password, long numberofAccount, Date birthDate) {
        super(name, surename, login, password);
        NumberofAccount = numberofAccount;
        Balance = 0;
        History = new ArrayList<Transfer>();
        Credits = new ArrayList<Credit>();
        BornDate = birthDate;
    }

    public Client(String name, String surename, String login, String password, long numberofAccount,
                  ArrayList<Transfer> history, ArrayList<Credit> credits, float balance, Date birthDate) {
        super(name, surename, login, password);
        NumberofAccount = numberofAccount;
        Balance = balance;
        History = history;
        Credits = credits;
        BornDate = birthDate;
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
        if (transfer.getNumberofAccountIn() == NumberofAccount) {
            Balance += (transfer.getMoneyAmount());
        } else if (transfer.getNumberofAccountOut() == NumberofAccount) {
            Balance -= (transfer.getMoneyAmount());
        }
    }

    public int calculateCredit(int creditPeriod) {
        Date actDate = new Date();
        //TODO: to check thise
        long sixMonths = (6 * 30 * 24 * 3600);
        sixMonths = sixMonths * 1000;
        actDate.setTime(System.currentTimeMillis() - sixMonths);
        actDate.setHours(0);
        actDate.setMinutes(0);
        actDate.setSeconds(0);
        float sum = 0;
        for (Transfer t : History) {
            if (t.getNumberofAccountIn() == NumberofAccount) {
                if (t.getDate().after(actDate)) {
                    sum = sum + t.getMoneyAmount();
                } else if ( t.getDate().getDate()==actDate.getDate() &&
                            t.getDate().getYear() == actDate.getYear() &&
                            t.getDate().getMonth() == actDate.getMonth()) {
                    sum = sum + t.getMoneyAmount();
                }
            }
        }
        Float wyn = sum / 12 * creditPeriod;
        return wyn.intValue();
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

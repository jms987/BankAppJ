package Models;

public class Client {
    private String Name;
    private String Surename;
    private String Login;
    private String Password;
    private long NumberofAccount;
    private float balance;

    public Client(String name, String surename, String login, long numberofAccount) {
        Name = name;
        Surename = surename;
        Login = login;
        Password = null;
        NumberofAccount = numberofAccount;
        balance = 0;
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

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getSurename() {
        return Surename;
    }

    public void setSurename(String surename) {
        Surename = surename;
    }

    public String getLogin() {
        return Login;
    }

    public void setLogin(String login) {
        Login = login;
    }

    public String getPassword() {
        return Password;
    }

    public boolean setPassword(String password) {
        if (password.length() > 8) {
            this.Password = password;
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
}

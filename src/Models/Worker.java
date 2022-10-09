package Models;

public class Worker {
    private String Name;
    private String Surename;
    private String Login;
    private String Password;

    public Worker(String name, String surename, String login) {
        Name = name;
        Surename = surename;
        Login = login;
        Password = null;
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
}

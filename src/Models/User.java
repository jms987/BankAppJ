package Models;

public abstract class User {
    private String Name;
    private String Surename;
    private String Login;
    private String Password;

    public User(String name, String surename, String login, String password) {
        Name = name;
        Surename = surename;
        Login = login;
        Password = password;
    }

    public User() {
        Name = null;
        Surename = null;
        Login = null;
        Password = null;
    }

    public boolean setPassword(String password) {
        Password = password;
        return true;
    }
    //Getters and Setters

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

}

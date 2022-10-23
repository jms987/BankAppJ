package Models;

import java.util.ArrayList;

public class Worker extends User{
    ArrayList<Client> Clients;
    public Worker(String name, String surename, String login) {
        super(name, surename, login,null);
    }

    public Worker (String name, String surename, String login, String password, ArrayList<Client> clients) {
        super(name, surename, login, password);
        Clients = clients;
    }

    public boolean setPassword(String password) {
        if (password.length() > 8) {
            super.setPassword(password);
            return true;
        }
        return false;
    }
}

package Models;

import java.util.ArrayList;

public class Worker extends User{
    ArrayList<Client> Clients;
    public Worker(String name, String surename, String login,String password) {
        super(name, surename, login,password);
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

    //Getters and Setters
    public ArrayList<Client> getClients() {
        return Clients;
    }

    public void setClients(ArrayList<Client> clients) {
        Clients = clients;
    }
}

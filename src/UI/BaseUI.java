package UI;

import Models.Client;
import Models.User;

import java.util.ArrayList;

public abstract class BaseUI {
    private ArrayList<User> Users;
private ArrayList<Client> Clients;
    public BaseUI(ArrayList<User> users) {
        this.Users = users;

    }

    public ArrayList<Client> getClients() {
        return Clients;
    }

    public void setClients(ArrayList<Client> clients) {
        Clients = clients;
    }

    public abstract void menuLoop();
    public abstract void menuText();

    public ArrayList<User> getUsers() {
        return Users;
    }

    public void setUsers(ArrayList<User> users) {
        this.Users = users;
    }
}

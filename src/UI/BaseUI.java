package UI;

import Models.Client;
import Models.User;
import Models.Worker;

import java.util.ArrayList;

public abstract class BaseUI {
    private User actUser;
    private ArrayList<User> Users;
    private ArrayList<Client> Clients;
    private ArrayList<Worker> Workers;

    public BaseUI(ArrayList<User> users) {
        this.Users = users;
        Clients = new ArrayList<Client>();
        Workers = new ArrayList<Worker>();
        Client c = new Client();
        for (int i = 0; i < Users.size(); i++) {
            if (Users.get(i).getClass() == c.getClass()) {
                Clients.add((Client) Users.get(i));
            } else {
                Workers.add((Worker) Users.get(i));
            }
        }
    }

    public void menuLoop() {

    }

    public ArrayList<Client> getClients() {
        return Clients;
    }

    public void setClients(ArrayList<Client> clients) {
        Clients = clients;
    }

    public ArrayList<Worker> getWorkers() {
        return Workers;
    }

    public void setWorkers(ArrayList<Worker> workers) {
        Workers = workers;
    }

    public ArrayList<User> getUsers() {
        return Users;
    }

    public void setUsers(ArrayList<User> users) {
        this.Users = users;
    }
}

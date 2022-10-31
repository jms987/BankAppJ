package UI;

import Models.Client;
import Models.User;

import java.util.ArrayList;

public abstract class BaseUI {
    private User actUser;
    private ArrayList<User> users;

    public BaseUI(User user, ArrayList<User> users) {
        this.actUser = user;
        this.users = users;
    }

    public void menuLoop()
    {

    }

    public User getActUser() {
        return actUser;
    }

    public void setActUser(User actUser) {
        this.actUser = actUser;
    }

    public ArrayList<User> getUsers() {
        return users;
    }

    public void setUsers(ArrayList<User> users) {
        this.users = users;
    }
}

package com.company;

import Models.*;
import UI.ClientUI;
import UI.WorkerUI;

import java.util.ArrayList;
import java.util.Date;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
	// write your code here
        ArrayList<User> users = new ArrayList<User>();
        users.add(new Client("Jan","Nowak","JN111","Haslo123",1,
                new Date(100,1,1)));
        users.add(new Client("Jan","Kowalski","Jk111","Haslo456",2,
                new Date(90,2,1)));
        users.add(new Client("Maria","Nowak","MN111","Haslo789",3,
                new Date(80,3,2)));
        users.add(new Worker("Andrzej","Zielinski","AZ111","PHaslo123"));
        users.add(new Worker("Marian","Zog","MZ111","PHaslo456"));

        ClientUI cl = new ClientUI( (Client) users.get(1),users);
        WorkerUI wi = new WorkerUI((Worker) users.get(3),users);
    }

}

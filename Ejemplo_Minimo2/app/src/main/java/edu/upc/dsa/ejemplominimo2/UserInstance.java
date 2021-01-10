package edu.upc.dsa.ejemplominimo2;

import edu.upc.dsa.ejemplominimo2.Models.*;

public class UserInstance
{
    private static UserInstance instance;
    private User user;

    private UserInstance() {
        this.user = null;
    }

    public static UserInstance getInstance() {
        if (instance == null)
            instance = new UserInstance();
        return instance;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}

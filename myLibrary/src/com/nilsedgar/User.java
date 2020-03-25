package com.nilsedgar;

import java.io.Serializable;
import java.util.ArrayList;

public class User implements Serializable {

    long serialVersionUID = 1;

    private String name;
    private String password = "password";

    ArrayList<Book> borrowedBooks = new ArrayList<>();

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }
}

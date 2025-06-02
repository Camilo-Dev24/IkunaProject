package org.surotec.ikunaproject.roll;

import java.util.Scanner;

public class User {

    //Atributos
    private String password;
    private String name;
    private String email;

    public User() {

    }

    public User(String email, String password, String name) {
        this.email = email;
        this.password = password;
        this.name = name;

    }

    public String getPassword() {
        return password;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

}

package org.surotec.ikunaproject.aplication;

import org.surotec.ikunaproject.roll.Admin;

import java.util.Scanner;

public class MenuAdmin {

    Admin admin = new Admin();

    public void showMenuAdmin(Scanner input, String email, String password) {
        if (admin.getEmail() != null && admin.getEmail().equals(email)
                && admin.getPassword() != null && admin.getPassword().equals(password)) {
            System.out.println("Bienvenido al sistema " + admin.getName());
        } else {
            System.out.println("Usuario Incorrecto");
        }
    }


}

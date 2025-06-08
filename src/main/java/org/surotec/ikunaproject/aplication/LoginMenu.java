package org.surotec.ikunaproject.aplication;

import java.util.Scanner;

public class LoginMenu {

    public void printMenu(Scanner input){

    boolean showMenu = true;
        while(showMenu){

        System.out.println("""
                ***Sistema digital del colectivo Ikuna ***
                Elija la opción de ingreso: 
                1-Ingresar como administrador
                2-Ingresar como cliente - Usuario
                3-Salir del programa
                """);
        int option = input.nextInt();
        input.nextLine();
        switch (option) {
            case 1 -> {
                MenuAdmin menuAdmin = new MenuAdmin();
                System.out.println("Ingrese el email: ");
                String email = input.nextLine();
                System.out.println("Ingrese la contraseña");
                String password = input.nextLine();
                menuAdmin.showMenuAdmin(input, email, password);
            }
            case 2 -> {
                MenuClient shohMenuClient = new MenuClient();
                shohMenuClient.clientMenu(input);
            }

            case 3 -> showMenu = false;
        }

    }
    }
}

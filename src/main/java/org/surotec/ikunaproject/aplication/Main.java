package org.surotec.ikunaproject.aplication;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        boolean salir = false;
        Scanner input = new Scanner(System.in);
        while (!salir){

        System.out.println("""
                ***Bienvenido al sistema digital del colectivo Ikuna ***
                Elija la opción de ingreso: 
                1-Ingresar como administrador
                2-Ingresar como cliente - Usuario
                3-Salir del programa
                """);
        int option = input.nextInt();
        input.nextLine();
        switch (option){
            case 1 -> {
                MenuAdmin menuAdmin = new MenuAdmin();
                System.out.println("Ingrese el email: ");
                String email = input.nextLine();
                System.out.println("Ingrese la contraseña");
                String password = input.nextLine();
                menuAdmin.showMenuAdmin( input, email, password);
            }
            case 2->{

            }

            case 3 -> salir = true;
        }



        }

    }
}

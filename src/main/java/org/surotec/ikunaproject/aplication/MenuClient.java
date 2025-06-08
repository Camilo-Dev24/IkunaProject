package org.surotec.ikunaproject.aplication;

import org.surotec.ikunaproject.roll.Client;
import org.surotec.ikunaproject.roll.User;

import java.util.Scanner;
import java.util.SortedMap;

public class MenuClient {
    Client client = new Client();

    public void clientMenu(Scanner input){
        System.out.println("Bienvenido a nuestro sistema para clientes. Elija la opción de su interes:");
        System.out.println("""
                                 1-Registrar mi usuario
                                 2-Ver servicios/productos
                                 3-Adquirir servicio/producto
                                 4-Ver mis compras
                                 5-Salir
                        """);
        int option = input.nextInt();
        input.nextLine();
        switch (option){
            case 1 ->{
                registerUser(input);
            }
        }

    }


    public void registerUser(Scanner input){
        String [] ArrayUsers = new String[5];
        Client user1 = new Client();
        System.out.println("Ingrese su nombre");
        user1.setName(input.nextLine());
        System.out.println("Ingrese su correo electronico");
        user1.setEmail(input.nextLine());
        System.out.println("Ingrese su contraseña");
        user1.setPassword(input.nextLine());
    }



    public void showMenuAdmin(Scanner input, String email, String password) {
        if (client.getEmail() != null && client.getEmail().equals(email)
                && client.getPassword() != null && client.getPassword().equals(password)) {
            System.out.println("Bienvenido al sistema " + client.getName() + "\n");
        } else {
            System.out.println("Usuario Incorrecto\n");
        }
    }

}

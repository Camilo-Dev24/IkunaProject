package org.surotec.ikunaproject.aplication;

import org.surotec.ikunaproject.roll.Admin;
import org.surotec.ikunaproject.roll.Client;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MenuAdmin {

    Admin admin = new Admin("ramon@gmail.com","Tula123","Ramon Colorado");

    public void menuAdmin(){
        if (admin.getEmail().equals("ramon@gmail.com") && admin.getPassword().equals("Tula123")){
            System.out.println("Bienvenido al sistema " + admin.getName());
        }else {
            System.out.println("Usuario Incorrecto");
        }
    }

    public Client[] seeClients(Client[] clients){
        return clients;
    }

}

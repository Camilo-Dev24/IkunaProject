package org.surotec.ikunaproject.roll;

public class Admin extends User{

    public Admin(String email, String password, String name) {
        super(email, password, name);
    }

    public void login(String email, String password){
        if (email != null){
            System.out.println("Bienvendio al sistema administrador " );
        }
        else {
            System.out.println("No está registrado como admin");
        }
    }
}

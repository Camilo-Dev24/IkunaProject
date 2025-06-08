package org.surotec.ikunaproject.roll;

public class Client extends User{

    private int phone;
    private int age;

    public Client( String email, String password, String name, int phone, int age ) {
        super( email, password, name);
        this.phone = phone;
        this.age = age;
    }
    public Client(){};

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void RegisterUser(Client client){
        if (client != null){
            System.out.println("El usuario ya existe");
        }else {
            System.out.println("Proporcione el correo y la contraseña ");
        }
    }

    public void viewPurchases(){

    }
}

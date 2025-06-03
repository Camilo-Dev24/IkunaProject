package org.surotec.ikunaproject.roll;

import org.surotec.ikunaproject.service.Product;

import java.util.Scanner;

public class Admin extends User{


    public Admin (String email, String password, String name) {
        super(email, password, name);
    }
    public Admin(){
        super("ramon@gmail.com","Tula123", "Ramon" );
    }



    /*public void login(String email, String password){
        if (email != null){
            System.out.println("Bienvendio al sistema administrador " );
        }
        else {
            System.out.println("No está registrado como admin");
        }
    }*/


    public Client[] seeClients(Client[] clients){
        return clients;
    }

    public void createProduct(Scanner input) {
        Product[] products = new Product[5];

        for (int i = 0; i < products.length; i++) {
            System.out.println("Ingrese el nombre del producto " + (i + 1) + "(o 'salir' para terminar el proceso)");
            String name = input.nextLine();
            if (name.equalsIgnoreCase("exit")) {
                break;
            }
            System.out.println("Enter de description");
            String description = input.nextLine();
            System.out.println("Enter the value");
            double value = Double.parseDouble(input.nextLine());

            products[i] = new Product(name, description, value);
        }
    }

    public void readProduct(Product[] products){
        for (int i=0; i<products.length;i++){
            if (products != null){
                Product product = new Product();
                System.out.println("Nombre: " + product.getName());
                System.out.println("Descripcion " + product.getDescription());
                System.out.println("Value " + product.getValue());
            }
        }
    }

    public void updateProduct(){

    }

    public void deleteProduct(){

    }

    public void viewPurchases(){

    }
}

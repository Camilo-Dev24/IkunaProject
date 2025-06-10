package org.surotec.ikunaproject.service;

import java.util.Scanner;

public class Ikuna {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        String emailAdmin = "Juan22@gmail.com", passwordAdmin = "juanito20";
        String[] userName = new String[10];
        String[] emailUser = new String[10];
        String[] password = new String[10];
        String[] phone = new String[10];
        boolean[] registrado = new boolean[10];

        //PRODUCTOS IKUNA
        String[] produtosIkuna = new String[10];
        produtosIkuna[0] = "Libretas artisticas";
        produtosIkuna[1] = "Obras en lienzo";
        produtosIkuna[2] = "Asesorias artisticas";
        produtosIkuna[3] = "Asesorias administrativas";
        produtosIkuna[4] = "Planeación de eventos";

        String[] descrProducIkuna = new String[10];
        descrProducIkuna[0] = "Libretas artisticas con diseños personalizados. Perfectas para realizar regalos";
        descrProducIkuna[1] = "Obra artistica realizada en lienzo(diseño unico y personalizado)";
        descrProducIkuna[2] = "Asesoria en diseño de piezas gráficas, diseño de obras en lienzo, dibujos";
        descrProducIkuna[3] = "Asesoria en el diseño y desarrollo de proyectos culturales";
        descrProducIkuna[4] = "Planeación y organización logística de eventos culturales y artisticos";

        //double[] precioProductos = {40000.00, 700000.00, 300000.00, 250000.00, 800000.00};
        double[] precioProductos = new double[10];
        precioProductos[0] = 40000.00;
        precioProductos[1] = 700000.00;
        precioProductos[2] = 30000.00;
        precioProductos[3] = 250000.000;
        precioProductos[4] = 800000.00;

        String[][] comprasClientes = new String[10][10]; // compras por cliente
        int[] cantidadCompras = new int[10]; // cantidad de compras por cliente

        int op;
        do {
            System.out.println("------Bienvenido al sistema del colectivo Ikuna------");
            System.out.println("""
                    Ingresa la opción correspondiente de acuerdo a tu perfil:
                    1-Ingresar como administrador
                    2-Ingresar como usuario
                    3-Salir del sistema
                    """);
            op = entrada.nextInt();
            entrada.nextLine();
            switch (op) {
                //MENU DEL ADMINISTRADOR
                case 1 -> {
                    System.out.println("Ingrese su correo electronico de administrador");
                    String correo = entrada.nextLine();
                    System.out.println("Ingrese su contraseña");
                    String password1 = entrada.nextLine();
                    if (correo.equalsIgnoreCase(emailAdmin) && password1.equals(passwordAdmin)) {
                        int menuAdmin;
                        do {
                            System.out.println("""
                                    **********Modulo Administrador*********
                                    1-Ver clientes
                                    2-Crear nuevos productos
                                    3-Listar productos existentes
                                    4-Actualizar productos
                                    5-Eliminar productos
                                    6-Ver compras de clientes
                                    7-Salir
                                    """);
                            menuAdmin = entrada.nextInt();
                            entrada.nextLine();
                            switch (menuAdmin) {
                                case 1 -> {
                                    System.out.println("Lista de clientes registrados:");
                                    for (int i = 0; i < userName.length; i++) {
                                        if (registrado[i]) {
                                            System.out.println((i + 1) + "- " + userName[i] + " - " + emailUser[i] + " - " + phone[i]);
                                        }
                                    }
                                }
                                case 2 -> {
                                    System.out.println("Ingrese nombre del nuevo producto:");
                                    String nuevoProducto = entrada.nextLine();
                                    System.out.println("Ingrese descripción del producto:");
                                    String nuevaDescripcion = entrada.nextLine();
                                    System.out.println("Ingrese precio del producto:");
                                    double nuevoPrecio = entrada.nextDouble();
                                    entrada.nextLine();
                                    for (int i = 0; i < produtosIkuna.length; i++) {
                                        if (produtosIkuna[i] == null) {
                                            produtosIkuna[i] = nuevoProducto;
                                            descrProducIkuna[i] = nuevaDescripcion;
                                            precioProductos[i] = nuevoPrecio;
                                            System.out.println("Producto creado exitosamente.");
                                            break;
                                        }
                                    }
                                }
                                case 3 -> {
                                    System.out.println("Lista de productos:");
                                    for (int i = 0; i < produtosIkuna.length; i++) {
                                        if (produtosIkuna[i] != null) {
                                            System.out.println((i + 1) + "- " + produtosIkuna[i] + " - $" + precioProductos[i]);
                                        }
                                    }
                                }
                                case 4 -> {
                                    System.out.println("Ingrese número del producto a actualizar:");
                                    int numProd = entrada.nextInt() - 1;
                                    entrada.nextLine();
                                    if (produtosIkuna[numProd] != null) {
                                        System.out.println("Ingrese nuevo nombre del producto:");
                                        produtosIkuna[numProd] = entrada.nextLine();
                                        System.out.println("Ingrese nueva descripción:");
                                        descrProducIkuna[numProd] = entrada.nextLine();
                                        System.out.println("Ingrese nuevo precio:");
                                        precioProductos[numProd] = entrada.nextDouble();
                                        entrada.nextLine();
                                        System.out.println("Producto actualizado.");
                                    } else {
                                        System.out.println("Producto no encontrado.");
                                    }
                                }
                                case 5 -> {
                                    System.out.println("Ingrese número del producto a eliminar:");
                                    int numProd = entrada.nextInt() - 1;
                                    entrada.nextLine();
                                    if (produtosIkuna[numProd] != null) {
                                        produtosIkuna[numProd] = null;
                                        descrProducIkuna[numProd] = null;
                                        precioProductos[numProd] = 0;
                                        System.out.println("Producto eliminado.");
                                    } else {
                                        System.out.println("Producto no encontrado.");
                                    }
                                }
                                case 6 -> {
                                    System.out.println("Compras realizadas por clientes:");
                                    for (int i = 0; i < userName.length; i++) {
                                        if (registrado[i]) {
                                            System.out.println("Cliente: " + userName[i]);
                                            for (int j = 0; j < cantidadCompras[i]; j++) {
                                                System.out.println("- " + comprasClientes[i][j]);
                                            }
                                        }
                                    }
                                }
                            }
                        } while (menuAdmin != 7);
                    } else {
                        System.out.println("Credenciales incorrectas.");
                    }
                }
                //MENU DEL USUARIO
                case 2 -> {
                    int menuUser;
                    int usuarioActual = -1;
                    do {
                        System.out.println("""
                                **********Modulo Clientes********
                                1-Registrarse
                                2-Ver productos y servicios
                                3-Comprar Productos/servicios
                                4-Ver mis compras
                                5-Salir
                                """);
                        menuUser = entrada.nextInt();
                        entrada.nextLine();
                        switch (menuUser) {
                            case 1 -> {
                                for (int i = 0; i < userName.length; i++) {
                                    if (!registrado[i]) {
                                        System.out.println("Ingrese nombre completo:");
                                        userName[i] = entrada.nextLine();
                                        System.out.println("Ingrese teléfono:");
                                        phone[i] = entrada.nextLine();
                                        System.out.println("Ingrese email:");
                                        emailUser[i] = entrada.nextLine();
                                        System.out.println("Ingrese contraseña:");
                                        password[i] = entrada.nextLine();
                                        registrado[i] = true;
                                        usuarioActual = i;
                                        System.out.println("Usuario registrado exitosamente.");
                                        break;
                                    }
                                }
                            }
                            case 2 -> {
                                for (int j = 0; j < produtosIkuna.length; j++) {
                                    if (produtosIkuna[j] != null) {
                                        System.out.println((j + 1) + "- " + produtosIkuna[j] + " $" + precioProductos[j]);
                                    }
                                }
                            }
                            case 3 -> {
                                if (usuarioActual == -1) {
                                    System.out.println("Debe registrarse primero.");
                                } else {
                                    System.out.println("Ingrese número del producto a comprar:");
                                    int prod = entrada.nextInt() - 1;
                                    entrada.nextLine();
                                    comprasClientes[usuarioActual][cantidadCompras[usuarioActual]++] = produtosIkuna[prod];
                                    System.out.println("Compra realizada.");
                                }
                            }
                            case 4 -> {
                                if (usuarioActual != -1) {
                                    System.out.println("Tus compras:");
                                    for (int j = 0; j < cantidadCompras[usuarioActual]; j++) {
                                        System.out.println("- " + comprasClientes[usuarioActual][j]);
                                    }
                                } else {
                                    System.out.println("Debes registrarte primero.");
                                }
                            }
                        }
                    } while (menuUser != 5);
                }
            } 
        } while (op != 3);
    }
}

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

        //PRODUCTOS IKUNA
        String[] produtosIkuna = {"Libretas artisticas", "Obras en lienzo", "Asesorias artisticas", "Asesorias administrativas", "Planeación de eventos"};

        String[] descrProducIkuna= new String [10];
        descrProducIkuna[0] = "Libretas artisticas con diseños personalizados. Perfectas para relizar regalos";
        descrProducIkuna[1] = "Obra artistica realizada en lienzo(diseño unico y personalziado)";
        descrProducIkuna[2] = "Asesoria en diseño de piezas gráficas, diseño de obras en lienzo, dibujos";
        descrProducIkuna[3]= "Asesoria en el diseño y desarrollo de proyectos culturales";
        descrProducIkuna[4] = "Planeación y organziación logistica de eventos culturales y artisticos";

        double[] precioProductos = {40000.00, 700000.00, 300000.00,250000.00,800000.00};


        int op;

        do {
            System.out.println("------Bienvenido al sistema del colectivo Ikuna. Aqui creemos que la cultura se construye entre todos------ ");
            System.out.println("""
                    Ingresa la opción correspondiente de acuerdo a tu perfil:
                    1-Ingresar como administrador
                    2-Ingresar como usuario
                    3-Salir del sistema
                    """);
             op = entrada.nextInt();
             entrada.nextLine();
            switch (op){
                //MENU DEL ADMINISTRADOR
                case 1->{
                    System.out.println("Ingrese su correo electronico de administrador");
                    String correo = entrada.nextLine();
                    System.out.println("Ingrese su contraseña");
                    String password1 =entrada.nextLine();
                    if (correo.equalsIgnoreCase(emailAdmin) && password1.equals(passwordAdmin)){
                        int menuAdmin;
                        do {
                        System.out.println("""
                                **********Bienvenido al sistema de administrador Colectivo Ikuna*********
                                A traves de este modulo encontra diferentes opciones. Seleccione la que se adapte a su necesidad\n
                                1-Ver clientes
                                2-Crear nuevos productos
                                3-Listar productos existentes
                                4-Actualizar productos
                                5-Eliminar productos
                                6-Ver compras de clientes
                                7-salir 
                                """);
                        menuAdmin = entrada.nextInt();
                        entrada.nextLine();
                        switch (menuAdmin){
                            case 1->{

                            }
                            case 2->{

                            }
                            case 3->{

                            }
                            case 4->{

                            }
                            case 5->{

                            }
                            case 6->{

                            }
                            case 7->{
                                menuAdmin =7;
                                System.out.println("Saliendo del menu clientes");
                            }
                            default -> System.out.println("Error al ingresar el dato");
                        }

                        }while (menuAdmin!=7);
                    } else {
                        System.out.println("No tiene credenciales para el modulo administrativo");
                    }
                }
                //MENU DEL USUARIO
                case 2->{
                    int menuUser;
                    do {
                    System.out.println("""
                            **********Bienvenido al modulo de clientes del Colectivo Ikuna********
                            Elija la opcion de su interes para obtenr más información
                            1-Registrarse
                            2-Ver productos y servicios
                            3-Comprar Productos/servicios
                            4-Ver mis compras
                            5-Salir
                            """);
                    menuUser = entrada.nextInt();
                    entrada.nextLine();

                    switch (menuUser){
                        case 1->{
                            for (int i=0;i<userName.length;i++){
                            System.out.println("""
                                    Para el registrar su usuario so necesarios los siguientes datos:
                                    A)Ingrese su nombre completo
                                    """);
                            userName[i] = entrada.nextLine();
                                System.out.println("Ingrese su numer de telefono");
                                phone[i] = entrada.nextLine();
                                System.out.println("Ingrese su email");
                                emailUser[i]=entrada.nextLine();
                                System.out.println("Ingrese la contraseña");
                                password[i] = entrada.nextLine();
                                i = userName.length +1; //salir del for
                            }
                            System.out.println("Usuario creado correctamente");
                        }
                        case 2->{
                            System.out.println("  En este modulo encontrará los servicios productos y servicios del Colectivo IKuna");
                            System.out.println("*****Listas productos***** ");
                            for (int j = 0; j<produtosIkuna.length; j++){
                                System.out.println(j+1 + "- PRODUCTO: " + produtosIkuna[j] + "\n" + "DESCRIPCION: " + descrProducIkuna[j] + "\n" + "PRECIO " +  precioProductos[j]);
                            }
                        }
                        case 3->{

                        }
                        case 4->{

                        }
                        case 5->{
                            menuUser = 5;
                            System.out.println("Saliendo del modulo clientes");
                        }
                    }

                    }while (menuUser!=5);


                }
                case 3->{
                    op = 3;
                    System.out.println("Saliendo del sistema del Colectivo Ikuna");
                }
                default -> System.out.println("EL valor ingresado no es valido\n");

            }

        }while (op!=3);

    }


}

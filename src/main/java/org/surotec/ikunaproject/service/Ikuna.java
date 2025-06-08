package org.surotec.ikunaproject.service;

import java.util.Scanner;

public class Ikuna {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        String emailAdmin = "Juan22@gmail.com", passwordAdmin = "juanito20";
        String[] userName = new String[10];
        String[] emailUser = new String[10];
        String[] phone = new String[10];
        String [] produtosIkuna = new String[10];
        String [] descrProducIkuna=new String[10];
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
                case 1->{
                    System.out.println("Ingrese su correo electronico de administrador");
                    String correo = entrada.nextLine();
                    System.out.println("Ingrese su contraseña");
                    String password1 =entrada.nextLine();
                    if (correo.equalsIgnoreCase(emailAdmin) && password1.equals(passwordAdmin)){
                        int menuUser;
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
                        menuUser = entrada.nextInt();
                        switch (menuUser){
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
                                menuUser =7;
                                System.out.println("Saliendo del menu clientes");
                            }
                            default -> System.out.println("Error al ingresar el dato");
                        }

                        }while (menuUser!=7);
                    } else {
                        System.out.println("No tiene credenciales para el modulo administrativo");
                    }
                }
                case 2->{
                    System.out.println("""
                            **********Bienvenido al modulo de clientes del Colectivo Ikuna********
                            Elija la opcion que de la cual necesita más información
                            """);

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

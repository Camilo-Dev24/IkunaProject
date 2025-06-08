package org.surotec.ikunaproject.aplication;

import java.util.Scanner;

public class Main  {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        LoginMenu showMenu = new LoginMenu();
        showMenu.printMenu(input);

    }


}

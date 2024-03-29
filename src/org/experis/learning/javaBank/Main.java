package org.experis.learning.javaBank;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Benvenuto!");
        System.out.println("Come ti chiami?");
        String name = scan.nextLine();
        System.out.println("Quanti soldi hai sul conto?");
        int moneyAvailable = Integer.parseInt(scan.nextLine());
        Conto conto1 = new Conto(name, moneyAvailable);

        System.out.println("Benvenuto " + conto1.getName());

        String response = "";
        while (!response.equalsIgnoreCase("esci")) {
            System.out.println("Scegli tra queste tre optioni: preleva, deposita, esci");
            response = scan.nextLine();
            if (response.equalsIgnoreCase("preleva")) {
                System.out.println("Quanti soldi vuoi prelevare?");
                int moneyToTake = Integer.parseInt(scan.nextLine());
                conto1.takeMoney(moneyToTake);
                System.out.println(conto1.getBalance());
            } else if (response.equalsIgnoreCase("deposita")) {
                System.out.println("Quanti soldi vuoi depositare?");
                int moneyToAdd = Integer.parseInt(scan.nextLine());
                conto1.addMoney(moneyToAdd);
                System.out.println(conto1.getBalance());
            } else if (!response.equalsIgnoreCase("esci")) {
                System.out.println("Inserisci una delle parole chiave: PRELEVA DEPOSITA ESCI");
            }
        }
        System.out.println("Grazie e arrivederci!!");


//        Conto contoFullConstructor = new Conto(23411,"asddfa",2);
//        System.out.println(contoFullConstructor.getName());
//        System.out.println("Saldo iniziale " + contoFullConstructor.getBalance());
//        contoFullConstructor.addMoney(20);
//        System.out.println("Saldo attuale= " +contoFullConstructor.getBalance());
//        contoFullConstructor.takeMoney(20);
//        System.out.println("Saldo attuale= " +contoFullConstructor.getBalance());

    }
}

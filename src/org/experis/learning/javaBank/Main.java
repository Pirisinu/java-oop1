package org.experis.learning.javaBank;

public class Main {
    public static void main(String[] args) {
        Conto conto = new Conto(23411,"asddfa",2);

        System.out.println(conto.getName());
        System.out.println("Saldo iniziale " + conto.getBalance());
        conto.addMoney(20);
        System.out.println("Saldo attuale= " +conto.getBalance());
        conto.takeMoney(20);
        System.out.println("Saldo attuale= " +conto.getBalance());

    }
}

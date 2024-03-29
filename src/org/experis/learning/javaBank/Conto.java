package org.experis.learning.javaBank;

import java.util.Random;

public class Conto {
    // Attributes
    private int accountNumber;
    private String name;
    private double balance;



    // Contructors
    // Required Contructor
    public Conto(String name, double balance){
        Random random = new Random();
        this.accountNumber = random.nextInt(1000) + 1;
        this.name = name;
        this.balance = balance;

    }
    // Full Contruct
    public Conto(int accountNumber, String name, double balance) {
        this.accountNumber = accountNumber;
        this.name = name;
        this.balance = balance;
    }


    // Methods
    public void addMoney(double num){
        this.balance += num;
        System.out.println("Hai depositato con successo: " + num + "euro");
    }
    public void takeMoney(double num) {
        if (this.balance >= num) {
            this.balance -= num;
            System.out.println("Hai prelevato: " + num + " euro");
        } else {
            System.out.println("Non puoi prelevare: non hai abbastanza soldi disponibili!");
        }
    }

    // Getter e Setter

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}

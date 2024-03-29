package org.experis.learning.javaShop;

public class Main {
    public static void main(String[] args) {
        Prodotto prodotto = new Prodotto("gigi","afsfafafasf",10,20);
        Prodotto prodotto2 = new Prodotto("alberto","blablbla",50,2);

        System.out.println("Prodotto 1 " + prodotto.getName());
        System.out.print("|| NOME " + prodotto.getCode());
        System.out.print("|| DESCRIZIONE " + prodotto.getDescription());
        System.out.print("|| PREZZO " + prodotto.getPrice());
        System.out.print("|| PREZZO IVATO " + prodotto.getIvaPrice());
        System.out.print("|| FULL-NAME " + prodotto.getFullName());

        System.out.println("Prodotto 2 " + prodotto2.getName());
        System.out.print("|| NOME " + prodotto2.getCode());
        System.out.print("|| DESCRIZIONE " + prodotto2.getDescription());
        System.out.print("|| PREZZO " + prodotto2.getPrice());
        System.out.print("|| PREZZO IVATO " + prodotto2.getIvaPrice());
        System.out.print("|| FULL-NAME " + prodotto2.getFullName());
    }
}

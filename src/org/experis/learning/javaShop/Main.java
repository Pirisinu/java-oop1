package org.experis.learning.javaShop;

public class Main {
    public static void main(String[] args) {
        Prodotto prodotto = new Prodotto("gigi","afsfafafasf",10,2);

        System.out.println(prodotto.getName());
        System.out.println(prodotto.getCode());
        System.out.println(prodotto.getDescription());
        System.out.println(prodotto.getPrice());
        System.out.println(prodotto.getIvaPrice());
        System.out.println(prodotto.getFullName());
    }
}

package org.experis.learning.javaShop;

import java.util.Random;

public class Prodotto {
    // Attributes
    private int productCode;
    private String productName;
    private String productDescription;
    private int productPrice;
    private int iva;

    // Constructors
    public Prodotto(String productName, String productDescription, int productPrice, int iva) {
        Random random = new Random();
        productCode = random.nextInt(1000000000);
        this.productName = productName;
        this.productDescription = productDescription;
        this.productPrice = productPrice;
        this.iva = iva;
    }

    // Class Methods
}

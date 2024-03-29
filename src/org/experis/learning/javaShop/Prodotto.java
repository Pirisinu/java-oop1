package org.experis.learning.javaShop;

import java.text.DecimalFormat;
import java.util.Random;

public class Prodotto {
    // Attributes
    private int productCode;
    private String productName;
    private String productDescription;
    private double productPrice;
    private int iva;
    DecimalFormat euroFormatter = new DecimalFormat("0.00 €");


    // Constructors
    public Prodotto(String productName, String productDescription, double productPrice, int iva) {
        Random random = new Random();
        productCode = random.nextInt(1000000000);
        this.productName = productName;
        this.productDescription = productDescription;
        this.productPrice = productPrice;
        this.iva = iva;
    }

    public String getName(){
        return this.productName;
    }
    public String getDescription(){
        return this.productDescription;
    }
    public int getCode(){
        return this.productCode;
    }
    // Class Methods
    public String getPrice(){
        return this.euroFormatter.format(this.productPrice);
    }

    public String getIvaPrice(){
        double ivaPrice =  this.productPrice + (this.productPrice * this.iva) / 100;
        return this.euroFormatter.format(ivaPrice);
    }

    public String getFullName(){
    return null;
    }
}

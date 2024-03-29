package org.experis.learning.javaShop;

import java.text.DecimalFormat;
import java.util.Random;

public class Prodotto {
    // Attributes
    private int code;
    private String name;
    private String description;
    private double price;
    private int iva;
    DecimalFormat euroFormatter = new DecimalFormat("0.00 €");
    DecimalFormat codeFormatter = new DecimalFormat("000000000");


    // Constructors
    public Prodotto(String productName, String productDescription, double productPrice, int iva) {
        Random random = new Random();
        code = random.nextInt(1000000000);
        this.name = productName;
        this.description = productDescription;
        this.price = productPrice;
        this.iva = iva;
    }

    // Getter
    public String getName(){
        return this.name;
    }
    public String getDescription(){
        return this.description;
    }
    public int getCode(){
        return this.code;
    }
    // Class Methods
    public String getPrice(){
        return this.euroFormatter.format(this.price);
    }

    public String getIvaPrice(){
        double ivaPrice =  this.price + (this.price * this.iva) / 100;
        return this.euroFormatter.format(ivaPrice);
    }

    public String getFullName(){
        String codeFormatted = this.codeFormatter.format(this.code);
    return codeFormatted + "-" + this.name;
    }

    // Setter
    public void setName(String productName) {
        this.name = productName;
    }

    public void setDescription(String productDescription) {
        this.description = productDescription;
    }

    public void setPrice(double productPrice) {
        this.price = productPrice;
    }

    public void setIva(int iva) {
        this.iva = iva;
    }
}

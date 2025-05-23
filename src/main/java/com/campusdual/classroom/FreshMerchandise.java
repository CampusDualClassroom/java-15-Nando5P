package com.campusdual.classroom;

import java.text.SimpleDateFormat;
import java.util.Date;

public class FreshMerchandise extends Merchandise {
    private String location;
    private String client;
    private int shelf;
    private String row;
    private String section;
    private int stock;
    private Date expirationDate;

    public FreshMerchandise(String name, String location, String client, int shelf, String row, String section, int stock, Date expirationDate) {
        super(name); // Solo podemos pasar el nombre al padre
        this.location = location;
        this.client = client;
        this.shelf = shelf;
        this.row = row;
        this.section = section;
        this.stock = stock;
        this.expirationDate = expirationDate;
    }

    public Date getExpirationDate() {
        return expirationDate;
    }

    public String getFormattedDate(Date date) {
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
        return formatter.format(date);
    }

    @Override
    public String getSpecificData() {
        StringBuilder sb = new StringBuilder();
        sb.append("Localización del producto: ").append(location);
        sb.append("\nFecha de caducidad: ").append(getFormattedDate(expirationDate));
        return sb.toString();
    }

    public void printSpecificData() {
        System.out.println(getSpecificData());
    }
}


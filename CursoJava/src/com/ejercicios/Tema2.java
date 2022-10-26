package com.ejercicios;

public class Tema2 {
    public static void main(String[] args) {
        float price = 37.23f;
        float totalInvoice = getTotalInvoice(price);
        System.out.println(totalInvoice);
    }

    static float getTotalInvoice(float price) {
        return price * 1.21f;
    }
}

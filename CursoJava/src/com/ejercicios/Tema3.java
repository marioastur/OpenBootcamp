package com.ejercicios;

public class Tema3 {
    public static void main(String[] args) {
        String[] diasSemana = {"Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo"};
        String frase = "";
        for (String dia: diasSemana) {
            frase += dia + " ";
        }
        System.out.println(frase);
    }
}

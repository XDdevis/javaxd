package Ejercicios3;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        double pesetas,euros;
        System.out.println("ingresa la cantidad de pesetas a convertir");
        pesetas = teclado.nextDouble();
        euros = pesetas / 4.20;
        System.out.println("la acantidad de euros seria de "+euros);
    }
}
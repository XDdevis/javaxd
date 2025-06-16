package Ejercicios3;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
         Scanner s = new Scanner(System.in);
       
        System.out.println("Ingrese 2 numeros separados por un espacio");

        int num1 = s.nextInt();
        int num2 = s.nextInt();

        int multiplicacion = (num1*num2);
        System.out.println("La multiplicacion de los 2 numeros es:"+multiplicacion);
    }
}

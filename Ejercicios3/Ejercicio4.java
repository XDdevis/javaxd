package Ejercicios3;

import java.util.Scanner;

public class Ejercicio4 {
     public static void main(String[] args) {
         Scanner s = new Scanner(System.in);
       
        System.out.println("Ingrese 2 numeros separados por un espacio");

        int num1 = s.nextInt();
        int num2 = s.nextInt();

        int suma = (num1+num2);
        int resta = (num1-num2);
        int multiplicacion = (num1*num2);
        int divicion = (num1/num2); 

        System.out.println("La suma de los 2 numeros es:"+suma);
        System.out.println("La resta de los 2 numeros es:"+resta);
        System.out.println("La multiplicacion de los 2 numeros es:"+multiplicacion);
        System.out.println("La divicion de los 2 numeros es:"+divicion);
    }
}

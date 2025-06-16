package Ejercicios3;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
         Scanner s = new Scanner(System.in);
       
        System.out.println("Ingrese la medida de la base del triangulo");

        int num1 = s.nextInt();

        System.out.println("Ingrese la medida de la altura del triangulo");

        int num2 = s.nextInt();

        int area = (num1*num2)/2;
        System.out.println("El area del triangulo es:"+area);
    }
}


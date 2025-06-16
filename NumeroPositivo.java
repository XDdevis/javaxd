public class NumeroPositivo {
    public static void main(String[] args) {
        int Numero;

        System.out.println("Por favor. ingrese un numero" );
        Numero  = Integer.parseInt(System.console().readLine());

        if (Numero > 0) {
            System.out.println("El numero ingresado es positivo");
        }  else {
            System.out.println("El numero ingresao es negativo");
        }
        }
    }
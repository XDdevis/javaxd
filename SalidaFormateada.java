public class SalidaFormateada {

    public static void main(String[] args) {
        System.out.printf("El numero %f no tiene deciales. \n", 21);
        System.out.printf("El nuemero %f tirne decimales. \n" , 21.0);
        System.out.printf("El numero %,2f tiene dos decimales. \n" , 21.0);
    }
}
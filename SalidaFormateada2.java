public class SalidaFormateada2 {
    public static void main(String[] args) {
        System.out.println( "Articulo\tPrecio\tN° Cajas");
        System.out.println("--------\t------\t--------");
        System.out.printf("%-10s\t%8.2f\t%6d\n", "manzana",4.5,10);
         System.out.printf("%-10s\t%8.2f\t%6d\n", "mandarina",2.5,10);
          System.out.printf("%-10s\t%8.2f\t%6d\n", "uva",7.20,10);

    }
}

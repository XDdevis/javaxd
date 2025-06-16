public class ComparacionCadenna {
   public static void main(String[] args) {
    String mifruta = "manzana";
    System.out.println("Ingrese la fruta de su preferencia: ");
    mifruta = System.console().readLine();
    if ("manzana".equals(mifruta)) {
        System.out.println("iguales");
    } else {
        System.out.println("distimtas");
    }
   }
}

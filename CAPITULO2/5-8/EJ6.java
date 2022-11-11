/* Pablo Arroyo Maqueda  EJ6.java

*/

public class Ej6 {

  public static void main(String args[]) {
    double sin_iva = 11.51;
    String parentesis = "(";
    String parentesis_dos = ")";

    System.out.printf("%-10s %-13s %s\n", "Producto", "cantidad", "precio");
    System.out.println("=================================");
    System.out.printf("%-13s %-8d %.2f %s\n", "Manzanas", 5, 2.31, "euros");
    System.out.printf("%-13s %-8d %.2f %s\n", "Peras", 3, 2.20, "euros");
    System.out.printf("%-13s %-10s %d %s\n", "Platanos", 6, 6, "euros");
    System.out.println("=================================");
    System.out.println(
      "Total----------------> " +
      sin_iva +
      " euros" +
      parentesis +
      "PVP sin IVA" +
      parentesis_dos
    );
  }
}

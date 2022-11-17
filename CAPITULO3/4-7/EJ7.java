/**
 * 
 *
 *  Escribe un programa que calcule el total de una factura a partir
 *    de la base imponible.
 *
 * @author Pablo Arroyo
 */
public class EJ7 {
    public static void main(String[] args) {
      System.out.print("Por favor, introduzca la base imponible: ");
      double baseImponible = Double.parseDouble(System.console().readLine());
  
      System.out.printf("\nBase imponible %8.2f €\n", baseImponible);
      System.out.printf("IVA (21%%)      %8.2f €\n", (baseImponible * 0.21));
      System.out.printf("Total          %8.2f €\n", (baseImponible * 1.21));
    }
  }
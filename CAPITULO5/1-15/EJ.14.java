/**
 * @author Pablo Arroyo
 */
import java.util.Scanner;
public class EJ.14 {
    public static void main(String[] args) {
    Scanner s=new Scanner (System.in);

        
        System.out.print("Indica la base: ");
        int base = s.nextInt();
        
        System.out.print("Indica el exponente: ");
        int exponente = s.nextInt();
        
        int total = 0;
        
        if (exponente == 0) {
          total = 1;
        } else if ((exponente == 1) || (exponente == -1)) {
          total = base;
        } else if (exponente > 1) {
          for (int i = 2; i <= exponente; i++) {
            if (i == 2) {
              total = base;
            } else {
              total *= base;
            }
          }//for
        } else {
          for (int i = -2; i >= exponente; i--) {
            if (i == -2) {
              total = base;
            } else {
              total *= base;
            }
          }
        }
        if (exponente >= 0) {
          System.out.println("El resultado de la potencia es: " + total);
        } else {
          System.out.println("El resultado de la potencia es: " + "1/" + total);
        }
      }
}

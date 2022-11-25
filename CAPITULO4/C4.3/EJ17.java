/**
 * 
 *Ultima cifra
 *
 * @author Pablo Arroyo
 */
import java.util.Scanner;
public class EJ17 {

    public static void main(String[] args) {
        Scanner s=new Scanner (System.in);
      System.out.print(" introduce un numero entero: ");
      int n=s.nextInt();
      System.out.println("La última cifra del número es  " + (n % 10));
      s.close();
    }
  }
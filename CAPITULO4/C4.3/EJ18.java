/**
 * 
 *
 * @author Pablo Arroyo
 */
import java.util.Scanner;
public class EJ18 {

    public static void main(String[] args) {
        Scanner s=new Scanner (System.in);
        int n, cifra = 0;
     
      System.out.print("INTRODUCE UN NUMERO DE MAXIMO 5 CIFRAS: ");
       n=s.nextInt();
      
      if ( n < 10 ) {
        cifra = n;
      }
      
      if (( n >= 10 ) && ( n < 100 )) {
        cifra = n / 10;
      }
      
      if (( n >= 100 ) && ( n < 1000 )) {
        cifra = n / 100;
      }
      
      if (( n >= 1000 ) && ( n < 10000 )) {
        cifra = n / 1000;
      }
      
      if ( n >= 10000 ) {
        cifra = n / 10000;
      }
      
      System.out.println("La primera cifra del número introducido es el " + cifra + ".");
      s.close();
    }
  }
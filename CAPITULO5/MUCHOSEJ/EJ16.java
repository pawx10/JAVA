/**
 * @author Pablo Arroyo 
 */
import java.util.Scanner;
public class EJ16 {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
    

        int n = s.nextInt();
        int prueba = 0;
        int cont = 0;
        int i = 0;
        
          do {
            i++;
            prueba = n % i;
            
            if (prueba == 0) {
              cont++;
            } else {
             
            }
            
          } while (i != n);
          
          if (cont == 2) {
            System.out.print("El número es primo");
          } else {
            System.out.print("El número no es primo");
          }
          s.close();
    }
    
}

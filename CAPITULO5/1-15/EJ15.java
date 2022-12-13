/**
 * @author Pablo Arroyo
 */
import java.util.Scanner;
public class EJ15 {
    public static void main(String[] args) {
        Scanner s= new Scanner (System.in);
    

        
        System.out.print("Indica una base: ");
        int base =s.nextInt();
        
        System.out.print("Indica un exponente: ");
        int exponente = s.nextInt();
        
        for (int i = 1; i <= exponente; i++) {
          System.out.print(base + "^" + i + ", ");
        }
        s.close();
      }
    
}

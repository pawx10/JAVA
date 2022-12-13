/**
 * @author Pablo Arroyo
 * 
 */
import java.util.Scanner;
public class EJ11 {
    public static void main(String[] args) {
        Scanner s=new Scanner (System.in);
        System.out.print("Introduce un número: ");
        int nint=s.nextInt();
    
        System.out.println("   n  |    n²   |    n³");
        for (int i = nint; i < nint + 5; i++) {
          System.out.printf("%5d |%8d |%9d\n", i, i * i, i * i * i);
        }
        s.close();
      }
    
}

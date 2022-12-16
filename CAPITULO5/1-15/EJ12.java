/**
 * @author Pablo Arroyo 
 */
import java.util.Scanner;
public class EJ12 {
public static void main(String[]args){
Scanner s=new Scanner(System.in);  
    int a = 0;
    int b = 1;
    int c = 0;
    
    System.out.print("Indique cuántos números desea que se muestren ");
    int n=s.nextInt();
    
    for (int i = 1; i <= n; i++) {
      if (i == 1) {
        System.out.print(a + ", ");
      } else if (i == 2) {
        System.out.print(b + ", ");
      } else {
        System.out.print((a + b) + ", ");
        c = b;
        b += a;
        a = c;
      }
    }
    s.close();
  }
    
}

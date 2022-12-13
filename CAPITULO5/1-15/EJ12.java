/**
 * @author Pablo Arroyo 
 */
import java.util.Scanner;
public class EJ12 {
public static void main(String[]args){
Scanner s=new Scanner(System.in);  
    int f1 = 0;
    int f2 = 1;
    int fA = 0;
    
    System.out.print("Indique cuántos números desea que se muestren ");
    int n=s.nextInt();
    
    for (int i = 1; i <= n; i++) {
      if (i == 1) {
        System.out.print(f1 + ", ");
      } else if (i == 2) {
        System.out.print(f2 + ", ");
      } else {
        System.out.print((f1 + f2) + ", ");
        fA = f2;
        f2 += f1;
        f1 = fA;
      }
    }
    s.close();
  }
    
}

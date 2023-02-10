import misFunciones.Varias;
import java.util.Scanner;
public class EJ1 {
   public static void main(String[] args) {
    Scanner s=new Scanner (System.in);
    System.out.println(" Introduce 2 numeros");
    double a=s.nextInt();
    int b=s.nextInt();
    double n=Varias.mutiplicar(a, b);
    System.out.println(n);
   
    s.close();  
   }
    
    
}

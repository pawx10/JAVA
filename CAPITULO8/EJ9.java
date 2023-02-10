
import java.util.Scanner;
public class EJ9 {
    public static void main(String[] args) {
     Scanner s = new Scanner(System.in);
     int num1,num2,num3= 0;
     int a=0;
     int b=0;
     System.out.println(" Introduce 3 numeros ");
      num1= s.nextInt();
      num2= s.nextInt();
      num3= s.nextInt();
     if(num1>num2){
         a=num1;
     }else{a=num2;}
     if(num3>a){
        b=num3;
     }
    int resultado=(misFunciones.Varias.mayorDeDos(a, b));
    System.out.println(" El mayor numero es "+ resultado);
    }
}

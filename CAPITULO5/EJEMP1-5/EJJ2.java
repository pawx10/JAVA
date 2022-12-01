/**
 * 
 * @author
 * Programa que muestre por pantalla los números naturales hasta un valor introducido por teclado.
 */
import java.util.Scanner;
public class EJJ2 {
    public static void main(String[]arga){
        Scanner s= new Scanner(System.in);
        System.out.print("Dime un numero ");
        int num= s.nextInt();
        for (int i=0;i<=num;i++){

            System.out.println(i);
            s.close();
        }


    }
    
}

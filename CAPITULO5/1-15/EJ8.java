/**
 * @author Pablo Arroyo
 * Muestra la tabla de multiplicar de un número introducido por teclado.

 */
import java.util.Scanner;
public class EJ8 {
    public static void main(String[]args){
        Scanner s=new Scanner (System.in);
        int n;
        int i;
        i=0;
        System.out.print(" Introduce un numero ");
        n=s.nextInt();
        System.out.println("Tabla del " + n);
        while (i<=10){
                     System.out.println(n + " * " + i + " = " + n*i);  
                     i++;
             s.close();    
        }


        }

        }

    
    


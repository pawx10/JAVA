/**
 * @author Pablo Arroyo
 * Escribe un programa que calcule la media de un conjunto de números positivos
introducidos por teclado. A priori, el programa no sabe cuántos números se
introducirán. El usuario indicará que ha terminado de introducir los datos
cuando meta un número negativo
 */
import java.util.Scanner;
public class EJ10 {
    public static void main(String[]args){
        Scanner s=new Scanner (System.in);
        double media=0;
        int i=0;
        double n=0;
        while (n>=0){
            System.out.println("Introduce un numero");

            n=s.nextInt();
            i++;
           
          
            media+=n;
            

        }
       s.close();
        System.out.print(" La media es: ");
        System.out.println(((media-n)/(i-1)));
        

    }
    
}

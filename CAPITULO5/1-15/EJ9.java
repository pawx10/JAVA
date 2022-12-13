/**
 * @author Pablo Arroyo
 * Realiza un programa que nos diga cuántos dígitos tiene un número introducido
por teclado. Este ejercicio es equivalente a otro realizado anteriormente, con
la salvedad de que el anterior estaba limitado a números de 5 dígitos como
máximo. En esta ocasión, hay que realizar el ejercicio utilizando bucles; de
esta manera, la única limitación en el número de dígitos la establece el tipo de
dato que se utilice (int o long).

 */
import java.util.Scanner;
public class EJ9 {
    public static void main(String[]args){
        Scanner s= new Scanner (System.in);
        System.out.print(" Introduce un numero ");
        long n=s.nextLong();
        int digitos= 1;
        while (n>10){
            digitos++;
            n/=10;
            

        }
        System.out.println(" El numero "+n+" tiene " +digitos+" digitos" );
        s.close(); 
    }

}

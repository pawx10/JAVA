/**
 * @author Pablo Arroyo
 * Escribe un programa que lea una lista de diez números y determine cuántos
son positivos, y cuántos son negativos.
 */
import java.util.Scanner;
public class EJ13 {
    public static void main(String[]args){
        Scanner s=new Scanner (System.in);
        int n=0;
        int neg=0;
        int pos=0;
        int i=1;
        while (i<=10){
        System.out.print(" Escribe un numero positivo o negativo: ");
         n=s.nextInt();
         
        i++;
           if(n<0){
            neg++;
        }
        else{
            pos++;
        }
     
        }
        System.out.print(" Los numeros positivos son "+pos);
        System.out.print(" Los numeros negativos son "+neg);
        s.close();
    }
    
}

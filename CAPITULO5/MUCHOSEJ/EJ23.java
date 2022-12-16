import java.util.Scanner;
/**
 * Escribe un programa que permita ir introduciendo una serie indeterminada
de números mientras su suma no supere el valor 10000. Cuando esto último
ocurra, se debe mostrar el total acumulado, el contador de los números
introducidos y la media.
@author Pablo Arroyo
 */
public class EJ23 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
       int suma=0;
       int contador=0;
        do{
            System.out.print(" Ve introduciendo numeros: ");
            int num=s.nextInt();
            contador++;
            suma=num+=num;
        }while (suma<=1000);
        System.out.print(" El total es "+suma);
        System.out.print(" El total de numeros introducidos es "+contador);
        System.out.print(" La media es: "+suma/contador);

        s.close();
    }
    
}

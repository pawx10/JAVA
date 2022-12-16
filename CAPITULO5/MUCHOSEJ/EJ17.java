
/**
 * @author Pablo Arroy
 * Realiza un programa que sume los 100 números siguientes a un número entero
y positivo introducido por teclado. Se debe comprobar que el dato introducido
es correcto (que es un número positivo).

 */
import java.util.Scanner;
public class EJ17 {
    public static void main (String[]args){
    Scanner s=new Scanner(System.in);
    int num=0;
    int suma=0;
    do{
      System.out.print(" Introduce un numero entero positivo: ");
      num=s.nextInt();
      if(num<0){
        System.out.print(" Debes introducir un numero entero y positivo");
      }
    }
    while(num<0);
    for(int i=0; i<100;i++){
      suma +=num;
      num++;
    }
    System.out.print(" La suma es "+suma);
   
s.close();
    }
}
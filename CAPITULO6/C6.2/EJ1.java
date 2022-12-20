/**
 * @author Pablo Arroyo
 * Escribe un programa que muestre la tirada de tres dados. Se debe mostrar
también la suma total (los puntos que suman entre los tres dados).
 */
import java.util.Scanner;
public class EJ1{
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int cont=0;
        int tirada;
        int sumd=0; //suma de las tiradas
       while(cont<3){ 
        tirada=((int)(Math.random()*6)+1); //genera el num
        System.out.println(tirada); //escribe el numero generado
        
        sumd=sumd+tirada; //suma la tirada al contador de la suma
        
      
         cont++;
       }
       System.out.println("La suma de las tiradas es: "+sumd); //Escribe la suma
       s.close(); //Cierra el scanner
     }
}

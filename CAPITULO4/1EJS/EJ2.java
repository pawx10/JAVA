/**
*pide hora
*@author Pablo Arroyo
 */

import java.util.Scanner;
public class EJ2 {
    public static void main(String args[]) {
        Scanner s=new Scanner(System.in);
        System.out.print(" Introduce una hora ");
        int hora=s.nextInt();
        if ((hora >=6)&&(hora <=12)){
            System.out.print(" Buenos dias ");
        }
        if ((hora >=13)&&(hora <=20)){
            System.out.print(" Buenas tardes");
        }
        if ((hora>=21)&&(hora<=24)){
            System.out.print(" Buenas noches");
        }
    
        if ((hora>=1)&&(hora<=5)){
         System.out.print(" Buenas noches");
        }
  
        s.close();//*Esto es para que no de fallo de no cerrar s:Linea amarilla */
    }
}

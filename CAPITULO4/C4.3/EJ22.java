/**
 * Realiza un programa que, dado un día de la semana (de lunes a viernes) y una
hora (horas y minutos), calcule cuántos minutos faltan para el fin de semana.
Se considerará que el fin de semana comienza el viernes a las 15:00h. Se da
por hecho que el usuario introducirá un día y hora correctos, anterior al viernes
a las 15:00h.
*@author Pablo Arroyo
 */
    import java.util.Scanner;
public class EJ22 {
    public static void main(String[] args) {
        Scanner s=new Scanner (System.in);
       
        System.out.print(" Introduce un dia : ");
       String dia=s.next();
      
       System.out.print(" Introduce la hora: ");
       int hora=s.nextInt();
       System.out.print(" Introduce los minutos: ");
       int min=s.nextInt();

      
       int dianum= 1;

        switch (dia){  
            case "lunes": 
            dianum=1;
            break;
            case "martes": 
            dianum=2;
            break;
            case "miercoles": 
            dianum=3;
            break;
            case "jueves": 
            dianum=4;
            break;
            case "viernes": 
            dianum=5;
            break;
            default: System.out.print("Ese dia no vale ");




        }
        int mintotal=(4*24*60)+(15*60);
        int minactuales = (dianum * 24 * 60) + (hora * 60) + min;
        System.out.print(" Faltan "+(mintotal-minactuales)+" minutos hasta el finde");
s.close();
    }
}

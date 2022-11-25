/**
 * Segundos para media noche
 * @author Pablo Arroyo
 */
import java.util.Scanner;
public class EJJ11 {
public static void main(String[]args){  
Scanner s =new Scanner(System.in);
int segtranscurridos;
int seghasta;
System.out.print(" Dime la hora sin minutos ");
int hora=s.nextInt();
System.out.print(" Dime los minutos ");
int minutos=s.nextInt();
segtranscurridos=(hora*3600)+(minutos*60);
seghasta=(24*3600)-segtranscurridos;
System.out.print("  Desde las "+hora+" y "+minutos+" quedan "+seghasta+ " segundos hasta medianoche");
s.close();
}
}

import java.util.Scanner;
/**
 * Escribe un programa que calcule el volumen de un cono según la fórmula V =
1
3
πr2h
*@author Pablo Arroyo
 */
public class EJ9 {
  public static void main(String[]args){;  
  Scanner s= new Scanner(System.in);
  System.out.print( "Dime la altura del cono (h): ");
  int altura =s.nextInt();
  System.out.print( "Dime el radio: ");
  int radio =s.nextInt();
  System.out.print("El volumen del cono es: "+(3.14*(radio*radio)*altura)/3);
  s.close();
}
}

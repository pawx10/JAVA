/** 
 * 
 * @author Pablo Arroyo
 * piramide
 */
import java.util.Scanner;
public class EJ15 {
public static void main(String[]args){
     Scanner s=new Scanner(System.in);
    System.out.print("Introduce un carácter : ");
   
    String z =s.next();
    System.out.println("Elije la orientacion de la pirámide");
    System.out.println(" vértice hacia arriba");
    System.out.println(" vértice hacia abajo");
    System.out.println(" vértice hacia la izquierda");
    System.out.println(" vértice hacia la derecha");
    int piramide =s.nextInt();

    switch(piramide) {
      case 1:
        System.out.println("  " + z);
        System.out.println(" " + z + z + z);
        System.out.println(z + z + z + z + z);
        break;
      case 2:
        System.out.println(z + z + z + z + z);
        System.out.println(" " + z + z + z);
        System.out.println("  " + z);
        break;
      case 3:
        System.out.println("    " + z);
        System.out.println("  " + z + " " + z);
        System.out.println(z + " " + z + " " + z);
        System.out.println("  " + z + " " + z);
        System.out.println("    " + z);
        break;
      case 4:
        System.out.println(z);
        System.out.println(z + " " + z);
        System.out.println(z + " " + z + " " + z);
        System.out.println(z + " " + z);
        System.out.println(z);
        break;
} ;
s.close();

  
}
}
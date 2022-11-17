import java.util.Scanner;
/**
*Conversor Kb a Mb
*@author Pablo Arroyo
 */
public class EJ11 {
  public static void main(String[]args){;  
  Scanner s = new Scanner(System.in);
  System.out.print( "Dime los Kb ");
  double mb=s.nextInt();
  System.out.print( +mb+" Kb Son: "+mb/1000+" Mb");
  

}
}
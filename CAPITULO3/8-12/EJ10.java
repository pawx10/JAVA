import java.util.Scanner;
/**
*Conversor Mb a Kb
*@author Pablo Arroyo
 */
public class EJ10 {
  public static void main(String[]args){;  
  Scanner s = new Scanner(System.in);
  System.out.print( "Dime los Mb ");
  double mb=s.nextInt();
  System.out.print( +mb+" Mb Son: "+mb*1000+" Kb");
  
  s.close();
}
}
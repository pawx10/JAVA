import java.util.Scanner;
/**
*Conversor Kb a Mb
*@author Pablo Arroyo
 */
public class EJ12 {
    public static void main(String[]args){;  
    Scanner s = new Scanner(System.in);
    System.out.print( "Introduce la nota del primer examen: ");
    double nota1=s.nextInt();
    System.out.print( "¿Qué nota quieres sacar en el trimestre?: ");
    double qui=s.nextInt();
    double nota2= ((qui*100)-(nota1*40))/60;
    System.out.println("Para tener un " + qui + " en el trimestre");
    System.out.println(" necesita sacar un " + nota2 + " en el segundo examen.");
    s.close();
}
}

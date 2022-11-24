/**
 * Calcula  media de 3 notas
 *@author Pablo Arroyo
 **/




import java.util.Scanner;

public class EJ7 {
public static void main(String[]args){;
    Scanner s=new Scanner(System.in);
    System.out.print(" Introduce la primera nota ");
    double nota1=s.nextDouble();
    System.out.print(" Introduce la segunda nota ");
    double nota2=s.nextDouble();
    System.out.print(" Introduce la tercera nota ");
    double nota3=s.nextDouble();
    double media;
    media= (nota1+nota2+nota3)/3;
    System.out.printf(" La media de las notas es: %.2f",media);
    s.close();/*Para que no de linea amarilla */






}
    
}   


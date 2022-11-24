/**
 * Calcula  media de 3 notas y decir que tal
 *@author Pablo Arroyo
 **/




import java.util.Scanner;

public class EJ8 {
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
    if ((media>=0)&&(media<=4)){
        System.out.print(" Tienes un insuficiente");
    }
    if ((media>=5)&&(media<6)){
        System.out.print(" Tienes un suficiente");
    }
    if ((media>=6)&&(media<7)){
        System.out.print(" Tienes un  bien");

    }
    if ((media>=7)&&(media<=8)){
        System.out.print(" Tienes un notable");
    }    
    if ((media>=9)&&(media<=10)){
        System.out.print(" Tienes un sobresaliente");
    }
    s.close();/*Para que no de linea amarilla */
}
}
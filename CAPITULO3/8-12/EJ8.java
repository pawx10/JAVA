import java.util.Scanner;
/**
 * Escribe un programa que calcule el salario semanal de un empleado en base a
las horas trabajadas, a razón de 12 euros la hora.
*@author Pablo Arroyo
 */
public class EJ8 {
 public static void main(String[]args) {
Scanner s= new Scanner(System.in);
System.out.print( "Escribe cuantas horas has trabajado esta semana: ");
int horas =s.nextInt();
System.out.print( "Tu salario de esta semana es:"+horas*12);

s.close();



 } 
  
}

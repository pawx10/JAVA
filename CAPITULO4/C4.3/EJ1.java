/*
 * Horario
 * @author Pablo Arroyo
 */
import java.util.Scanner;
public class EJ1 {
public static void main(String[]args){
Scanner s=new Scanner(System.in);
System.out.print(" Introduce un dia ");
int dia=s.nextInt();
String asig;
asig=" ";
switch (dia){
case 1:
asig="FOL";  
break;
case 2:
asig="Bases";
break;
case 3:
asig="Bases";
break;
case 4:
asig="Sist";
break;
case 5:
asig="LM";
break;
}
System.out.print(" El dia " +dia+" tienes "+asig+ " a primera");
s.close();
} 
}

/**
 * 
 * @author Pablo Arroyo
 * NUmero par o divisible por 5
 */
import java.util.Scanner;
public class EJ14 {
public static void main(String[]args){
Scanner s=new Scanner (System.in);
System.out.print(" Dime un numero ");
int num=s.nextInt();
if ((num % 2) == 0){
System.out.print(" El numero es par");
}else{
System.out.print(" El numero es impar ");
}
if ((num % 5) ==0){
System.out.print(" Es divisible entre 5");
}else{
System.out.print(" No es divisible entre 5");

}
s.close();
}   
}

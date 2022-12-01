/**
 * 
 * @author
 * 
 * Realiza un programa que calcule y muestre por pantalla el valor de A elevado a B 
 * (sin usar el operador potencia ni método de Math). Serán leídos por pantalla los números A y B.   

 */
import java.util.Scanner;
public class EJJ5 {
public static void main(String[]args){
    Scanner s=new Scanner(System.in);
    System.out.print(" A= ");
    int a=s.nextInt();
    System.out.print(" B= ");
    int b=s.nextInt();
    
    int elevar=1;
    
    for (int i=1;i<=b;i++){
    elevar=elevar*a;
    


}
System.out.print("A elevado a B es: "+elevar);
s.close();
}    
}

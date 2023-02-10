import misFunciones.Varias;
import java.util.Scanner;
public class EJ2 {
    public static void main(String[] args) {
      Scanner s=new Scanner (System.in);  
        System.out.println(" Introduce tu edad ");
        int edad=s.nextInt();
        
        if(Varias.esMayorEdad(edad)){
          System.out.println(" Eres mayor de edad");
        }else{System.out.println("No eres mayor de edad.");}
        s.close();  
    }
}

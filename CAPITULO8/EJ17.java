import java.util.Scanner;
public class EJ17 {
    public static void main (String[] args){
        Scanner s = new Scanner(System.in);
        int num;

        System.out.println("Introduce números enteros ");
        System.out.println("Pulsa 0 para salir: ");

        do {                       
            num = s.nextInt();                               
            if (num != 0){              
                if (Varias.esPrimo(num)) {                                     
                    System.out.println ("El número " + num + " es primo.");
                }else {
                    System.out.println ("El número " + num + " no es primo.");
                }
            }
        } while (num != 0); //Se comprueba que sea diferente a 0

    s.close();
    }
}

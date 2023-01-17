
/**
 * InnerEJ3
 */
import java.util.Scanner;

public class EJ3 {
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        int i;
        int [] num=new int [10] ;
        
        
        for ( i=0;i<10;i++){
            System.out.println(" Introduce un numero");
        num [i] =sc.nextInt();
        
       
    }
    System.out.println(" Los numeros al reves son los siguientes: ");
    for (i=9;i>=0;i--){
        System.out.println(num[i]);
    }
        sc.close();
    }
    
}

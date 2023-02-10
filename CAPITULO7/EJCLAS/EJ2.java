import java.util.Scanner;
public class EJ2 {
    public static void main(String[] args) {
        Scanner s=new Scanner (System.in);
        System.out.print(" Introduce el tamaño del array: ");
        int  t=s.nextInt();

        int [] array=new int [t];
        for(int i=0;i<t;i++){
        array[i]=(int)(Math.random()*11)+50;
        System.out.print(array[i]+", ");
    }
        
    }
    
}

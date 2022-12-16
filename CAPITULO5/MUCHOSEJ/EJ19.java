import java.util.Scanner;
public class EJ19 {
    public static void main(String[]args){
        Scanner s= new Scanner (System.in);
        System.out.print(" Introduce la altura ");
        int altura= s.nextInt();
        System.out.print(" Introduce el relleno ");
        String relleno= s.next();
        int planta=1;
        int blanco= altura-1;
        while (planta<=altura){
            for(int b=1;b<=blanco;b++){
                System.out.print(" ");
            }
            for (int r=1; r<=2*planta-1; r++){
                System.out.print(relleno);

            }
            planta++;
            blanco--;
            System.out.println();
        }


    }

}
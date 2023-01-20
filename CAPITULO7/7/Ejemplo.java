import java.util.Scanner;
public class Ejemplo {
    public static void main(String[]args){
        Scanner s=new Scanner (System.in);

        int[]num=new int [10];

        num[0]= (int) Math.pow (2,0);
        num[1]= (int) Math.pow (2,1);
        num[2]= (int) Math.pow (2,2);
        num[3]= (int) Math.pow (2,3);
        num[4]= (int) Math.pow (2,4);
        num[5]= (int) Math.pow (2,5);
        num[6]= num[2]*10;
        num[7]= num[2]/10;
        num[8]= num[0] + num[1] + num [2];
        num[9]= num[8];

        for (int i=0;i<10;i++){
            System.out.println(num[i]);
        }
        System.out.println("Introduce un numero del 0 al 9");
        int n=s.nextInt();
        System.out.println(" El numero que esta en esa posicion es "+num[n]);
        int nump=(num[2]+num[4]+num[6]+num[8]);
        System.out.println("La suma de los numeros pares es: "+nump);






    
s.close();
        
    }
}

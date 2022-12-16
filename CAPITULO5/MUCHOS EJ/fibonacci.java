import java.util.Scanner;
public class fibonacci {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        
        int k=0;
        int a=1;
        int b=1;
        System.out.print(" Introduce un numero ");
        int n=s.nextInt();
        System.out.print (" 1  1 ");
        while (k<=n){
            k=a+b;
            System.out.print(k+" ");
            a=b;
            b=k;
        }
s.close();

 

        
        
    }
        
    }
    


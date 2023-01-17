import java.util.Scanner;
public class EJ7 {
    public static void main(String[] args) {
        
        int [] num=new int [100];
        int valor1;
        int valor2;
        int i;
        for (i=0;i<100;i++){
        num[i]=(int)(Math.random()*21);
        System.out.print(num[i]+" ");
        }
        Scanner s=new Scanner(System.in);
        System.out.println("\n Introduce un numero");
        valor1=s.nextInt();
        System.out.println(" Introduce el numero por el que quieres sustituirlo ");
        valor2=s.nextInt();
        System.out.println();
        for (i=0;i<100;i++){
            if (num[i]==valor1){
                num[i]=valor2;
                System.out.print(" \" "+num[i]+"\" ");
            }else{
                System.out.print(" "+num[i]+" ");
            }
           
        }

         
        
    }
    
}

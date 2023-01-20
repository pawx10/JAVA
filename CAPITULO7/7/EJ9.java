import java.util.Scanner;
public class EJ9 {
    public static void main(String[] args) {
        Scanner s=new Scanner (System.in);
        int [] num=new int [8]; 
        System.out.println(" Introduce 8 numeros");
        for (int i=0;i<8;i++){
        System.out.print(i+1+": ");
        num[i]=s.nextInt();
        }
        for(int i=0;i<8;i++){
            if (num[i]%2==0){
                System.out.println(num[i]+" par");
            }else{
                System.out.println(num[i]+" impar");
            }
        }


    }
}

import java.util.Scanner;
public class EJ3 {
    
    public static void main(String[] args) {
        Scanner s=new Scanner (System.in);
        System.out.print(" Introduce el tamaño del array: ");
        int  t=s.nextInt();
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        int [] array=new int [t];
        for(int i=0;i<t;i++){
        array[i]=(int)(Math.random()*11)+50;
        if(array[i]>max){
            max=array[i];
        }
        if(array[i]<min){
            min=array[i];
        }
    }
       for(int i=0;i<t;i++){
        if(array[i]==max){
            System.out.print("*"+max+"* ");
        }  
        if(array[i]==min){
            System.out.print("+"+min+"+ ");
            
        }else{
            System.out.print(array[i]+", ");
        }
    }
    
}
}


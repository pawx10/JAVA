import java.util.Scanner;
//Escribe un programa que pida 10 números por teclado y que luego muestre los
//números introducidos junto con las palabras “máximo” y “mínimo” al lado del
//máximo y del mínimo respectivamente
public class EJ5_T6_ARRAY {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int maximo=Integer.MIN_VALUE;
        int minimo=Integer.MAX_VALUE;
        int j=10;
        int[] n;
        n=new int [j];

        for(int i=0;i<10;i++){
            System.out.println("Introduzca el numero "+i);
            n[i]=s.nextInt();
            if(n[i]>maximo){
                maximo=n[i];
            }
            if(n[i]<minimo){
                minimo=n[i];
            }
            

        }
        for(int i=0;i<10;i++){
            System.out.println("Numero "+i+" "+n[i]);
        

        }
        System.out.println("");
        System.out.println("Maximo: "+maximo);
        System.out.println("Minimo: "+minimo);
    }
}
